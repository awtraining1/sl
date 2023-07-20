package com.ecommerce.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HelloWorldSeleniumGrid {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {		
		
		ChromeOptions chromeOptions = new ChromeOptions();

//		// Showing a test name instead of the session id in the Grid UI
		chromeOptions.setCapability("se:name", "My simple test");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
		
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);		
		
		System.out.println("Title of webpage "+driver.getTitle());
		
		///Close the browser
		Thread.sleep(1000);// 1 ms
		driver.quit();
	}

}
