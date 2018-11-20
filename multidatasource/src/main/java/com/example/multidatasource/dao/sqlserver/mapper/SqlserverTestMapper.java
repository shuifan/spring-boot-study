package com.example.multidatasource.dao.sqlserver.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fandong
 * @create 2018/11/20
 */
public interface SqlserverTestMapper {

    @Select("SELECT\n" +
            "\t*\n" +
            "FROM\n" +
            "\tBSRIS.dbo.txby_jhyy_inspection_query\n" +
            "WHERE\n" +
            "\tclinicNumber = #{clinicNumber}\n" +
            "ORDER BY\n" +
            "\tchargeTime DESC;")
    List<Object> selectCheckByClinicNumber(@Param("clinicNumber") String clinicNumber);
}
