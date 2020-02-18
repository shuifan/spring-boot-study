package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeWxidRepository extends JpaRepository<CodeWxid, Integer> {

    CodeWxid findFirstByCodeOrOtherId(String code, String code1);

    CodeWxid findFirstByWxId(String wxId);

    List<CodeWxid> findByDeptCode(String deptCode);
}
