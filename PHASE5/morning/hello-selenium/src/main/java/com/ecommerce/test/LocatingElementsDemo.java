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
		firstNameTF.sendKeys("Myname");
		
		// Let's locate the surname name text field by its name.
		WebElement surNameTF = driver.findElement(By.name("lastName"));
		surNameTF.sendKeys("latName");
		
		// The Next button using its class
		WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
		System.out.println("Text on the button is "+nextButton.getText());
		nextButton.click();
		
//		String dayXPath ="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/input";
//		WebElement dayTF = driver.findElement(By.xpath(dayXPath));
//		dayTF.sendKeys("10");
		
//		String dayRelativeXPath = "//*[@id=\"day\"]";
//		WebElement dayTF1 = driver.findElement(By.xpath(dayRelativeXPath));
//		dayTF1.sendKeys("10");
		
		WebElement dayTF1 = driver.findElement(By.id("day"));
		dayTF1.sendKeys("10");
		
		
		//close the browser and quit.
		//driver.close();
	}

}
