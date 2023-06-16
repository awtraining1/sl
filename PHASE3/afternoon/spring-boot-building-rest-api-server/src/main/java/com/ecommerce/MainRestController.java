package com.ecommerce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainRestController {

	@GetMapping(path = "/apple", produces = "application/json")
	public ResponseEntity<Apple> displayApply() {
		Apple a = new Apple();
		a.name = "Shimla";
		a.weight = 10;

		return new ResponseEntity<Apple>(a, HttpStatus.OK);

	}

}

class Apple {

	public String name;
	public int weight;

}