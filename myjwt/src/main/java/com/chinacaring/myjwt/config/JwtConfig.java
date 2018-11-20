package com.chinacaring.myjwt.config;

import com.chinacaring.myjwt.filter.JwtFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author fandong
 * @create 2018/5/24
 */
@Configuration
public class JwtConfig {


    @Autowired
    private JwtProperty jwtProperty;

    @Bean
    public FilterRegistrationBean jwtFilter() {
        final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new JwtFilter(jwtProperty));
        String[] paths = jwtProperty.getCheckPath().split(",");
        for (String p : paths){
            registrationBean.addUrlPatterns(p);
            System.out.println(p);
        }
        return registrationBean;
    }
}
