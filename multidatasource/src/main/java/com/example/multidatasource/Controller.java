package com.example.multidatasource;

import com.example.multidatasource.dao.mysql.mapper.MysqlTestMapper;
import com.example.multidatasource.dao.oracle.mapper.OracleTestMapper;
import com.example.multidatasource.dao.sqlserver.mapper.SqlserverTestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fandong
 * @create 2018/11/20
 */
@RestController
public class Controller {

    @Autowired
    private MysqlTestMapper mysqlTestMapper;

    @Autowired
    private OracleTestMapper oracleTestMapper;

    @Autowired
    private SqlserverTestMapper sqlserverTestMapper;

    @GetMapping("/test")
    public Object test(){
        List<Object> list = new ArrayList<>();
        list.add(mysqlTestMapper.selectAllFromAppointment());
        list.add(oracleTestMapper.selectDeptInfoByBranchCode("2"));
        list.add(sqlserverTestMapper.selectCheckByClinicNumber("1045025"));
        return list;
    }
}
