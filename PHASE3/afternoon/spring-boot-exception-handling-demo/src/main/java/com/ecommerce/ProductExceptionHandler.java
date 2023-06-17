package com.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {

	// Second approach: we can write ExceptionHandler in a separate class like this
	// one.
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> abc(ProductNotFoundException exception) {
		return new ResponseEntity<>("Product not found! Make sure your id > 0.", HttpStatus.NOT_FOUND);
	}

}
