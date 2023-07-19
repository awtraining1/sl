package com.ecommerce.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoITDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		demoFileUpload(driver);
		
		driver.close();
	}
	
	static void demoFileUpload(WebDriver driver) throws InterruptedException, IOException {
		String baseUrl = "File:///F:\\Users\\HomeWk\\git\\sl\\PHASE5\\morning\\hello-selenium\\src\\main\\resources\\test.html";

		driver.get(baseUrl);

	    //driver.get("https://demoqa.com/automation-practice-form");
	    
	    Thread.sleep(10000);

	    driver.findElement(By.cssSelector("#uploadPicture")).click();
	    
	    Thread.sleep(10000);
	    
	    Runtime.getRuntime().exec("F:\\tmp\\PhaseTest.exe");
	    
	    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
}
