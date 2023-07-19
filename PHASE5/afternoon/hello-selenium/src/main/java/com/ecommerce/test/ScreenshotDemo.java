package com.ecommerce.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotDemo {
	
	public static void main(String[] args) throws Exception {
		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		demoTakingScreenshot(driver);

	}

	static void demoTakingScreenshot(WebDriver driver) throws IOException, InterruptedException {

		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";
		driver.get(baseUrl);
		
		Thread.sleep(2000);
		
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		
		File imgTmpFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File destinationFile = new File("F:/tmp/SS.jpg");
		
		Files.copy(imgTmpFile, destinationFile);
	}

}
