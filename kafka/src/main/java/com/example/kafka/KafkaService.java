package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.util.List;

/**
 * @author fandong
 * @create 2018/11/1
 */
public interface KafkaService {

    /**
     * 发送服务
     * @param topic kafka topic
     * @param value 值
     */
    void send(String topic, String value);

    /**
     * 测试用 kafka消费者
     * @param msg
     */
    void kafkaConsumerTest(String msg);

    /**
     * 批量消费 某topic
     * @param records
     */
    void listenPartition0(List<ConsumerRecord<String, String>> records);


    /**
     * 批量消费 某topic
     * @param records
     */
    void listenPartition2(List<ConsumerRecord<String, String>> records);
}
