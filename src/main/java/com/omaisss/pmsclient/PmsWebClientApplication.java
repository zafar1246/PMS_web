package com.omaisss.pmsclient;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.omaisss.pmsclient.restrepository")
@ComponentScan(basePackages = "com.omaisss.pmsclient")

public class PmsWebClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmsWebClientApplication.class, args);
	}

}
