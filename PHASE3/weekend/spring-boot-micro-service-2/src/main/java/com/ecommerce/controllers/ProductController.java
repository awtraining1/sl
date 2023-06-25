package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.EProduct;

@Controller
public class ProductController {

	@GetMapping("/ms2-product/details/{id}")
	@ResponseBody
	public String index(@PathVariable String id) {

		RestTemplate restTemplate = new RestTemplate();		

		EProduct product = restTemplate.getForObject("http://localhost:8080/api/product/v1/details/"+id, EProduct.class);
		return product.toString();

	}

}
