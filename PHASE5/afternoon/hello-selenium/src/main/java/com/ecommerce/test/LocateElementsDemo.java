package com.ecommerce.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElementsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
				WebDriver driver = new ChromeDriver();
				
				// Demo for locating TextFeild, Button, Select
				// using id, name and className, xpath
				// googleAccCreation(driver);
				
				/* Demo locating Select and Radio Elements*/
				facebookAccCreation(driver);
	}

	/* Automate Select and Radio Elements*/
	public static void facebookAccCreation(WebDriver driver) throws InterruptedException {
		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";
		
		driver.get(baseUrl);
		
		//The Day Dropdown
		//*[@id="day"]
		///html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]
		
		String fullXPathOfDayDropDown = 
				"/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
		WebElement dayDropDown = driver.findElement(By.xpath(fullXPathOfDayDropDown));
		
		Select select = new Select(dayDropDown);
		select.selectByVisibleText("11");
		
		// TRY THIS - Locate the month and year
		
		// Locate the Gender and set it to M/F/C
//		WebElement gender= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
//		gender.click();
		
		//WebElement gender= driver.findElement(By.cssSelector("#u_0_5_eQ")); // NOT WORKING, because id are dynamically generated
		WebElement gender= driver.findElement(By.cssSelector("span > span > input[type='radio'][value='1']"));
		gender.click();
		

	}
	
	public static void googleAccCreation(WebDriver driver) throws InterruptedException {
						
				String baseUrl = "https://accounts.google.com/signup/v2/createaccount?flowEntry=SignUp";
				
				driver.get(baseUrl);
				
				// Locate the first name feild using id
				WebElement firstNameTF = driver.findElement(By.id("firstName"));				
				//System.out.println("firstname text feild details "+firstNameTF);				
				firstNameTF.sendKeys("firname");
				
				// Locate the last name feild using name
				WebElement lastNameTF = driver.findElement(By.name("lastName"));				
				lastNameTF.sendKeys("lasname");
				
				//Locate the button using class
				WebElement nextButton = driver.findElement(By.className("VfPpkd-vQzf8d"));
				nextButton.click();	
				
				// Locate by XPath
				String xPathOfMonth = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div/div/div[2]/select";
				WebElement monthSelectElement = driver.findElement(By.xpath(xPathOfMonth));
				System.out.println("monthSelectElement details "+monthSelectElement);	
				
				Select select = new Select(monthSelectElement);
				select.selectByValue("6");	
				

				Thread.sleep(15000);				
				driver.close();

	}

}
