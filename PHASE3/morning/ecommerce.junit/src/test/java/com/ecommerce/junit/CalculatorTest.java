package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	

	@Test
	public void testAdd() {
	Calculator cal =new Calculator();
	
	int x=2;
	int y=5;
	
	assertEquals(7, cal.add(x, y));
		
	}
	
	@Test
	public void testAddForNegativeArguments() {
	Calculator cal =new Calculator();
	
	int x=-1;
	int y=-5;
	
	assertEquals(-6, cal.add(x, y));
		
	}

}
