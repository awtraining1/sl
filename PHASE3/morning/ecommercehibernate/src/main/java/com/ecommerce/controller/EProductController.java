package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecommerce.dao.EProductDAO;
import com.ecommerce.entity.EProductEntity;

@Controller
public class EProductController {

	@Autowired
	EProductDAO eProductDAO;

	@RequestMapping(value = "/productList", method = RequestMethod.GET)
	public String listProducts(ModelMap map) {
		List<EProductEntity> list = eProductDAO.getAllProducts();
		map.addAttribute("productList", list);
		return "productList";
	}

}
