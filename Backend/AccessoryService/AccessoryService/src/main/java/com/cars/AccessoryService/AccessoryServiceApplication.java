package com.cars.AccessoryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccessoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessoryServiceApplication.class, args);
	}

}
