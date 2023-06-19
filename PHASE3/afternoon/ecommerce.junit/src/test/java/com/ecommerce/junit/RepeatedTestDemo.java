package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	@RepeatedTest(5)
	void testAddPositiveValues() {
		
		Calculator cal = new Calculator();
		
		int a=2;
		int b=5;
		
		assertTrue(7 ==cal.add(a, b));
	}

}
