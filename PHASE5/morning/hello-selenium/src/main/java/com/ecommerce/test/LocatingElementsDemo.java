package com.ecommerce.test;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocatingElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		
		String baseUrl = "https://accounts.google.com/signup/v2?biz=true&flowEntry=SignUp";
		
		driver.get(baseUrl);		
		
		// Let's locate the first name text field by its id.
		WebElement firstNameTF = driver.findElement(By.id("firstName"));				
		firstNameTF.sendKeys("My First Name is ");
		
		// Let's locate the surname name text field by its name.
		WebElement surNameTF = driver.findElement(By.name("lastName"));
		surNameTF.sendKeys("My Surname is ...");
		
		// The Next button using its class
		WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
		System.out.println("Text on the button is "+nextButton.getText());
		
		//close the browser and quit.
		//driver.close();
	}

}
