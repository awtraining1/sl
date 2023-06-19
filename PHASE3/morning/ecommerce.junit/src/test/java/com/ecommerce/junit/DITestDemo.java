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

		System.out.println(testinfo.getDisplayName());
		System.out.println(testinfo.getTags());

		assertTrue(testinfo.getTags().contains("addition"));

	}

}
