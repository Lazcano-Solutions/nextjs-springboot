package com.lazcanosolutions.templateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TemplateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateApiApplication.class, args);
	}

}
