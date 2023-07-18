package com.ecommerce.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedLocatingElements {

	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
				WebDriver driver = new ChromeDriver();
				
				demoAdvancedXPathCSSSelector(driver)

	}
	
	static void demoAdvancedXPathCSSSelector(WebDriver driver) {
		
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";

		//String baseUrl = "https://github.com/awtraining1/sl/blob/main/PHASE5/afternoon/hello-selenium/src/main/resources/test.html";
		
		driver.get(baseUrl);
		
		
		List<WebElement> inputAdminElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println("inputAdminElements has " + inputAdminElements.size());		
		
	}
	
	

}
