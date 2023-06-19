package com.ecommerce.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@DisplayName("JUnit 5 Conditional Tests Example")
class ConditionalTestsDemo {

	 @Test
     @EnabledOnOs({OS.WINDOWS})
     public void runOnWindows() {
             System.out.println("This runs on Windows");
     }
     
	 @Test
     @EnabledOnOs({OS.LINUX})
     public void runOnLinux() {
             System.out.println("This runs on Linux");
     }
	 
	 @Test
     @EnabledIf("true")
     void mightNotBeExecuted() {  
		 System.out.println("This may or not execute ");
     }
}


