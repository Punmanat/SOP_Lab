package com.sop.lab2_1.soplab2_1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {
	@Value("${author}")
	private String author;

	public String getAuthor() {
		return author;
	}
}
