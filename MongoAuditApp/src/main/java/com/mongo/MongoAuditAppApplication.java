package com.mongo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MongoAuditAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoAuditAppApplication.class, args);
	}
}
