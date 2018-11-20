package com.chinacaring.myjwt.controller;

import com.chinacaring.myjwt.config.JwtProperty;
import com.chinacaring.myjwt.model.LoginRequest;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author fandong
 * @create 2018/5/24
 */
@RestController
public class TokenController {

    @Autowired
    private JwtProperty jwtProperty;

    @PostMapping("/login")
    public Object login(@RequestBody LoginRequest loginRequest){
        //假设验证过了用户名和密码 发token
        // Create Twt token
        return generateToken(loginRequest.getUsername());
    }

    private String generateToken(String username) {
        Map<String, Object> claims = new HashMap<>(16);
        claims.put("sub", username);
        claims.put("created", new Date());
        return generateToken((claims));
    }

    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder().setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + jwtProperty.getExpire() * 1000L))
                .signWith(SignatureAlgorithm.HS512, jwtProperty.getSecret()).compact();
    }
}
