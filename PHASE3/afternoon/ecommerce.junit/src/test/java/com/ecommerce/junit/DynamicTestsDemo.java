package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTestsDemo {

	@TestFactory
	Collection<DynamicTest> dynamicTests1() {
		
		return Arrays.asList(
		
		dynamicTest("Dynamic test 1", () -> assertTrue(7 ==new Calculator().add(2, 5))),
		
		dynamicTest("Dynamic test 2 for cal div", () -> assertTrue(2 ==new Calculator().divide(5, 2))),
		
		dynamicTest("Dynamic test 3 for cal div by 0", () -> assertThrows(ArithmeticException.class, () -> new Calculator().divide(5,0)))
		
		);		
		
	}
	
	/*
	 * @TestFactory Collection<DynamicTest> dynamicTests2() {
	 * 
	 * int[] a= {2,3,4} ; int[] b= {5,6,7}; int[] result= {7,9,11}; int i=0;
	 * 
	 * return Arrays.asList(
	 * 
	 * dynamicTest("Dynamic test ", () -> assertTrue(result[i++] ==new
	 * Calculator().add(a[i++],b[i++]))), dynamicTest("Dynamic test ", () ->
	 * assertTrue(result[i++] ==new Calculator().add(a[i++],b[i++]))),
	 * dynamicTest("Dynamic test ", () -> assertTrue(result[i++] ==new
	 * Calculator().add(a[i++],b[i++])))
	 * 
	 * );
	 * 
	 * }
	 */

}
