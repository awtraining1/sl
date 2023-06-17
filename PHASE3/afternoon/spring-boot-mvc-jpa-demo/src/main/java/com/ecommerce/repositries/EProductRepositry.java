package com.ecommerce.repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Integer>{
	
	List<EProduct> findAllByName(String name);
	
	List<EProduct> findAllByPrice(float price);
	
	List<EProduct> findAllByPriceGreaterThan(float price);
}
