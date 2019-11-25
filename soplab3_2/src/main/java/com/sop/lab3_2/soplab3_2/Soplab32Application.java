package com.sop.lab3_2.soplab3_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class Soplab32Application {

	public static void main(String[] args) {
		SpringApplication.run(Soplab32Application.class, args);
	}

	@GetMapping("/student/v1")
	public Student getStudent() {
		Student student = new Student("Patrick", 20);
		return student;
	}
}
