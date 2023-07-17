package com.ecommerce.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) {
		
		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);
		
		System.out.println("Title of webpage "+driver.getTitle());

	}

}
