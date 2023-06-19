package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	@DisplayName("Testin Cal for positive values")
	void testAddPositiveValues() {
		
		Calculator cal = new Calculator();
		
		int a=2;
		int b=5;
		
		assertEquals(7, cal.add(a, b));
	}
	
	@Test
	void testAddWhenAddingNegativeValues() {
		
		Calculator cal = new Calculator();
		
		int a=-2;
		int b=-3;
		
		assertEquals(-5, cal.add(a, b));
	}
	
	@Test
	void testAddWhenUsingLargeValues() {
		
		Calculator cal = new Calculator();
		
		int a=2500;
		int b=1000;
		
		assertEquals(3500, cal.add(a, b));
	}

}
