package com.ecommerce.repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.Manufacturer;

@Repository
public interface ManufacturerRepositry extends JpaRepository<Manufacturer, Integer>{

}
