package com.ecommerce.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("Tests for the method A")
class NestedCasesDemo {

	@Test
	@DisplayName("USER profile")
	void sampleTestForMethodA() {
		System.out.println("Example test for method A");
	}

	@Nested
	@DisplayName("Buyer test cases")
	class WhenX {
		

		@Test
		@DisplayName("Example test for method A when X1 is true")
		void sampleTestForMethodAWhenX1() {
			System.out.println("1 Example test for method A when X1 is true");
		}
		
		@Test
		@DisplayName("Example test for method A when X2 is true")
		void sampleTestForMethodAWhenX2() {
			System.out.println("2 Example test for method A when X2 is true");
		}
	}
	
	@Nested
	@DisplayName("Seller Test cases")
	class WhenXY {
		

		@Test
		@DisplayName("Example test for method A when X1Y is true")
		void sampleTestForMethodAWhenX1() {
			System.out.println("3 Example test for method A when X1Y is true");
		}
		
		@Test
		@DisplayName("Example test for method A when X2Y is true")
		void sampleTestForMethodAWhenX2() {
			System.out.println("4 Example test for method A when X2Y is true");
		}
	}

}
