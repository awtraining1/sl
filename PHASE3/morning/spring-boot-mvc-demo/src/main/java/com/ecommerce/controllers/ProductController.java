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
import com.ecommerce.repositries.EProductRepo;

@Controller
public class ProductController {

	@Autowired
	EProductRepo eProductRepo;

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

		// Save to Database
		eProductRepo.save(product);

		return "new-product-added-success"; // go to new-product-added-success.jsp
	}

	// Edit use case
	@GetMapping("/edit-product")
	public String showEditProductForm(@RequestParam int id, Model model) {
		Optional<EProduct> productFromRepo = eProductRepo.findById(id);

		if (productFromRepo.isPresent()) {

			EProduct product = productFromRepo.get();
			model.addAttribute("product", product);
			return "edit-product"; // go to edit-product.jsp

		} else {
			model.addAttribute("id", id);
			return "product-not-found"; // go to product-not-found.jsp
		}
	}

	@PostMapping("/edit-product")
	public String editProduct(@ModelAttribute("product") EProduct product) {
		eProductRepo.save(product);

		return "edit-product-success"; // go to edit-product-success.jsp
	}
	
	// Delete functionality
	@GetMapping("/delete-product")
	public String deleteProduct(@RequestParam int id, Model model) {
		Optional<EProduct> productFromRepo = eProductRepo.findById(id);

		if (productFromRepo.isPresent()) {	
			
			eProductRepo.deleteById(id);
			model.addAttribute("id", id);
			return "delete-product-success"; // go to delete-product-success.jsp			

		} else {
			model.addAttribute("id", id);
			return "product-not-found"; // go to product-not-found.jsp
		}
	}

}