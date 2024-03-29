package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.ecommerce.controllers","com.ecommerce.entity", "com.ecommerce.repositries", "com.ecommerce.services" })
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootMvcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcDemoApplication.class, args);
	}

}
