package com.example.simpleweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandong
 * @create 2019/1/28
 */
@RestController
public class SimpleController {

    @Value("${ip}")
    private String mineIP;

    @GetMapping("/ip")
    public Object getIP(){
        return mineIP;
    }
}
