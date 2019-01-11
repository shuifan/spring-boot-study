package com.example.zookeeper;

import org.I0Itec.zkclient.ZkClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fandong
 * @create 2019/1/11
 */
@Configuration
public class MineBeanFactory {

    @Value("${zk.server}")
    private String zkServer;

    @Bean
    ZkClient getZkClient(){
        return new ZkClient(zkServer);
    }
}
