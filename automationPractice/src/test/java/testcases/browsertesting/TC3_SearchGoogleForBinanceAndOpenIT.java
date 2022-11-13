package testcases.browsertesting;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC3_SearchGoogleForBinanceAndOpenIT {

	@Test
	public void connectToGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome106/chromedriver.exe");
		WebDriver webdriver = new ChromeDriver();
		
		//Launch browser
		webdriver.get("http://google.com");
		
		WebElement searchTextBox = webdriver.findElement(By.xpath("//input[@name='q']"));
		searchTextBox.click();
		searchTextBox.sendKeys("Binance");
		
		WebElement googleSearchButton = webdriver.findElement(By.xpath("//input[@name='btnK']"));
		googleSearchButton.click();
		
		WebElement firstGoogleSearchResult = webdriver.findElement(By.xpath("//h3[contains(text(),'Binance: Buy/Sell Bitcoin')]"));
		firstGoogleSearchResult.click();
		
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/a")));
		
		String verifyURL = webdriver.getCurrentUrl();
		assertEquals(verifyURL, "https://www.binance.com/en", "Verification failed, " + verifyURL + " is not equal to https://www.binance.com/en");

		
		webdriver.quit();
		
	}
}
