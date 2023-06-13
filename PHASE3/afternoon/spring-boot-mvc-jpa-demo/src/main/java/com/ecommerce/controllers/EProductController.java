package com.ecommerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositries.EProductRepositry;

@Controller
public class EProductController {

	@Autowired
	EProductRepositry eProductRepositry;

	// Process the http GET request for showing "new product form"
	@GetMapping("/add-product")
	public String showNewProductForm(Model model) {

		EProduct new_product = new EProduct();
		model.addAttribute("product", new_product);

		return "new-product"; // go to new-product.jsp
	}

	@PostMapping("/add-product")
	public String addNewProduct(@ModelAttribute("product") EProduct product) {
		// Business logic
		// Example to database
		eProductRepositry.save(product);

		return "new-product-added-success"; // go to new-product-added-success.jsp
	}

	// Edit functionality
	@GetMapping("/edit-product")
	public String showEditProductForm(@RequestParam int id, Model model) {
		Optional<EProduct> productFromRepo = eProductRepositry.findById(id);

		if (productFromRepo.isPresent()) {
			EProduct product = productFromRepo.get();

			model.addAttribute("product", product);
			return "edit-product"; // go to edit-product.jsp

		} else {
			model.addAttribute("id", id);
			return "edit-product-not-found"; // go to edit-product-not-found.jsp
		}
	}
	
	@PostMapping("/edit-product")
	public String saveEditedProduct(@ModelAttribute("product") EProduct product, Model model) {
		
		eProductRepositry.save(product);
		model.addAttribute("id", product.getID());

		return "edit-product-saved-success"; // go to edit-product-saved-success.jsp
	}

}
