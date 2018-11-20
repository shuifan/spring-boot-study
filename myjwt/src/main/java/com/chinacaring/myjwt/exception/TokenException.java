package com.chinacaring.myjwt.exception;

import lombok.Data;

/**
 * @author fandong
 * @create 2018/5/24
 */

@Data
public class TokenException extends Exception {

    private int code;
    private String msg;

    public TokenException() {
    }

    public TokenException(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
