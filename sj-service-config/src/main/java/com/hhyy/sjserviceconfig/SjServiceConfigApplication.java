package com.hhyy.sjserviceconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SjServiceConfigApplication {
  private static final Logger LOGGER = LoggerFactory.getLogger(SjServiceConfigApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SjServiceConfigApplication.class, args);
    LOGGER.info("SjConfigServerApplication started successfully");
  }

}
