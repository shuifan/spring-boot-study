package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BaseInfoRepository extends JpaRepository<BaseInfo, Integer> {

    long countByZhiXinBianHaoAndConfirmUserIdIsNotNull(String zhiXinBianHao);

    BaseInfo findByZhiXinBianHao(String zhiXinBianHao);
}
