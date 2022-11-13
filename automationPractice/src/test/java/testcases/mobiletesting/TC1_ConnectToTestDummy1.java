package testcases.mobiletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import utilities.MobileDriver;
 


public class TC1_ConnectToTestDummy1 {

	@Test
	public void connectToTestDummy1() {
		//get android driver
		
		MobileDriver.Initialize();
		
		
		WebElement loginButton = MobileDriver.androidDriver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView[1]"));
		loginButton.click();
		System.out.println("Successful launching mobile application!");
	}


}
