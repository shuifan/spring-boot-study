package com.example.webservice.service.impl;

import com.example.webservice.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;


@Service
public class TestServiceImpl implements TestService{

    @Autowired
    private TestAsync testAsync;

    @Override
    public void testAsync() throws InterruptedException {
        Future<String> a = testAsync.a();
        Future<String> b = testAsync.b();
        Future<String> c = testAsync.c();

        while (true){
            if (a.isDone() && b.isDone() && c.isDone()){
                break;
            }
        }

        System.out.println("end async");
    }


}

