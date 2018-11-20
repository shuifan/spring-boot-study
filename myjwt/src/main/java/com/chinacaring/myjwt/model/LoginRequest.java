package com.chinacaring.myjwt.model;

import lombok.Data;

/**
 * @author fandong
 * @create 2018/5/24
 */

@Data
public class LoginRequest {

    private String username;
    private String pswd;

    public LoginRequest() {
    }

    public LoginRequest(String username, String pswd) {
        this.username = username;
        this.pswd = pswd;
    }
}
