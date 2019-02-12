package com.example.flowable;

import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.SequenceFlow;
import org.flowable.engine.TaskService;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.flowable.identitylink.api.IdentityLink;
import org.flowable.task.service.delegate.DelegateTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author fandong
 * @create 2019/1/30
 */
@Component
public class UserObtainService implements JavaDelegate {

    private static final String LABEL = "label";

    public static final Map<String, List<String>> LABEL_USER_MAP = new ConcurrentHashMap<>(16);

    private static Logger logger = LoggerFactory.getLogger(UserObtainService.class.getName());

    static {
        List<String> littleLeaders = new ArrayList<>(3);
        littleLeaders.add("label_little_leader_5");
        littleLeaders.add("label_little_leader_6");
        LABEL_USER_MAP.put("label_little_leader", littleLeaders);

        List<String> bigLeaders = new ArrayList<>(3);
        bigLeaders.add("label_big_leader_5");
        bigLeaders.add("label_big_leader_6");
        LABEL_USER_MAP.put("label_big_leader", bigLeaders);
    }

    @Autowired
    private TaskService taskService;

    public void notify(DelegateTask delegateTask) {

        SequenceFlow sequenceFlow = new SequenceFlow();
        String targetRef = sequenceFlow.getTargetRef();
        System.out.println("设置候选人");
        //会签情况下 根据标签获取所有的候选人 并设置loopCardinality次数
        Set<IdentityLink> candidates = delegateTask.getCandidates();
        List<String> labelUserIds = new ArrayList<>(10);
        List<String> labels = new ArrayList<>(10);
        for (IdentityLink i : candidates){
            String userId = i.getUserId();
            //以 label开头的说明是 标签  不是普通用户 需要根据标签去查找实际用户id
            if (userId.startsWith(LABEL)){
                labels.add(userId);
                List<String> list = LABEL_USER_MAP.get(userId);
                if (list != null){
                    labelUserIds.addAll(list);
                }
            }
        }

        for (String s : labels){
            delegateTask.deleteCandidateUser(s);
        }
        for (String s : labelUserIds){
            delegateTask.addCandidateUser(s);
        }

        delegateTask.setVariable("loopCount", delegateTask.getCandidates().size());


    }

    @Override
    public void execute(DelegateExecution delegateExecution) {
        FlowElement currentFlowElement = delegateExecution.getCurrentFlowElement();

    }
}
