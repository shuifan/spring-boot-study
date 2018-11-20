package com.example.webservice.config;

import com.chinacaring.common.exception.CommonException;
import com.chinacaring.core.config.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@ResponseBody
public class MyGlobalExceptionHandler extends GlobalExceptionHandler {

    @ExceptionHandler({NullPointerException.class})
    public Object nullExceptionHandler(HttpServletRequest req, NullPointerException e){
        return "出错";
    }

    @ExceptionHandler({CommonException.class})
    public Object commonExceptionHandler(HttpServletRequest req, CommonException e){
        return "出错";
    }

}
