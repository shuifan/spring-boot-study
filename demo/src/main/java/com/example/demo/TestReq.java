package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author fandong
 * @create 2019/4/25
 */
public class TestReq {

    private Double a;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date b;

    public Date getB() {
        return b;
    }

    public void setB(Date b) {
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }
}
