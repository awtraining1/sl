package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class ConditionalTestDemo {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void testAddOnWindows() {
	Calculator cal =new Calculator();
	
	int x=2;
	int y=5;
	
	assertEquals(7, cal.add(x, y));
		
	}
	
	@Test
	@EnabledOnOs({OS.LINUX})
	public void testAddOnLinux() {
	Calculator cal =new Calculator();
	
	int x=2;
	int y=5;
	
	assertEquals(7, cal.add(x, y));		
	}

}
