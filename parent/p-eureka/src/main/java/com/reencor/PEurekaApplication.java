package com.reencor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PEurekaApplication.class, args);
	}
}
