package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.ecommerce.controllers","com.ecommerce.entity", "com.ecommerce.repositries" })
@EnableJpaRepositories
@SpringBootApplication
public class BuildingRestApiWebserviceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingRestApiWebserviceDemoApplication.class, args);
	}

}
