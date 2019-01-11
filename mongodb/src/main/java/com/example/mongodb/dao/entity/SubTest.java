package com.example.mongodb.dao.entity;

import lombok.Data;

/**
 * @author fandong
 * @create 2018/12/7
 */
@Data
public class SubTest {

    private static String defaultString = "default";

    private String name;

    private String value;

    public SubTest() {
        name = defaultString;
        value = defaultString;
    }
}
