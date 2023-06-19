package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Nested Example")
class NestedTestDemo {
	
	@Test
	public void testAdd() {
		Calculator cal =new Calculator();
		
		int x=2;
		int y=5;
		
		assertEquals(7, cal.add(x, y));	
		System.out.println("at the end of testAdd()");
		}

	
	@Nested
    @DisplayName("Tests for the class A")
    class A {        
 
        @Test
        void sampleTestForMethodA1() {
            System.out.println("Example test for method A1");
        }
        
        @Test       
        void sampleTestForMethodA2() {
            System.out.println("Example test for method A2");
        }        
	}
	
	@Nested
    @DisplayName("Tests for the class  B")
    class B {        
 
        @Test
        void sampleTestForMethodB1() {
            System.out.println("Example test for method B1");
        }
        
        @Test       
        void sampleTestForMethodB2() {
            System.out.println("Example test for method B2");
        }        
	}
	
}
 