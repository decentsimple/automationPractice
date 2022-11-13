package testcases.browsertesting;

import org.testng.annotations.Test;

import pages.google.GmailPage;
import pages.google.GoogleHomePage;
import testcases.BaseTest;

public class TC1_ConnectToGoogle extends BaseTest {

	@Test(priority = 0)
	public void launchGoogle() {

		// Instantiation
		GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);

		// access page methods
		googleHomePage.goToGoogle();

	}

	@Test(priority = 1)
	public void verifyLogoIsDisplayed() {
		// instantiate
		GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);

		// start
		googleHomePage.goToGoogle().verifyLogoExists();

	}

	@Test(priority=2)
	public void goToGmail() {
		
		GoogleHomePage googleHomePage = new GoogleHomePage(webDriver);
		GmailPage gmailPage = new GmailPage(webDriver);
		
		//start
		googleHomePage.goToGoogle();
		googleHomePage.clickGmail();
		gmailPage.verifyGmailButtonExists();
	}

}
