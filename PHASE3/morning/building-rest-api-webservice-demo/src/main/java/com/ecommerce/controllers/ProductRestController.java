package com.ecommerce.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositries.EProductRepo;

@RestController
@RequestMapping("/products")
public class ProductRestController {
	@Autowired
	EProductRepo eProductRepo;
	
	// List all the products
	@GetMapping(path="/list", produces = "application/json")
	public ResponseEntity<List<EProduct>> listproducts()
	{
		List<EProduct> products = eProductRepo.findAll();		
		
		return new ResponseEntity<List<EProduct>>(products, HttpStatusCode.valueOf(200));		
	}
	
	// Add a new product
	@PostMapping(path="/add", consumes = "application/json", produces = "application/json")
	public ResponseEntity<EProduct> addProduct(@RequestBody EProduct eProduct){
		eProduct = eProductRepo.save(eProduct);
		
		return new ResponseEntity<EProduct>(eProduct, HttpStatusCode.valueOf(200));		
	}
	
	
	// Show details of one product

}

