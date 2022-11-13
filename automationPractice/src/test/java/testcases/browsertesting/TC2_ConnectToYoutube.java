package testcases.browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC2_ConnectToYoutube {

	@Test
	public void connectToGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome106/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launch browser
		driver.get("http://youtube.com");
		
		driver.quit();
	}
}
