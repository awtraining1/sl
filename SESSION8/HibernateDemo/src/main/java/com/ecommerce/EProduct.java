package com.ecommerce;

import java.math.BigDecimal;
import java.util.*;

public class EProduct {
	 private long ID;
     private String name;
     private BigDecimal price;
     private Date dateAdded;
     
     // mappings
     private List<Color> colors; // list mapping
     private Collection<ScreenSize> screenSizes; // bag mapping in xml file 
     private Set<OS> os; // set mapping
     private Map finance ;     
     
     
     public EProduct() {
    	 
     }

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public Collection<ScreenSize> getScreenSizes() {
		return screenSizes;
	}

	public void setScreenSizes(Collection<ScreenSize> screenSizes) {
		this.screenSizes = screenSizes;
	}

	public Set<OS> getOs() {
		return os;
	}

	public void setOs(Set<OS> os) {
		this.os = os;
	}

	public Map getFinance() {
		return finance;
	}

	public void setFinance(Map finance) {
		this.finance = finance;
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
