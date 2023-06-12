package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eproduct")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello eproduct! I am Called in First Service";
	}
}