package com.sop.lab3_1.soplab3_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Soplab31Application {

	public static void main(String[] args) {
		SpringApplication.run(Soplab31Application.class, args);
	}

}
