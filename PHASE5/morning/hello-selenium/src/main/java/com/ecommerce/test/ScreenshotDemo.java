package com.ecommerce.test;

import java.io.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotDemo {
	
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		demoTakingScreenshot(driver);
		
		driver.close();
	}
	
	static void demoTakingScreenshot(WebDriver driver) throws InterruptedException, IOException {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		
		File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File destinationPath = new File("F:/tmp/myScreenshot.jpg");
		
		Files.copy(imgTmpFile, destinationPath);		
		
	}

}
