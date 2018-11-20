package com.example.webservice.config;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanMapperConfig {

    @Bean
    public Mapper getMappper(){
        return new DozerBeanMapper();
    }

}
