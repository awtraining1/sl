package com.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") int id, Model model) {
		
		// Business logic
		if (id == 0)
			throw new ProductNotFoundException();
		else {
			model.addAttribute("id", id);
		}

		return "product-found"; // go to product-found.jsp
	
	}
	
	// First approach: we can write ExceptionHandler in the controller
	// where the exception happens
//	@ExceptionHandler(value = ProductNotFoundException.class)
//	public ResponseEntity<Object> abc(ProductNotFoundException exception) {
//		return new ResponseEntity<>("Product not found. Make sure your id > 0.", HttpStatus.NOT_FOUND);
//	}
	

}
