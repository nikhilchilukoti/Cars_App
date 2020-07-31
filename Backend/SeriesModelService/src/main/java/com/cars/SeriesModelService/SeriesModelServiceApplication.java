package com.cars.SeriesModelService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SeriesModelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeriesModelServiceApplication.class, args);
	}

}
