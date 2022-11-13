package testcases.browsertesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC5_ConnectToKMCSolutionsAndPopulateContactUs {

	@Test
	public void populateContactUs() {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome106/chromedriver.exe");
		WebDriver webDriver = new ChromeDriver();
		
		webDriver.get("https://kmc.solutions");
		
		//@FindBy(xpath = "//a[contains(@href,'contact-us')]")
		//public WebElement contactUsButton;
		
		WebElement contactUsButton = webDriver.findElement(By.xpath("//a[contains(@href,'contact-us')]"));
		contactUsButton.click();		
		
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@data-reactid,'firstname')][1]")));
		
		WebElement firstNameTextBox = webDriver.findElement(By.xpath("//a[contains(@href,'contact-us')]"));
	}
}
