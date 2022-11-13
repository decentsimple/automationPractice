package codingexercise.constructor;

import org.testng.Assert;

public class BooleanChecker {

	public static void main(String[] args) {
		ElementIsEnabled(null, true);
		System.out.println("continue");
	}
	
	public static void ElementIsEnabled(String element, boolean isEnabled) {
		
		boolean elementIsEnabled = true;
		if (elementIsEnabled == isEnabled) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("Error Incorrect");
			
		}
		
	}
}
