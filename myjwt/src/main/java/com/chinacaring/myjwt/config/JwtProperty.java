package com.chinacaring.myjwt.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author fandong
 * @create 2018/5/25
 */
@Component
@Data
public class JwtProperty {

    @Value("${jwt.header}")
    private String header;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Value("${jwt.secret}")
    private String secret;

    @Value("${jwt.checkPath}")
    private String checkPath;

    @Value("${jwt.expiration}")
    private Integer expire;

    public JwtProperty() {
    }
}
