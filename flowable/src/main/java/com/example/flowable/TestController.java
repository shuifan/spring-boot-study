package com.example.flowable;

import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.MultiInstanceLoopCharacteristics;
import org.flowable.bpmn.model.Process;
import org.flowable.bpmn.model.UserTask;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

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

    @Autowired
    private RepositoryService repositoryService;

    @PostMapping("/processInstance")
    public Object startProcessInstanceByKey(@RequestParam("key") String key,
                                            @RequestParam("days") Integer days){
        //参数map
        Map<String, Object> map = new HashMap<>(4);

        ProcessDefinition processDefinition = repositoryService
                .createProcessDefinitionQuery()
                .processDefinitionKey(key)
                .latestVersion()
                .singleResult();
        String processDefinitionId = processDefinition.getId();
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
        Process process = bpmnModel.getProcesses().get(0);
        Collection<FlowElement> flowElements = process.getFlowElements();
        for (FlowElement f : flowElements){
            if (f instanceof UserTask){
                UserTask userTask = (UserTask) f;
                List<String> candidateUsersContainLabel = userTask.getCandidateUsers();
                List<String> candidateUsers = new ArrayList<>();
                for (String s :candidateUsersContainLabel){
                    List<String> labelUsers = UserObtainService.LABEL_USER_MAP.get(s);
                    if (labelUsers != null){
                        candidateUsers.addAll(labelUsers);
                    }else {
                        candidateUsers.add(s);
                    }
                }
                //传入循环次数
                MultiInstanceLoopCharacteristics loopCharacteristics = userTask.getLoopCharacteristics();
                String loopCardinalityString = loopCharacteristics.getLoopCardinality();
                String paramKey = loopCardinalityString.substring(2, loopCardinalityString.length() - 1);
                map.put(paramKey, candidateUsers.size());

                //修改候选者 将标签替换为真实的候选人
                userTask.setCandidateUsers(candidateUsers);
            }
        }


        map.put("days", days);
        System.out.println("param map = " + map);
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(key, map);
        System.out.println("definition id = " + processInstance.getProcessDefinitionId());
        System.out.println("definition key = " + processInstance.getProcessDefinitionKey());
        return processInstance.getId();
    }

    @PostMapping("/task")
    public Object completeTask(@RequestBody CompleteTaskRequest completeTaskRequest){
        Map<String, Object> map = new HashMap<>(4);
        map.put("operate", completeTaskRequest.getOperate());
        taskService.complete(completeTaskRequest.getTaskId(), map);
        return null;
    }



}
