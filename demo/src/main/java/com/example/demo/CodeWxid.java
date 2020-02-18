package com.example.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class CodeWxid {

    @Id
    @GeneratedValue
    private Integer id;

    private String code;

    private String name;

    private String wxId;

    private String deptCode;

    private String otherId;
}
