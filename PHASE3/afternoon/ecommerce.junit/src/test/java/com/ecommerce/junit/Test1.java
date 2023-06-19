package com.ecommerce.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("This is my first Test class")
class Test1 {
	
	@BeforeAll
	static void myBeforeAll() {
		// Create a Connectn Obj here that will used in the Test cases Test1,  Test2,....
		System.out.println("Inside  myBeforeAll()");
	}
	
	@AfterAll
	static void myAfterAll() {
		// Close the Connectn Obj here.
		System.out.println("Inside  myAfterAll()");
	}

	@BeforeEach
	void myBeforeEach() {
		// Create a Statement Obj here that will used in the Test cases Test1,  Test2,....
		System.out.println("Inside  myBeforeEach()");
	}
	
	@AfterEach
	void myAfterEach() {
		// close Statement Obj here so that it will release system resources.
		System.out.println("Inside  myAfterEach()");
	}
	
	
	@Test
	@DisplayName("This is my first Test case Test 1")
	void test1() {
		// Test a JDBC SQL Query select * for eproduct
		System.out.println("Test1 ");
	}
	
	@Test
	@DisplayName("This is my second Test case Test 2")
	void test2() {
		// Test a JDBC SQL Query for eproduct where price>1000
		System.out.println("Test2 ");
	}

}
