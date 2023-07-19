package com.ecommerce.test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdvancedLocateElementsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();

		// demoXPathCSSSelector(driver);

		// demoElementActionForSelect(driver);

		// demoElementActionForTable(driver);

		//demoAlert(driver);
		
		demoIFrameActions(driver);

		// close the browser and quit.
		// driver.close();
	}

	/* IFrame actions demo */
	static void demoIFrameActions(WebDriver driver) throws InterruptedException {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);

		driver.switchTo().frame("myframe");

		// Now we can click the button
		driver.findElement(By.cssSelector(".DocSearch-Button-Placeholder")).click();
		driver.findElement(By.cssSelector("#docsearch-input")).sendKeys("hello");
		
		driver.switchTo().defaultContent();
		
	}

	/* Alert actions demo */
	static void demoAlert(WebDriver driver) throws InterruptedException {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);

		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		Thread.sleep(10000);

		// Click the link to activate the alert
		driver.findElement(By.linkText("See an example alert")).click();

		Thread.sleep(10000);

		// alert will appear now, may be in 10 secs
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the alert to be displayed and store it in a variable
		wait.until(ExpectedConditions.alertIsPresent());

		// Store the alert in a variable
		Alert alert = driver.switchTo().alert();

		// Store the alert in a variable for reuse
		String text = alert.getText();
		System.out.println(text);

		// Press the Cancel button
		alert.accept();
	}

	/* Table demo */
	static void demoElementActionForTable(WebDriver driver) throws InterruptedException {
		String baseUrl = "https://www.nyse.com/ipo-center/recent-ipo";
		driver.get(baseUrl);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String tableXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table";
		String tableRowXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/tbody/tr";

		// Row count
		List<WebElement> selectIPOTableRows = driver.findElements(By.xpath(tableRowXPath));

		System.out.println("No of rows : " + selectIPOTableRows.size());

		String tableHeadColsXPath = "/html/body/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/table/thead/tr/th";
		// Finding number of Columns
		List<WebElement> columnsNumber = driver.findElements(By.xpath(tableHeadColsXPath));
		int columnCount = columnsNumber.size();
		System.out.println("No of columns in this table : " + columnCount);

		// Finding cell value at 4th row and 3rd column
		WebElement cellAddress = driver.findElement(By.xpath(tableXPath + "/tbody/tr[4]/td[3]"));
		String value = cellAddress.getText();
		System.out.println("The Cell Value is : " + value);

		// JS Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String elementTextChangeScript = "var e = document.querySelector(\"body > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(9) > table > tbody > tr:nth-child(3) > td:nth-child(3) > strong\"); e.textContent=\"Bharat Gas\";";
		js.executeScript(elementTextChangeScript);

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

		for (WebElement option : optionsList)
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
