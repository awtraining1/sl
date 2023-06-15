package com.ecommerce;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.entity.*;
import com.ecommerce.repos.*;

@Controller
public class ProductController {

	@Autowired
	EProductRepositry eProductRepositry;

	@Autowired
	ManufacturerRepositry manufacturerRepositry;

	@PostMapping("/add-product")
	@ResponseBody
	public String addProduct(@RequestParam String pName, @RequestParam float pPrice, @RequestParam String mName,
			@RequestParam String mAddr) {

		EProduct e1 = new EProduct();
		e1.setName(pName);
		e1.setPrice(new BigDecimal(pPrice));

		Manufacturer manufacturer = new Manufacturer();
		manufacturer.setName(mName);
		manufacturer.setAddress(mAddr);

		// save the manufacturer using the repo object.
		// repo then will return a manufacturer object that will have id also.
		// id is generated by the database
		manufacturer = manufacturerRepositry.save(manufacturer);
		
		e1.setManufacturer(manufacturer);
		
		e1 =eProductRepositry.save(e1);
		
		return "added eproduct with id " + e1.getID() + " it has manuafacturer with id "+manufacturer.getID();

	}
	
	@GetMapping("/delete-product")
	@ResponseBody
	public String deleteProduct(@RequestParam int id) {
		eProductRepositry.deleteById(id);
		return "deleted eproduct " + id;
	}

}
