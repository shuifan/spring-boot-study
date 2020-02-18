package com.example.dubboprovider;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubboapi.TestService;
import org.springframework.stereotype.Component;

@Component
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String sayHello(String s) {
        return s;
    }
}
