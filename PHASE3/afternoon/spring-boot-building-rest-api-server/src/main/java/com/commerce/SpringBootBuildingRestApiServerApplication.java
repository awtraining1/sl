package com.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.ecommerce.controllers","com.ecommerce.entity", "com.ecommerce.repositries" })
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootBuildingRestApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBuildingRestApiServerApplication.class, args);
	}

}
