package com.example.demo;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class SecondController {

	@GetMapping("/message")
	public String test() {
		return "Hello Consumer!  I am Called in Second Service";
	}

}