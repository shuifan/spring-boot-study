package com.example.springboot_study.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 *
 * 借口返回结果模型类
 * 结果默认成功
 */


@Data
public class ResultStyle<T> implements Serializable{

    public static final int SUCCESS_CODE = 0;

    public static final int FAIL_CODE = 1;

    private String msg = "success";

    private int code = SUCCESS_CODE;

    private T data;

    //返回  失败结果的 构造器
    public ResultStyle(String msg){
        this.code = FAIL_CODE;
        this.msg = msg;
    }

    public ResultStyle(T data){
        this.data = data;
    }

}
