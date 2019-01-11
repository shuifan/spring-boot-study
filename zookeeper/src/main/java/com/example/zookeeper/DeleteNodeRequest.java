package com.example.zookeeper;

import lombok.Data;

/**
 * @author fandong
 * @create 2019/1/11
 */
@Data
public class DeleteNodeRequest {

    private String nodeName;

    /**
     * 是否递归
     */
    private Boolean recursive;
}
