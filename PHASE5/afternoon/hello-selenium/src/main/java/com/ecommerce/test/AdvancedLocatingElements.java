package com.ecommerce.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedLocatingElements {

	public static void main(String[] args) throws InterruptedException {
		// Basic configuration
		WebDriver driver = new ChromeDriver();

		// demoAdvancedXPathCSSSelector(driver);

		demoTableDetails(driver);

	}

	static void demoAdvancedXPathCSSSelector(WebDriver driver) {

		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";

		// String baseUrl =
		// "https://github.com/awtraining1/sl/blob/main/PHASE5/afternoon/hello-selenium/src/main/resources/test.html";

		driver.get(baseUrl);

		List<WebElement> inputAdminElements = driver.findElements(By.xpath("//input[contains(@id, 'admin')]"));

		System.out.println("inputAdminElements has " + inputAdminElements.size());// 3

		// Same as above but using CSS selectors
		List<WebElement> inputAdminElementsUsingCSSSelectors = driver
				.findElements(By.cssSelector("input[id*='admin']"));
		System.out.println("inputAdminElementsUsingCSSSelectors has " + inputAdminElementsUsingCSSSelectors.size());// 3

		List<WebElement> inputAdminElementsUsingCSSSelectors2 = driver.findElements(By.cssSelector("input[id$='xyz']"));
		System.out.println("input  whose ids end with xyz " + inputAdminElementsUsingCSSSelectors2.size()); // 2

		WebElement h4SecondChildInsideDiv = driver.findElement(By.cssSelector("div[id='eCommerce'] h4:nth-child(2)"));
		System.out.println("h4SecondChildInsideDiv text is " + h4SecondChildInsideDiv.getText()); // h4 second

		// Locate and Process multi select list
		WebElement selectMonthElement = driver.findElement(By.id("month"));
		Select selectMonth = new Select(selectMonthElement);

		System.out.printf("\n selectMonth.isMultiple() = %s", selectMonth.isMultiple());

		selectMonth.selectByIndex(0);
		selectMonth.selectByIndex(3);
		selectMonth.selectByIndex(6);

		List<WebElement> allMonthsSelected = selectMonth.getAllSelectedOptions();
		for (WebElement monthOption : allMonthsSelected) {
			System.out.printf("\n option selected = %s", monthOption.getText());
		}

	}

	// Locate and Process Table (no of rows, no of columns, particular cell data,
	// etc)
	static void demoTableDetails(WebDriver driver) {
		String baseUrl = "https://www.nyse.com/ipo-center/recent-ipo";
		driver.get(baseUrl);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String tableXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table";
		String tableXPathRow = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/tbody/tr";

		List<WebElement> rowList = driver.findElements(By.xpath(tableXPathRow));

		System.out.printf("\n No of rows in IPO table = %s", rowList.size());

		// Column count
		String tableHeadingXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/thead/tr/th";
		List<WebElement> colList = driver.findElements(By.xpath(tableHeadingXPath));

		System.out.printf("\n No of columns in IPO table = %s", colList.size());

		// Finding cell value at 4th row and 3rd column
		WebElement cellAddress = driver.findElement(By.xpath(tableXPath + "/tbody/tr[4]/td[3]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " + value);
		
		//Change the cell contents using JS
		// JS Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String cssSelectScriptForCell3_3 = "var e =document.querySelector(\"body > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(9) > table > tbody > tr:nth-child(3) > td:nth-child(3) > strong\"); e.textContent='Bharat Gas'";
		js.executeScript(cssSelectScriptForCell3_3);
	}

}
