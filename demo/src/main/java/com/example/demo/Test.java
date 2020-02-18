package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @author fandong
 * @create 2019/4/18
 */
@RestController
public class Test {

    @Autowired
    private CodeWxidRepository codeWxidRepository;

    @Autowired
    private BaseInfoRepository baseInfoRepository;

    @Autowired
    private SomeMapper someMapper;

    @GetMapping("/test")
    @Transactional(rollbackFor = Exception.class)
    public Object test() throws ParseException, InterruptedException {

//        DebugUtils.transactionRequired("Test.test");
        BaseInfo one = baseInfoRepository.findOne(1057);
//        String lock = someMapper.lock("22C0E12D44D5455A913238F26C5FEE3");
//        System.out.println(lock);
        BaseInfo baseInfo = baseInfoRepository.findByZhiXinBianHao("22C0E12D44D5455A913238F26C5FEE3");

        TransactionAspectSupport.currentTransactionStatus();
        String te = someMapper.te("22C0E12D44D5455A913238F26C5FEE3");
        return null;
    }



}
