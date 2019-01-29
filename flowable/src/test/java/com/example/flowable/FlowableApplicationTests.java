package com.example.flowable;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlowableApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private TaskService taskService;

    @Autowired
    private RuntimeService runtimeService;

    @Test
    public void startProcessInstanceByKey(){
        Map<String, Object> map = new HashMap<>(2);
        map.put("days", 1);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("holiday", map);
        System.out.println(processInstance);
    }

    @Test
    public void getTasks(){
        List<Task> tasks = taskService.createTaskQuery().taskCandidateOrAssigned("fan").list();
        System.out.println(tasks.size());
    }

    @Test
    public void complete(){
        taskService.complete("45269733-1eed-11e9-86eb-00ac7f1a48b8");
        taskService.complete("4527337a-1eed-11e9-86eb-00ac7f1a48b8");
    }



}

