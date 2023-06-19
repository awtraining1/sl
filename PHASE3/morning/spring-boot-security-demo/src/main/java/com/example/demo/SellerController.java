package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellerController {
	
	@GetMapping("/seller/home")
	public String seller() {
		return "seller/seller";
	}
	
	@GetMapping("/home1/home")
	public String home1() {
		return "home1";
	}

}
