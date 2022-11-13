package pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends BasePage {
	
	//**********Constructor
	public GoogleHomePage (WebDriver webDriver) {
		super(webDriver);
	}
	

	//**********Page Environment
	String BaseURL = "http://google.com";
	
	//**********Web Elements
	By gMail = By.xpath("//a[contains(@href,'https://mail.google.com/mail/')]");
	By images = By.xpath("//a[contains(@href,'https://mail.google.com/imghp?')]");
	By logo = By.xpath("//img[@alt='Google']"); //("//div[@id='logo']");
	//**********Page Methods or functions
	
	
	public GoogleHomePage goToGoogle() {
		// Launch browser
		webDriver.get(BaseURL);
		return this;
	}
	
	public GoogleHomePage verifyLogoExists() {
		verifyExists(logo);
		return this;
	}

	public GmailPage clickGmail() {
		click(gMail);
		return new GmailPage(webDriver);
	}
	
	public ImagesPage clickImages() {
		click(images);
		return new ImagesPage();
	}
}
