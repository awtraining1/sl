package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ecommerce.controllers", "com.ecommerce.entity"})
@SpringBootApplication
public class SpringBootMvcDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcDemoApplication.class, args);
	}

}
