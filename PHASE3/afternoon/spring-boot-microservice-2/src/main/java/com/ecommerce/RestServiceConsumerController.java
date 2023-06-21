package com.ecommerce;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.entity.EProduct;

@Controller
public class RestServiceConsumerController {		

	@GetMapping("/todo/{id}")
	public String todo(@PathVariable("id") int id, Model model) {

		RestTemplate restTemplate = new RestTemplate();
		// Get a product from the first micro service.
		EProduct product = restTemplate.getForObject("http://localhost:8080/product/details/"+id, EProduct.class);
		
		model.addAttribute("product", product);
		
		return "product-details"; // product-details.jsp
	}

}
