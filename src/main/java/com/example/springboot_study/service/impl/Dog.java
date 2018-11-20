package com.example.springboot_study.service.impl;


import com.example.springboot_study.service.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{

    String name;


    @Override
    public String getName() {
        return "dog";
    }


}
