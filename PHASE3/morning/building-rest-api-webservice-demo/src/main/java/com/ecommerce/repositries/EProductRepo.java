package com.ecommerce.repositries;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepo extends JpaRepository<EProduct, Integer>, JpaSpecificationExecutor {

	List<EProduct> findAllByName(String name);

	List<EProduct> findAllByPrice(float price);

	List<EProduct> findAllByPriceGreaterThan(float price);

	// Partial name match using JPQL
	@Query("SELECT p FROM EProduct p WHERE p.name LIKE %:name%")
	List<EProduct> getAllProductHavingNameAnywhere(String name);

	// Partial name match and price match using JPQL
	@Query("SELECT p FROM EProduct p WHERE p.name LIKE %:name% and price < :price")
	List<EProduct> getAllProductsHavingNameAnywhereAndPriceLT(String name, float price);

	// Partial name match and price match using SQL
	@Query(value="SELECT * FROM eproduct WHERE name LIKE %:name% and price > :price", nativeQuery=true)
	List<EProduct> getAllProductsHavingNameAnywhereAndPriceGT(String name, float price);

}
