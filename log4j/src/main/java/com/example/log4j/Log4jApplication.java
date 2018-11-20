package com.example.log4j;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);
		Logger logger = Logger.getLogger(Log4jApplication.class);
		logger.info("这是一条info信息");
	}
}
