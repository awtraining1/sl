package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseActions {
	
	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		demoDoubleClick(driver);

	}

	static void demoDoubleClick(WebDriver driver) throws InterruptedException {

		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";
		driver.get(baseUrl);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		
		WebElement button = driver.findElement(By.id("dblButton"));
		
		
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
	}

}
