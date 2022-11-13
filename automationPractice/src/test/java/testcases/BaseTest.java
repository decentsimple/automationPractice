package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	public WebDriver webDriver;
	
	@BeforeSuite
	public void beforeSuite () {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome106/chromedriver.exe");
		webDriver = new ChromeDriver();
		/*
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome106/chromedriver.exe");
			webDriver = new ChromeDriver();
			
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/geckodriver-v0.31.0-win64/geckodriver.exe");
			webDriver = new FirefoxDriver();
			break;
		
		case "android":
			
		
		default:
			break;
		}
		*/
		webDriver.manage().window().maximize();
	}
	
	@AfterSuite
	public void afterSuite() {
		webDriver.close();
		webDriver.quit();
		
	}
	
}
