package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPage extends BasePage {
	
	//Constructor
	public GmailPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	//objects
	By GmailButton = By.xpath("//span[@class='mobile-before-hero-only']");

	public GmailPage verifyGmailButtonExists() {
		verifyExists(GmailButton);
		return this;
	}
}
