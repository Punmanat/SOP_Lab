package com.sop.lab4.soplab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient 
@EnableZuulProxy
public class Soplab4Application {

	public static void main(String[] args) {
		SpringApplication.run(Soplab4Application.class, args);
	}

}
