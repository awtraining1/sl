package com.ecommerce.test;

import java.util.List;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingElementsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();	
		
		//	Demo locating by id, name and class
		// googleAccCreation(driver);
		
		// Demo cssSelector
		facebookAccCreation(driver);
			
		//close the browser and quit.
		//driver.close();
	}
	
	static void facebookAccCreation(WebDriver driver) {
		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);
		
		String cssDay = "#day";
		WebElement cssDaySelect = driver.findElement(By.cssSelector(cssDay));	
		
		
		Select daySelect =  new Select(cssDaySelect);
		daySelect.selectByVisibleText("11");
		
		// PROBLEM : locate the gender element and try setting it F/M/C
//		String cssGender = "#u_0_4_nJ";
//		WebElement cssGenderRadio = driver.findElement(By.cssSelector(cssGender));
//		cssGenderRadio.click();
		
		WebElement cssGenderRadio = driver.findElement(By.cssSelector("span > span > input[type='radio'][value='2']" ));
		cssGenderRadio.click();
		
		// Demo find by tag name
		List<WebElement> titleTagElement = driver.findElements(By.tagName("title"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("console.log(arguments[0].innerText)", titleTagElement);
		
		
		System.out.println("WebPage Title is "+titleTagElement.get(0).getText());
		
	}
		
	
	static void googleAccCreation(WebDriver driver) {
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
				
//				String dayXPath ="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div[1]/div/div[1]/input";
//				WebElement dayTF = driver.findElement(By.xpath(dayXPath));
//				dayTF.sendKeys("10");
				
//				String dayRelativeXPath = "//*[@id=\"day\"]";
//				WebElement dayTF1 = driver.findElement(By.xpath(dayRelativeXPath));
//				dayTF1.sendKeys("10");
				
//				WebElement dayTF1 = driver.findElement(By.id("day"));
//				System.out.println("dayTF1 "+dayTF1);
//				dayTF1.clear();
//				dayTF1.sendKeys("10");
				

	}

}
