package com.example.mbplus.controller;


import com.example.mbplus.dao.entity.Dept;
import com.example.mbplus.dao.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private DeptMapper deptMapper;

    @GetMapping("test")
    public Object test(){
        Dept dept = new Dept();
        dept.setDeptCode("2223");
        return deptMapper.insert(dept);
    }

    @PostMapping("tes")
    public Object tes(@RequestBody Position position){
        return position;
    }
}
