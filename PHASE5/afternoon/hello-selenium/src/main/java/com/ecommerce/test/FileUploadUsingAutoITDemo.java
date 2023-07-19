package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoITDemo {

	public static void main(String[] args) throws Exception {
		// Basic configuration
		WebDriver driver = new ChromeDriver();

		demoFileUpload(driver);

	}

	static void demoFileUpload(WebDriver driver) throws InterruptedException {

		// String baseUrl =
		// "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\afternoon\\hello-selenium\\src\\main\\resources\\test.html";
		
		String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrl);

		Thread.sleep(2000);
		
		WebElement uploadFileElememt = driver.findElement(By.id("uploadPicture"));
		
		System.out.println("uploadFileElememt details " +  uploadFileElememt);

	}

}
