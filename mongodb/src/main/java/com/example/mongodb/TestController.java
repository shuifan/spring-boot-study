package com.example.mongodb;

import com.example.mongodb.dao.entity.Time;
import com.example.mongodb.dao.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandong
 * @create 2018/12/7
 */
@RestController
public class TestController {

    @Autowired
    ApplicationContextProvider applicationContextProvider;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private TestRepository testRepository;



    @PostMapping("/test")
    public Object test(@RequestBody Time time){

        ApplicationContext applicationContext = applicationContextProvider.getApplicationContext();
        A aaa = applicationContext.getBean("aaa", A.class);
        aaa.setB("c");
        return null;
    }

    @GetMapping("/test")
    public Object te(){
        ApplicationContext applicationContext = applicationContextProvider.getApplicationContext();
        A aaa = applicationContext.getBean("aaa", A.class);
        return aaa;
    }
}
