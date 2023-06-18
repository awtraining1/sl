package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing assertions")
class AssertionsTestsDemo {
	Calculator calculator=  new Calculator();
	
	 String str = null;
     String str2 = "some value";
     
     String[] a1 = { "A", "B" };
     String[] a2 = { "A", "B" };

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing assertions of two arrays who have same content. Let's see that they are Not equal")
	void testAssertEquals1() {
		assertNotEquals(a1, a2);
	}
	
	@Test
	@DisplayName("Testing assertions of two array elements who have same string content. "
			+ "Let's see that they should be equal, beacuse they are in the string literal pool.")
	void testAssertEquals2() {
		assertEquals(a1[0], a2[0]);
	}
	
	
	@Test
	@DisplayName("Testing calculator class's add method when I pass two positive values.")
	void testAssertEquals3() {
		assertEquals(7, calculator.add(2, 5));
	}
	
	@Test
	@DisplayName("Testing calculator class's add method when I pass two negative.")
	void testAssertEquals4() {
		assertEquals(-5, calculator.add(-2, -3));
	}
	
	@Test
	@DisplayName("Testing other assertions.")
	void testAssertEquals5() {
		 assertTrue(4 > 0);
         assertFalse(5 < 1);
         assertNull(str);
         assertNotNull(str2);
         
         assertSame(str, str);
         assertNotSame(str, str2);
         
         assertEquals(5, 5);
         assertNotEquals(5, 6);
         
         assertArrayEquals(a1, a2);        
         
	}
	
	@Test
	@DisplayName("Testing exception will bethrown when div by zero.")
	public void testDivideByZero() {
		int a = 15;
		int b = 0;
		assertThrows(ArithmeticException.class,()->{
		calculator.divison(a, b);
	 });
	}
	

}
