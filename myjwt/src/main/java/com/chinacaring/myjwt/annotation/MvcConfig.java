package com.chinacaring.myjwt.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * @author fandong
 * @create 2018/5/25
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

    @Autowired
    private MyCurrentUserMethodArgumentResolver myCurrentUserMethodArgumentResolver;

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        argumentResolvers.add(myCurrentUserMethodArgumentResolver);
    }
}
