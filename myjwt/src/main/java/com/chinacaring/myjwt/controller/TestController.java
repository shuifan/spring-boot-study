package com.chinacaring.myjwt.controller;

import com.chinacaring.myjwt.annotation.MyCurrentUser;
import com.chinacaring.myjwt.annotation.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandong
 * @create 2018/5/24
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Object getTest(@MyCurrentUser User user){
        return user;
    }

    @GetMapping("/test1")
    public Object getTest1(){
        Claims claims = Jwts.parser().setSigningKey("caring").parseClaimsJws("eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxMzc3MDQ0MTkwMiIsImNyZWF0ZWQiOjE1NDAxNzI4ODA4MjksImV4cCI6MTU0MDc3NzY4MH0.Y4jeHEB37E7XfFISKB-PGtAmcJ0S713yopsY-RXWvoFoVJFag3hRFFutT42o-Gqi6cl9nm0_Mss4z61Vjs5Ezg").getBody();
        return claims;
    }
}
