package com.example.springboot_study.domain.p;

import com.example.springboot_study.domain.p.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 此为 User模型的数据访问层
 */

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(String name);

    List<User> findByNameAndAge(String name, Integer age);

    @Query("select u from User u where u.name=:name")
    User findUser(@Param("name") String name);



    @Query("update User u set u.age=:age where u.name=:name")
    @Modifying
    @Transactional
    Integer update(@Param("age") Integer age, @Param("name") String name);
}
