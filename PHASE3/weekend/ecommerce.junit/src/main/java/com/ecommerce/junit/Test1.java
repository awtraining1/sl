package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing EProduct implementation")
class Test1 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Inside @BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Inside @AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inside @BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Inside @AfterEach");
	}

	@Test
	@DisplayName("Testing EProduct's add new EProduct functionality")
	void test1() {
		System.out.println("Executing test()1..");
		//fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("Testing EProduct's delete an existing EProduct functionality ")
	void test2() {
		System.out.println("Executing test()2..");
		//fail("Not yet implemented");
	}

}
