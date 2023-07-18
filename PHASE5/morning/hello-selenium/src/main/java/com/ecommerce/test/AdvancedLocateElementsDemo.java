package com.ecommerce.test;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedLocateElementsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();

		// demoXPathCSSSelector(driver);
		
		// demoElementActionForSelect(driver);
		
		demoElementActionForTable(driver);

		// close the browser and quit.
		// driver.close();
	}

	/* Table demo */
	static void demoElementActionForTable(WebDriver driver) throws InterruptedException {
		String baseUrl = "https://www.nyse.com/ipo-center/recent-ipo";
		driver.get(baseUrl);
		
		String tableFullXpath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table";
		
		Thread.sleep(5000);
		
		// /html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/tbody
		String tableRow = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/tbody/tr";
		
		// Row count
		List<WebElement> selectIPOTableRows = driver.findElements(By.xpath(tableRow));
		
		System.out.println("No of rows : " + selectIPOTableRows.size());
				
	}
	
	/* Select/Multi-select actions demo */
	static void demoElementActionForSelect(WebDriver driver) {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);	
		
		WebElement selectMonthElement = driver.findElement(By.id("month"));
		Select selectMonth = new Select(selectMonthElement);
		
		System.out.println("selectMonth is muti select " + selectMonth.isMultiple());
		
		selectMonth.selectByIndex(0);
		selectMonth.selectByIndex(6);
		
		List<WebElement> optionsList = selectMonth.getAllSelectedOptions();
		
		for(WebElement option : optionsList)
		System.out.println("selectMonth selected options are " + option.getText());		
	}

	static void demoXPathCSSSelector(WebDriver driver) {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);

		List<WebElement> inputAdminElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println("inputAdminElements has " + inputAdminElements.size());

		// same as above but by using CSS selectors
		List<WebElement> inputAdminElementsUsingCSSSelector = driver.findElements(By.cssSelector("input[id*='admin']"));

		System.out.println("inputAdminElementsUsingCSSSelector has " + inputAdminElementsUsingCSSSelector.size());

		WebElement secondH3SiblingOfForm = driver.findElement(By.cssSelector("h3:nth-child(2)"));
		System.out.println("secondH3SiblingOfForm text is " + secondH3SiblingOfForm);
	}

}
