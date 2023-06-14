package com.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.EProduct;
import com.ecommerce.repositries.EProductRepo;

import jakarta.persistence.criteria.Predicate;

@Service
public class ProductService {

	@Autowired
	EProductRepo eProductRepo;

	public List<EProduct> getAllProductsHavingNameAnywhereAndPriceLT(String name, float price) {

		Specification<EProduct> specification = (root, query, builder) -> {

			Predicate predicate1 = builder.like(root.get("name"), "%" + name + "%");

			Predicate predicate2 = builder.lessThan(root.get("price"), price);

			return builder.and(predicate1, predicate2);

		};

		return eProductRepo.findAll(specification);

	}

}
