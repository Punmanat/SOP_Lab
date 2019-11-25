package com.sop.lab2_1.soplab2_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Soplab21Application {
	
	@Autowired
	ServiceConfig service = new ServiceConfig();
	
	public static void main(String[] args) {
		SpringApplication.run(Soplab21Application.class, args);
	}
	
	@GetMapping("/")
	public String getAuthor() {
		return String.format("Hello %s", service.getAuthor());
	}

}
