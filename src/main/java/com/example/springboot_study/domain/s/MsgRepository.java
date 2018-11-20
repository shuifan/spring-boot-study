package com.example.springboot_study.domain.s;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 此为Msg模型的数据访问层
 */

public interface MsgRepository extends JpaRepository<Msg,Long>{

}
