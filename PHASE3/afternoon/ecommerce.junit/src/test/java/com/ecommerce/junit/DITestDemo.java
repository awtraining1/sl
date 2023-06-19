package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class DITestDemo {

	@Test
	@DisplayName("TEST 1")
	@Tag("addition")
	@Tag("calculator")
	void test(TestInfo testinfo) {
		// ...as usual test our calculator add functionality
		
		System.out.println("I am a test case. My display name is "+ testinfo.getDisplayName());
		
		System.out.println("I am a test case. I have been tagged as "+ testinfo.getTags());
		
		assertTrue(testinfo.getTags().contains("addition"));
		
	}

}
