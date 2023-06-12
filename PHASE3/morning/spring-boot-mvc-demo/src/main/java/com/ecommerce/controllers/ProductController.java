package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.entity.EProduct;

@Controller
public class ProductController {
	
	@GetMapping("/add-product")
	public String showNewProductForm(Model model) {
		
		EProduct product = new EProduct();
		model.addAttribute("product", product);
		
		return "new-product"; // go to new-product.jsp
	}

}


//Ctrl + Shift + O