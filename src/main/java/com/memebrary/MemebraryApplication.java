package com.memebrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MemebraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemebraryApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MemebraryApplication.class);
	}

}
