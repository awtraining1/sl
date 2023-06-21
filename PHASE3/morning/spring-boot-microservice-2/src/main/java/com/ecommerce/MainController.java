package com.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.EProduct;

@Controller
public class MainController {

	@GetMapping("/product2/{id}")
	public String todo(@PathVariable("id") int id, Model model) {


		RestTemplate restTemplate = new RestTemplate();
		EProduct product = restTemplate.getForObject("http://localhost:8080/products/details/" + id, EProduct.class);
		model.addAttribute("product", product);

		return "product-details"; // go to "product-details.jsp"
	}

}
