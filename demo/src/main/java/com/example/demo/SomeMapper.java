package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SomeMapper {

    @Select("select confirm_user_id from base_info where zhi_xin_bian_hao = #{code} FOR UPDATE")
    String lock(@Param("code") String code);


    @Select("select confirm_user_id from base_info where zhi_xin_bian_hao = #{code}")
    String te(@Param("code") String code);
}
