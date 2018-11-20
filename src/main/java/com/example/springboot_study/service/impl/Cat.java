package com.example.springboot_study.service.impl;


import com.example.springboot_study.service.Animal;
import org.springframework.stereotype.Service;

@Service
public class Cat implements Animal{
    @Override
    public String getName() {
        return "cat";
    }
}
