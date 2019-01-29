package com.example.flowable;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fandong
 * @create 2019/1/29
 */
@RestController
public class TestController {

    @Autowired
    private TaskService taskService;

    @Autowired
    private RuntimeService runtimeService;

    @PostMapping("/processInstance")
    public Object startProcessInstanceByKey(@RequestParam("key") String key,
                                            @RequestParam("days") Integer days){
        Map<String, Object> map = new HashMap<>(2);
        map.put("days", days);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(key, map);
        return processInstance.getId();
    }

    @PostMapping("/task")
    public Object completeTask(@RequestBody CompleteTaskRequest completeTaskRequest){
        Map<String, Object> map = new HashMap<>(2);
        map.put("operate", completeTaskRequest.getOperate());
        taskService.complete(completeTaskRequest.getTaskId(), map);
        return null;
    }



}
