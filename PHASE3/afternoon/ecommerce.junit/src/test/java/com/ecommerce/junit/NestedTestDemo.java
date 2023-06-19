package com.ecommerce.junit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTestDemo {

	@Test
	void test() {
		System.out.println("Inside  test()");
	}
	
	@Nested
	class GroupA {
		
		@Test
		void testA1() {
			System.out.println("Inside  testA1()");
		}
		
		@Test
		void testA2() {
			System.out.println("Inside  testA2()");
		}
		
	}
	
	@Nested
	class GroupB {
		
		@Test
		void testB1() {
			System.out.println("Inside  testB1()");
		}
		
		@Test
		void testB2() {
			System.out.println("Inside  testB2()");
		}
		
	}

}
