package com.example.mongodb.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author fandong
 * @create 2018/12/14
 */
@Data
public class Time {

    @JsonFormat(pattern = "HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
}
