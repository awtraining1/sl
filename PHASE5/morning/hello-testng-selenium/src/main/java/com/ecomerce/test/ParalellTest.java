package com.ecomerce.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParalellTest {
	public String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";
	private WebDriver driver;
	
  @Test(groups="Account Creation")
  static void facebookAccCreation(WebDriver driver) {
	  System.out.println("Inside facebookAccCreation");
	  
		String baseUrl = "https://www.facebook.com/r.php?locale=en_GB&display=page";

		driver.get(baseUrl);
		
		String cssDay = "#day";
		WebElement cssDaySelect = driver.findElement(By.cssSelector(cssDay));	
		
		
		Select daySelect =  new Select(cssDaySelect);
		daySelect.selectByVisibleText("11");
	
		WebElement cssGenderRadio = driver.findElement(By.cssSelector("span > span > input[type='radio'][value='2']" ));
		cssGenderRadio.click();
		
		// Demo find by tag name
		List<WebElement> titleTagElement = driver.findElements(By.tagName("title"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("console.log(arguments[0].innerText)", titleTagElement);
		
		
		System.out.println("WebPage Title is "+titleTagElement.get(0).getText());
		
	}

  
  @Test(groups="Account Creation", dependsOnGroups = {"Launch"})
  static void googleAccCreation(WebDriver driver) {
	  	System.out.println("Inside googleAccCreation");
	  
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

	}
  
  @Test(groups="Launch")
  static void googleWebsiteTitle (WebDriver driver) {
	  System.out.println("Inside googleWebsiteTitle");
	  
	  String baseUrl = "https://www.google.com";
		driver.get(baseUrl);
		
		System.out.println("Google Title is "+driver.getTitle());
  }

  
  @BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
      driver.get(baseUrl);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	} 
}
