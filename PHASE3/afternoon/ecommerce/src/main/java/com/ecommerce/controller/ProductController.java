package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class ProductController {

	@Autowired
	EProductDAO eproductDAO;

	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listProducts(ModelMap map) {
		List<EProduct> list = eproductDAO.getProducts();

		map.addAttribute("listOfProducts", list);

		return "list-products"; // go to "list-products.jsp"
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@RequestParam String name, @RequestParam float price) {
		eproductDAO.addProduct(name, price);

		return "add-product-success"; // go to "add-product-success.jsp"
	}

}
