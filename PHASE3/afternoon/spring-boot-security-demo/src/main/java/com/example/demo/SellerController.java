package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SellerController {
	
	@GetMapping("/seller/display")
	public String sellerDisplay(){
		
		return "seller/seller";
	}
	
	@GetMapping("/home/display")
	public String homeDisplay(){
		
		return "home/home";
	}


}
