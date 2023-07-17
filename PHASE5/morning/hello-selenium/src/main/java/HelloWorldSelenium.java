import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);		

	}

}
