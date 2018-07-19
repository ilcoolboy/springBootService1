package com.wzg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootService1Application.class, args);
	}
}
