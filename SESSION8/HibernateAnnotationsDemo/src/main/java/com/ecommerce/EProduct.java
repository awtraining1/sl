package com.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "eproduct")   
public class EProduct {
	
	 @Id
	 @GeneratedValue 
	 @Column(name="ID")
	 private long ID;
	 
	 @Column(name="name")
     private String name;
     
	 @Column(name="price")
     private BigDecimal price;
     
	 @Column(name="date_added")
     private Date dateAdded;
     
     public EProduct() {
    	 
     }

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}
	
     

}
