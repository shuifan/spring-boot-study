package com.example.anotherstudy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TimeRequest {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;

    public TimeRequest(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
