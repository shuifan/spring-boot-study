package com.example.dubboconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubboapi.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Reference
    private TestService testService;

    @GetMapping("/test")
    public String test(){
        return testService.sayHello("ss");
    }
}
