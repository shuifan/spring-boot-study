package com.example.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.List;

/**
 * @author fandong
 * @create 2018/11/1
 */
@Service
public class KafkaServiceImpl implements KafkaService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    public KafkaServiceImpl(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = (KafkaTemplate<String, String>) kafkaTemplate;
    }

    @Override
    public void send(String topic, String value) {
        ListenableFuture<SendResult<String, String>> resultListenableFuture = kafkaTemplate.send(topic, value);
        resultListenableFuture.addCallback(
                successCallback -> logger.info("发送成功：topic= " + topic + " value= " + value),
                failureCallback -> logger.info("发送失败：topic= " + topic + " value= " + value));
    }

    @Override
    @KafkaListener(id = "test",topics = {"test"}, containerFactory = "kafkaListenerContainerFactory0")
    public void kafkaConsumerTest(String msg) {
        logger.info("接收到消息--" + msg);
    }

    @Override
    @KafkaListener(id = "3-test",topics = {"3-test"}, containerFactory = "kafkaListenerContainerFactory0")
    public void listenPartition0(List<ConsumerRecord<String, String>> records) {
        System.out.println(records.size());
        for (ConsumerRecord<String, String> consumerRecord : records){
            String value = consumerRecord.value();
            logger.info("a 消息：partition " + consumerRecord.partition() + " value " + consumerRecord.value() );
        }
    }

    @Override
    @KafkaListener(id = "3-test-1", topics = {"3-test"}, containerFactory = "kafkaListenerContainerFactory1")
    public void listenPartition2(List<ConsumerRecord<String, String>> records) {
        System.out.println(records.size());
        for (ConsumerRecord<String, String> consumerRecord : records){
            String value = consumerRecord.value();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            logger.info("c 消息：partition " + consumerRecord.partition() + " value " + consumerRecord.value() + " thread id " + Thread.currentThread().getName());
        }
    }


}
