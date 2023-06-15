package com.ecommerce.exceptions.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ecommerce.exceptions.ProductNotFoundException;

@ControllerAdvice
public class ProductExceptionHandler {
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> abc(ProductNotFoundException exception) {
		return new ResponseEntity<>("Product not found! Make sure your product is > 0", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<Object> xyz(ProductNotFoundException exception) {
		return new ResponseEntity<>("OOPS, something went wrong. Contact CustomerSupport", HttpStatus.SERVICE_UNAVAILABLE);
	}

}
