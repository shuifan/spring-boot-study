package com.example.mongodb.dao.repository;

import com.example.mongodb.dao.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author fandong
 * @create 2018/12/7
 */
public interface TestRepository extends MongoRepository<Test, String> {

    /**
     * 根据名称查找
     * @param name
     * @return
     */
    List<Test> findByName(String name);

}
