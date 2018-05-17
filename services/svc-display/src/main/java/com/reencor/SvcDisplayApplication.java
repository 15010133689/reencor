package com.reencor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SvcDisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SvcDisplayApplication.class, args);
	}
}
