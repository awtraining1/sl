package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.EProduct;
import com.ecommerce.dao.EProductDAO;

@Controller
public class ProductController {
	
	@Autowired
	EProductDAO eproductDAO;
	
	@RequestMapping(value = "/listProducts", method = RequestMethod.GET)
	public String listProducts(ModelMap map) {
		List<EProduct> list = eproductDAO.getProducts();
		map.addAttribute("list", list);
		return "listProducts";
	}

}
