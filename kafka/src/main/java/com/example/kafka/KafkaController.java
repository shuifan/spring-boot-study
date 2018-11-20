package com.example.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandong
 * @create 2018/11/1
 */
@RestController
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/send")
    public void send(@RequestParam("topic") String topic,
                     @RequestParam("msg") String msg){
        kafkaService.send(topic, msg);
    }
}
