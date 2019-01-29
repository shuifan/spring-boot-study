package com.example.flowable;

import lombok.Data;

/**
 * @author fandong
 * @create 2019/1/29
 */
@Data
public class CompleteTaskRequest {

    /**
     * 自定义操作
     */
    public String operate;

    /**
     * 操作人标识
     */
    public String username;

    /**
     * 任务节点Id
     */
    public String taskId;
}
