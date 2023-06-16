package com.example.demo;

import java.math.BigDecimal;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.EProduct;

@RestController
@RequestMapping("/products")
public class MainRestController {
	
	@GetMapping(path="/data", produces = "application/json")
	public ResponseEntity<EProduct> displayData()
	{
		EProduct e1= new EProduct();
		e1.setName("Hockey Pads");
		e1.setPrice(new BigDecimal(1000.5));
		
		return new ResponseEntity<EProduct>(e1, HttpStatusCode.valueOf(200));		
	}

}

