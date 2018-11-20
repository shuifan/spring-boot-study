package com.example.multidatasource.dao.mysql.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author fandong
 * @create 2018/11/20
 */
public interface MysqlTestMapper {

    @Select("SELECT\n" +
            "\t*\n" +
            "FROM\n" +
            "\tappointment;")
    public Object selectAllFromAppointment();
}
