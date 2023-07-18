package com.ecommerce.test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLocateElementsDemo {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();	
		
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";
		
		driver.get(baseUrl);
		
		List<WebElement> inputAdminElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));
		
		System.out.println("inputAdminElements has "+inputAdminElements.size());
		
		// same as above but by using CSS selectors
List<WebElement> inputAdminElementsUsingCSSSelector = driver.findElements(By.cssSelector("input[id*='admin']"));
		
		System.out.println("inputAdminElementsUsingCSSSelector has "+inputAdminElementsUsingCSSSelector.size());
		
		//close the browser and quit.
		//driver.close();
	}

}
