package com.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositries.EProductRepositry;

@RestController
@RequestMapping("/product")
public class ProductRestController {
	
	@Autowired
	EProductRepositry eProductRepo;
	
	// List all the products
	@GetMapping(path="/list", produces = "application/json")
	public List<EProduct> listProducts(){
		List<EProduct> products = eProductRepo.findAll();
		
		return products;		
	}

}
