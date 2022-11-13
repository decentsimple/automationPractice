package archive_working_originals;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC1_ConnectToTestDummy1 {

	@Test
	public void connectToTestDummy1() {
		// Appium driver configuration
		// to get appPackage and appActivity, launch emulator or device and enter its
		// shell first and open the app we want to test, type 1) adb -s emulator-5554
		// shell 2) Dumpsys window windows | grep -e "mCurrentFocus"
		AndroidDriver androidDriver = null;
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 6 Pro");
			desiredCapabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			desiredCapabilities.setCapability("appPackage", "com.wdiodemoapp");
			desiredCapabilities.setCapability("appActivity", "com.wdiodemoapp.MainActivity");

			// set of URL need to be inside try catch else URL isn't working

			// set appium server
			URL appiumServer = new URL("http://localhost:4723/wd/hub");

			androidDriver = new AndroidDriver(appiumServer, desiredCapabilities);

		} catch (Exception e) {
			e.printStackTrace();
		}

		WebElement loginButton = androidDriver
				.findElement(By.xpath("//android.widget.Button[@content-desc=\"Login\"]/android.widget.TextView[1]"));
		loginButton.click();
		System.out.println("Successful launching mobile application!");
	}

}
