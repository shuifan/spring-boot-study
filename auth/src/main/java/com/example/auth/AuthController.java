package com.example.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("")
    public Object helloMyNexus(){
        return "Hello my nexus!";
    }
}
