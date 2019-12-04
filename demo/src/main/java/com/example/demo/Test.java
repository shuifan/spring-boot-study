package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author fandong
 * @create 2019/4/18
 */
@RestController
public class Test {

    @PostMapping("/test")
    public Object test() throws ParseException {
        TestReq testReq = new TestReq();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.SIMPLIFIED_CHINESE);
        Date parse = sdf.parse("1992-09-15");
        testReq.setB(parse);
        return testReq;
    }



}
