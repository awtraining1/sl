package com.ecommerce.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		
		Thread.sleep(5000);// Remove this once we have tested this automation.
		
		actions.doubleClick(buttonElement).perform();
		
		Thread.sleep(5000);
		
		//Double click on the text Hello World
		// Example of build 2 or more actions and them performing all of them together.
		WebElement textHelloWorldElement = driver.findElement(By.id("xyz"));
		Actions actions2 = new Actions(driver);
		
		Action action = actions2
		.doubleClick(textHelloWorldElement)
		.contextClick(textHelloWorldElement)
		.pause(Duration.ofSeconds(10))
		.click(textHelloWorldElement)
		.build();
		
		action.perform();
		
		Thread.sleep(5000);
		
		// Scroll actions
		Actions actions3 = new Actions(driver);
		Action action3 = actions3
				.sendKeys(Keys.PAGE_DOWN)  // scroll one page
				.sendKeys(Keys.PAGE_DOWN)  // scroll another one page
				.build();
		action3.perform();
		
		Thread.sleep(5000);
		
		// Drag and Drop
		Actions actions4 = new Actions(driver);
		Action action4 = actions4
						.clickAndHold(textHelloWorldElement)
						.pause(Duration.ofSeconds(10))
						.dragAndDrop(textHelloWorldElement, buttonElement)
						.build();
		action4.perform();
		
	}

}
