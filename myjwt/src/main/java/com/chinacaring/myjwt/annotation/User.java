package com.chinacaring.myjwt.annotation;

import lombok.Data;

/**
 * @author fandong
 * @create 2018/5/25
 */
@Data
public class User {

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
