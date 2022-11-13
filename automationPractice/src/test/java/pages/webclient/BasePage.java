package pages.webclient;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}
	
	
	//**********Button
	public void click(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).click();
	}
	
	//**********Text
	public void setText(By elementBy, String text) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}
	
	public String getText(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).getText();
	}
	
	public void clearText(By elementBy) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).clear();
	}
	
	public void VerifyExists(By elementBy) {
		waitVisibility(elementBy);
		boolean elementExists = driver.findElement(elementBy).isDisplayed();
		if (!elementExists) {
			Assert.fail("Error: Element does not exist.");
		} 
	}
	
	public void VerifyState(By elementBy, boolean isEnabled) {
		waitVisibility(elementBy);
		boolean elementIsEnabled = driver.findElement(elementBy).isEnabled();
		if (elementIsEnabled == isEnabled) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("Incorrect State");
				
		}
	}
	
	//**********Dropdownlist
	public void SelectItemByIndex(By elementsBy) {
		
		driver.findElements(elementsBy);
	}
	
	
	
	
	//**********Table
	
}
