package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTestDemo {

	

	@TestFactory
	Collection<DynamicTest> dynamicTests() {
		
	
        return Arrays.asList(
        		
        		 dynamicTest("simple dynamic test", () -> assertTrue(true)),
        		 
        		 dynamicTest("simple dynamic test 2", () -> assertEquals(7, Math.addExact(2,5))),
        		 
        		 dynamicTest("dynamic test to test add functionality of Calculator", () -> assertEquals(7, new Calculator().add(2,5))),
        		 
        		 dynamicTest("dynamic test to test division functionality of Calculator", () -> assertEquals(2, new Calculator().divide(5,2)))
        		
        		);
        
	}

}
