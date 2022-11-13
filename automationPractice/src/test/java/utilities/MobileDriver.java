package utilities;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MobileDriver {
	
	public static AndroidDriver androidDriver = null;
	public static void Initialize() {
		
		// appium driver configuration
		// to get appPackage and appActivity, launch emulator or device and enter its
		// shell first and open the app we want to test, type 1) adb -s emulator-5554 shell 2) dumpsys window windows | grep -e "mCurrentFocus"
		
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
		
		
	}
}
