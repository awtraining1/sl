package com.ecommerce.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class RepeatedTestsDemo {

	
	@DisplayName("Add operation test")
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo) {
		
		Calculator calculator = new Calculator();
		
		Assertions.assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
		
		System.out.println("===addNumber testcase executed=== inside " +testInfo.getDisplayName() );
	}

}
