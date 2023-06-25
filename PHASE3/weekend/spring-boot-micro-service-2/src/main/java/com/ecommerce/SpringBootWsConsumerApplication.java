package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.ecommerce", "com.ecommerce.entity", "com.ecommerce.controllers"})
@SpringBootApplication
public class SpringBootWsConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWsConsumerApplication.class, args);
	}

}
