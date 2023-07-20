package com.ecommerce.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class FBRegistration {
	public String baseUrl = "file:///F:/Users/HomeWk/git/sl/PHASE5/morning/hello-selenium/src/main/resources/test.html";
	private WebDriver driver;
	
	@Test
	public void f() {
		System.out.println("Inside Test f()");
		
		driver.get(baseUrl);

		WebElement selectMonthElement = driver.findElement(By.id("month"));
		Select selectMonth = new Select(selectMonthElement);

		System.out.println("selectMonth is muti select " + selectMonth.isMultiple());

		selectMonth.selectByIndex(0);
		selectMonth.selectByIndex(6);

		List<WebElement> optionsList = selectMonth.getAllSelectedOptions();

		for (WebElement option : optionsList)
			System.out.println("selectMonth selected options are " + option.getText());
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside beforeClass");
		
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Inside afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Inside afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HomeWk\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get(baseUrl);
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}

}
