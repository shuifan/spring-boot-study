package com.example.webservice.utils;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
public class CeshiUtil {

    @Async
    public Future<String> printSomething() throws InterruptedException {
        System.out.println("任务1开始");
        long currentTimeMillis = System.currentTimeMillis();
        Thread.sleep(10000);
        long currentTimeMillis1 = System.currentTimeMillis();
        System.out.println("task1任务耗时:"+(currentTimeMillis1-currentTimeMillis)+"ms");
        return new AsyncResult<>("task完成");
    }

}
