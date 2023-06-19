package com.ecommerce.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertionsTestDemo {

	@Test
	void test() {
		
		String str = null;
		String str2 = "some value";

		String[] a1 = { "A", "B" };
		String[] a2 = { "A", "B" };
		
		int a=4;
		int b=0;
		
		assertTrue(a > b);
		assertFalse(5 < 1);
		
		assertNull(str);
        assertNotNull(str2);
        
        assertSame(str, str);
        assertNotSame(str, str2);
        
        assertEquals(5, 5);
        assertNotEquals(5, 6);
        
        assertArrayEquals(a1, a2);
        
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException();
    });
		
	}

}
