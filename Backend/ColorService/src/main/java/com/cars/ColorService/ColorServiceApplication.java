package com.cars.ColorService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ColorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColorServiceApplication.class, args);
	}

}
