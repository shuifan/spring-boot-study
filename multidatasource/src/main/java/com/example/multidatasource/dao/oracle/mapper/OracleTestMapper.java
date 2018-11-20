package com.example.multidatasource.dao.oracle.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author fandong
 * @create 2018/11/20
 */
public interface OracleTestMapper {

    /**
     * 查询科室信息
     *
     * @param branchCode
     * @return
     */
    @Select("select * from PORTAL_HIS.V_APP_GET_DEPT_INFO t where t.barnch = #{branchCode}")
    List<Object> selectDeptInfoByBranchCode(@Param("branchCode") String branchCode);
}
