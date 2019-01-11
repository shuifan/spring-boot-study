package com.example.zookeeper;


import org.I0Itec.zkclient.IZkChildListener;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fandong
 * @create 2019/1/11
 */
@RestController
public class TestController {

    @Autowired
    private ZkClient zkClient;

    private static Logger logger = LoggerFactory.getLogger(TestController.class.getName());

    private static final String XIE_GANG = "/";

    @PostConstruct
    public void addWatch(){
        logger.info("add watch ...");
        zkClient.subscribeDataChanges("/test_node_1", new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {
                logger.info("节点：" + s + "  内容变化为：" + o);
            }


            @Override
            public void handleDataDeleted(String s) throws Exception {
                logger.info("节点删除："  + s);
            }
        });

        zkClient.subscribeChildChanges("/test_node_1", new IZkChildListener() {
            @Override
            public void handleChildChange(String s, List<String> list) throws Exception {
                logger.info("parentPath: " + s + "  currentChilds: " + list);
            }
        });
    }

    @PostMapping("/znode")
    public Object createNode(@RequestBody CreateNodeRequest createNodeRequest){
        if (createNodeRequest.getPersistent()){
            zkClient.createPersistent(createNodeRequest.getNodeName(), createNodeRequest.getNodeValue());
        }else {
            zkClient.createEphemeral(createNodeRequest.getNodeName(), createNodeRequest.getNodeValue());
        }
        return "ok";
    }

    @DeleteMapping("/znode")
    public Object deleteNode(@RequestBody DeleteNodeRequest deleteNodeRequest){
        String nodeName = deleteNodeRequest.getNodeName();
        if (deleteNodeRequest.getRecursive()){
            zkClient.deleteRecursive(nodeName);
        }else {
            zkClient.delete(nodeName);
        }
        return "ok";
    }

    @GetMapping("/znode")
    public Object getNode(@RequestParam("nodeName") String nodeName,
                          @RequestParam("recursive") Boolean recursive){
        Map<String, Object> nodeMap = new HashMap<>(16);
        Object o = zkClient.readData(nodeName, true);
        nodeMap.put(nodeName, o);
        if (recursive){
            List<String> childrens = zkClient.getChildren(nodeName);
            if (childrens != null){
                for (String s : childrens){
                    String chileNodeName = nodeName + XIE_GANG + s;
                    nodeMap.put(chileNodeName, zkClient.readData(chileNodeName, true));
                }
            }
        }
        return nodeMap;
    }

    @PutMapping("/znode")
    public Object updateNode(@RequestBody CreateNodeRequest createNodeRequest){
        zkClient.writeData(createNodeRequest.getNodeName(), createNodeRequest.getNodeValue());
        return "ok";
    }



}
