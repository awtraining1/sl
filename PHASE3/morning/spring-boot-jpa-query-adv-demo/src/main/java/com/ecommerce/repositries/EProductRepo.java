package com.ecommerce.repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepo extends JpaRepository<EProduct, Integer>{
	
	List<EProduct> findAllByName(String name);
	
	List<EProduct> findAllByPrice(float price);
	
	List<EProduct> findAllByPriceGreaterThan(float price);
	
	// Partial name match
	@Query("SELECT p FROM EProduct p WHERE p.name LIKE %:name%")
	List<EProduct> getAllProductHavingNameAnywhere(String name);
}
