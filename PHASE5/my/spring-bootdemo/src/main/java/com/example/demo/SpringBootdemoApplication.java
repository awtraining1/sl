package com.example.demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootdemoApplication.class, args);
	}

}


@Controller
class IndexController{
	
	static String randomWebAppID= new String(new Random().toString());
	
	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "[WEBAPPID "+ randomWebAppID + "] Hello World from Spring";
	}
}