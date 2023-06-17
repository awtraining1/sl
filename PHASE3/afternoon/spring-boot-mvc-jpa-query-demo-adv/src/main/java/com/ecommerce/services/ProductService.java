package com.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositries.EProductRepositry;

import jakarta.persistence.criteria.Predicate;

@Service
public class ProductService {

	@Autowired
	EProductRepositry eProductRepositry;

	public List<EProduct> findAllWherePriceIsInBetweenAndNameLike(String name, float minPrice,float maxPrice){
		
		Specification<EProduct> specification = (root, query, builder) -> {
			
			Predicate predicate1 = builder.like(root.get("name"), "%" + name + "%");
			
			Predicate predicate2 = builder.greaterThan(root.get("price"), minPrice);
			
			Predicate predicate3 = builder.lessThan(root.get("price"), maxPrice);
			
			return builder.and(predicate1,predicate2,predicate3);		
		};
		
		return eProductRepositry.findAll(specification);
	}
	
	

}
