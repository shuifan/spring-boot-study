package com.example.mongodb.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author fandong
 * @create 2018/12/7
 */
@Data
@Document(collection = "test")
public abstract class Test {

    private static String defaultString = "default";

    @Id
    private String id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    private List<SubTest> subTests;

    private SubTest subTest;

    public Test() {
        name = defaultString;
        createTime = new Date();
        subTest = new SubTest();
        subTests = new ArrayList<>();
        subTests.add(new SubTest());
        subTests.add(new SubTest());
    }
}
