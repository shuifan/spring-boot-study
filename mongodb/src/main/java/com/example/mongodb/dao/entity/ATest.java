package com.example.mongodb.dao.entity;

import lombok.Data;

/**
 * @author fandong
 * @create 2018/12/10
 */
@Data
//@Document(collection = "test")
public class ATest extends Test{

    private static String defaultString = "default";

//    @Id
//    private String id;

    private String otherName;

    public ATest() {
        otherName = defaultString;
    }
}
