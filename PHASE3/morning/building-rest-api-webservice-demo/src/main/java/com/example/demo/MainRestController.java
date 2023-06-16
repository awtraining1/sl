package com.example.demo;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class MainRestController {
	
	@GetMapping(path="/data", produces = "application/json")
	public ResponseEntity<EProduct> displayData()
	{
		EProduct e1= new EProduct();
		e1.setName("Hockey Pads");
		e1.setPrice(1000);
		
		return new ResponseEntity<EProduct>(e1, HttpStatusCode.valueOf(200));		
	}

}

class EProduct{
	
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
