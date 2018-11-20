package com.example.springboot_study.dao.mapper;

import com.example.springboot_study.dao.entity.ModelDept;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author fd
 * @since 2017-09-14
 */
public interface ModelDeptMapper extends BaseMapper<ModelDept> {

    @Select("SELECT * FROM model_dept")
    List<ModelDept> selectAllDepts();
}