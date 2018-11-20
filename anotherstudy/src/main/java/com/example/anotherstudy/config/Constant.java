package com.example.anotherstudy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Constant {

    @Value("${jinchen.ip-port}")
    private String PAY_IP_PORT;

    @Value("${jinchen.id}")
    private String ID;

    @Value("${jinchen.secret}")
    private String SECRET;

    public String getPAY_IP_PORT() {
        return PAY_IP_PORT;
    }

    public void setPAY_IP_PORT(String PAY_IP_PORT) {
        this.PAY_IP_PORT = PAY_IP_PORT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSECRET() {
        return SECRET;
    }

    public void setSECRET(String SECRET) {
        this.SECRET = SECRET;
    }

    @Override
    public String toString() {
        return "Constant{" +
                "PAY_IP_PORT='" + PAY_IP_PORT + '\'' +
                ", ID='" + ID + '\'' +
                ", SECRET='" + SECRET + '\'' +
                '}';
    }
}
