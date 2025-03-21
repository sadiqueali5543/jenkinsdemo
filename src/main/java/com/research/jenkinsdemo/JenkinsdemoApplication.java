package com.research.jenkinsdemo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}
	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
