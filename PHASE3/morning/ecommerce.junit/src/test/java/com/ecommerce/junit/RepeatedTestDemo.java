package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo {

	@RepeatedTest(5)
	public void testAdd() {
	Calculator cal =new Calculator();
	
	int x=2;
	int y=5;
	
	assertEquals(7, cal.add(x, y));	
	System.out.println("at the end of testAdd()");
	}

}
