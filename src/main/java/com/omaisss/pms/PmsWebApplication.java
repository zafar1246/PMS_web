package com.omaisss.pms;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.omaisss.pms.restrepository")
@ComponentScan(basePackages = "com.omaisss.pms")

public class PmsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsWebApplication.class, args);
	}

}
