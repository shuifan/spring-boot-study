package com.example.zookeeper;

import lombok.Data;

/**
 * @author fandong
 * @create 2019/1/11
 */
@Data
public class CreateNodeRequest {

    private String nodeName;

    private String nodeValue;

    /**
     * 永久节点 临时节点
     */
    private Boolean persistent;
}
