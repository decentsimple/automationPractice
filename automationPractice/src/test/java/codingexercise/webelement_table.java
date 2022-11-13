package codingexercise;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webelement_table {
public static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		//System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome104/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://webclient-5-1-x.webclient-docker.cphdev.deltek.com/workspace/expensesheets;ExpenseSheetNumber=10ES000005");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Administrator");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//dm-login-button")).click();
	
		//wait to load
		Thread.sleep(12000);
		//get table row count
		By tableRowsBy = By.xpath("//table//tbody//tr");
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(tableRowsBy));
		//WebElement tableRows = driver.findElement(tableRowsBy);
		//driver.findElement(tableRowsBy).getSize();
		List<WebElement> tableRows = driver.findElements(tableRowsBy);
		System.out.println("table size: " + tableRows.size());
		
		
		
		//ClickTableline
		Thread.sleep(5000);
		int selectLineNumber = 2;
		By selectTableLineBy = By.xpath("//table//tbody//tr[" + selectLineNumber + "]");
		WebElement selectTableLine = driver.findElement(selectTableLineBy);
		selectTableLine.click();
		
		
		//verify text on row number and column name
		Thread.sleep(5000);
		
		String tableColumnName;
		int tableRowNumber = 2;
		int tableColumnNumber = 5;
		By getTableValueBy = By.xpath("//table//tbody//tr[" + tableRowNumber + "]/td[" + tableColumnNumber + "]//input");
		WebElement getTableValue = driver.findElement(getTableValueBy);
		System.out.println("table value is: " + getTableValue.getAttribute("title")); 
		

		
		
		
		//ClickTableRowDropDownToggle
		Thread.sleep(5000);
		int selectTableRowNumber = 2;
		int selectTableColumnNumber = 5;
		By clickTableRowDropDownToggleBy = By.xpath("//table//tbody//tr[" + selectTableRowNumber + "]/td[" + selectTableColumnNumber + "]//div[contains(@class,'dropdown-toggle')]");
		WebElement clickTableRowDropDownToggle = driver.findElement(clickTableRowDropDownToggleBy);
		clickTableRowDropDownToggle.click();
		
		
		Thread.sleep(5000);

		System.out.println("success");
	}
}
