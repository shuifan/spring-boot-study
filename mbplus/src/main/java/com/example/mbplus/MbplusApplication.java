package com.example.mbplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mbplus.dao.*")
public class MbplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbplusApplication.class, args);
	}
}
