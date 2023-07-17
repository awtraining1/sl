import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloWorldSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // new FirefoxDriver();
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);
		
//		Thread.sleep(100);
		
		
		
		//do some testing here
		System.out.println("Title of the webpage " + driver.getTitle());
		
		//close the browser and quit.
		driver.close();
	}

}
