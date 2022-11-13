package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

public class PageTestAnnotations {

	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class!");
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println("Before Test!");
	}

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("Before Suite!");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("Before Method!");
	}
	@Test
	public void Test() {
		System.out.println("Testing!");
	}
}
