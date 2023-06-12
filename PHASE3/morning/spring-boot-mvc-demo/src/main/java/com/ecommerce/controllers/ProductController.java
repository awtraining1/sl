package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerce.entity.EProduct;

@Controller
public class ProductController {

	@GetMapping("/add-product")
	public String showNewProductForm(Model model) {

		EProduct product = new EProduct();
		model.addAttribute("product", product);

		return "new-product"; // go to new-product.jsp
	}

	@PostMapping("/add-product")
	public String addNewProduct(@ModelAttribute("product") EProduct product) {
		// Business logic
		// For example : check the name or age
		// Also we can Save to Database

		return "new-product-added-success"; // go to new-product-added-success.jsp
	}

}