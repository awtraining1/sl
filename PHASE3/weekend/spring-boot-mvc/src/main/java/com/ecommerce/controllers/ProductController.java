package com.ecommerce.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.exceptions.ProductNotFoundException;

@Controller
public class ProductController {

	@RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String getProduct(@PathVariable("id") String id) {

		if (id.contentEquals("0"))
			throw new ProductNotFoundException();
		return "Product was found";
	}

	/*
	 * //Exception Handler defined in the controller class itself
	 * 
	 * @ExceptionHandler(value = ProductNotFoundException.class) public
	 * ResponseEntity<Object> abc(ProductNotFoundException exception) { return new
	 * ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND); }
	 */

}
