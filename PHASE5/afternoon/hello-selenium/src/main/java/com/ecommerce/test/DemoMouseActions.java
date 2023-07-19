package com.ecommerce.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseActions {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		demoDoubleClick(driver);

	}

	static void demoDoubleClick(WebDriver driver) throws InterruptedException {

		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";
		driver.get(baseUrl);

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		WebElement button = driver.findElement(By.id("dblButton"));
		
		
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
		Thread.sleep(7000);
		
		//We can execute  many actions together.
		Thread.sleep(5000);
		WebElement helloPara = driver.findElement(By.id("xyz"));
		Actions multiActions = new Actions(driver);
		
//		Action action = multiActions
//		.doubleClick(helloPara)
//		.contextClick(helloPara)
//		.pause(5000)
//		.click(helloPara)
//		.build();
//		
//		action.perform();
		
		//PROBLEM
		Actions multiActions2 = new Actions(driver);
		Action action2 = multiActions2
		.moveToElement(button)
		.click(button)
		.pause(1000)
		.moveToElement(helloPara)
		.pause(2000)
		.doubleClick(helloPara)
		.release()
		.build();
		
		action2.perform();
		
		
		
	}
	

}
