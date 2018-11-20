package com.example.anotherstudy.config;

import com.example.anotherstudy.Resolver.MyRequestHandlerMethodResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter{

    @Autowired
    private MyRequestHandlerMethodResolver myRequestHandlerMethodResolver;


    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(myRequestHandlerMethodResolver);
    }
}
