package com.example.flowable;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

/**
 * @author fandong
 * @create 2019/1/22
 */
//@Component
public class Test {

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private RuntimeService runtimeService;

    @PostConstruct
    public void test(){
        System.out.println("Number of process definitions = " + repositoryService.createProcessDefinitionQuery().count());
        System.out.println("Number of tasks = " + taskService.createTaskQuery().count());
        runtimeService.startProcessInstanceByKey("holidayRequest");
        System.out.println("Number of tasks = " + taskService.createTaskQuery().count());
    }
}
