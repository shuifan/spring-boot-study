package com.example.webservice.controller;

import com.example.webservice.utils.CeshiUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private CeshiUtil ceshiUtil;


    @GetMapping("test")
    public Object test() throws Exception {
//        long currentTimeMillis = System.currentTimeMillis();
//        Future<String> stringFuture = ceshiUtil.printSomething();
//        Future<String> stringFuture1 = ceshiUtil.printSomething();
//        Future<String> stringFuture2 = ceshiUtil.printSomething();
//
//        for (;;) {
//            if(stringFuture.isDone() && stringFuture1.isDone() && stringFuture2.isDone()) {
//                // 三个任务都调用完成，退出循环等待
//                break;
//            }
//            Thread.sleep(200);
//        }
//
//        System.out.println(stringFuture.get());
//
//        long currentTimeMillis1 = System.currentTimeMillis();

//        return currentTimeMillis1 - currentTimeMillis;
        throw new Exception();
//        return 1;
    }
}
