package com.example.flowable;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.identitylink.api.IdentityLink;
import org.flowable.task.service.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author fandong
 * @create 2019/1/23
 */
public class MessageService implements JavaDelegate, TaskListener {

    private static Logger logger = LoggerFactory.getLogger(MessageService.class.getName());
    private static final String LOOP_COUNTER = "loopCounter";
    private static final ConcurrentHashMap<String, NextUserId> TASK_USER_MAP = new ConcurrentHashMap<>(16);
    @Override
    public void execute(DelegateExecution delegateExecution) {
        System.out.println("发消息通知结果");

    }

    /**
     * {nrOfActiveInstances=3, days=2, loopCounter=0, nrOfInstances=3, nrOfCompletedInstances=0}
     * @param delegateTask
     */
    @Override
    public void notify(DelegateTask delegateTask) {
        Set<IdentityLink> candidates = delegateTask.getCandidates();
        List<String> userIds = new ArrayList<>(10);
        for (IdentityLink i : candidates){
            String userId = i.getUserId();
            userIds.add(userId);
        }

        System.out.println(delegateTask.getExecutionId());
        Map<String, Object> variables = delegateTask.getVariables();
        String taskId = delegateTask.getId();
        String processInstanceId = delegateTask.getProcessInstanceId();
        //会签 给候选人分配任务
        if (variables.containsKey(LOOP_COUNTER)){
            NextUserId nextUserId = TASK_USER_MAP.get(processInstanceId);
            if (nextUserId == null){
                nextUserId = new NextUserId(userIds);
                NextUserId nextUserIdInMap = TASK_USER_MAP.putIfAbsent(processInstanceId, nextUserId);
                if (nextUserIdInMap != null){
                    nextUserId = nextUserIdInMap;
                }
            }

            logger.info("会签/或签 ---userId=" + nextUserId.get() + "  " + "taskId=" + taskId);

            //所有人都取到了就清除
            if (nextUserId.allGetted()){
                TASK_USER_MAP.remove(processInstanceId);
                System.out.println("清除MAP" + TASK_USER_MAP);
            }
        }
    }
}
