package com.syt.sjserviceregister;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SjServiceRegisterApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SjServiceRegisterApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SjServiceRegisterApplication.class, args);
		LOGGER.info("SjServiceRegisterApplication started successfully");
	}

}
