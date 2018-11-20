package com.example.anotherstudy.controller;


import com.example.anotherstudy.config.Constant;
import com.example.anotherstudy.domain.TimeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
public class TestController {

    @Autowired
    private Constant constant;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @PostMapping("something")
    public Object getSomething(@RequestBody TimeRequest name){
        logger.info("\ninfo\n");
        logger.info("\nwarn\n");
        logger.info("\nerror\n");
        return name;
    }

    @GetMapping("test")
    public Object getTest(@RequestParam(value = "has_meet", defaultValue = "false", required = false) Boolean hasMeet){
        logger.info("缓存");
        return hasMeet;
    }
}
