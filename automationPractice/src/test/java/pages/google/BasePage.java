package pages.google;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public WebDriver webDriver;
	public WebDriverWait wait;

	//constructor
	public BasePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
		
	}
	
	//**********common methods or actions
	
	//wait
	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}

	//click
	public void click(By elementBy) {
		waitVisibility(elementBy);
		webDriver.findElement(elementBy).click();
	}
	
	//write or set text
	public void setText (By elementBy, String text) {
		waitVisibility(elementBy);
		webDriver.findElement(elementBy).sendKeys(text);
	}
	
	//read or get text
	public String getText(By elementBy) {
		waitVisibility(elementBy);
		return webDriver.findElement(elementBy).getText();
	}
	
	//assertequals verify text are equal
	public void verifyTextEquals (By elementBy, String expectedText) {
		waitVisibility(elementBy);
		Assert.assertEquals(getText(elementBy), expectedText);

	}
	
	//verify exists
	public void verifyExists (By elementBy) {
		waitVisibility(elementBy);
		Assert.assertTrue(true);
	}
		
	

}
