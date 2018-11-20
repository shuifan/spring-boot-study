package com.example.webservice.service.impl;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

@Component
@Async
public class TestAsync {

    @Async
    public Future<String> a() throws InterruptedException {
        System.out.println("\nstart a\n");
        Thread.sleep(10000);
        System.out.println("\nend a\n");
        return new AsyncResult<>("a");
    }

    @Async
    public Future<String> b() throws InterruptedException {
        System.out.println("\nstart b\n");
        Thread.sleep(10000);
        System.out.println("\nend b\n");
        return new AsyncResult<>("b");
    }

    @Async
    public Future<String> c() throws InterruptedException {
        System.out.println("\nstart c\n");
        Thread.sleep(10000);
        System.out.println("\nend c\n");
        return new AsyncResult<>("c");
    }
}
