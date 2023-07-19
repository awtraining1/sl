package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		demoMouseActions(driver);
	}
	
	static void demoMouseActions(WebDriver driver) throws InterruptedException {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);
		
		WebElement buttonElement = driver.findElement(By.id("dblButton"));
		
		Actions actions = new Actions(driver);
		
		Thread.sleep(10000);// Remove this once we have tested this automation.
		
		actions.doubleClick(buttonElement).perform();
		
		Thread.sleep(10000);
		
		//Double click on the text Hello World
		WebElement textHelloWorldElement = driver.findElement(By.id("xyz"));
		Actions actions2 = new Actions(driver);
		
		Action action = actions2
		.doubleClick(textHelloWorldElement)
		.contextClick(textHelloWorldElement)
		.build();
		
		action.perform();	
		
	}

}
