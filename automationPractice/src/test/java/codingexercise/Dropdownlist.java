package codingexercise;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdownlist {
	
	public static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		//System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:/Users/AlexanderReyes/Downloads/TestNG/pre-req - webdriver browser/chrome106/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://webclient-5-1-x.webclient-docker.cphdev.deltek.com/workspace/expensesheets;ExpenseSheetNumber=10ES000005");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Administrator");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//dm-login-button")).click();
		//TS
		/*
		By sideTSBy = By.xpath("//a[contains(@dm-data-id,'weeklytimesheets')]");
		waitVisibility(sideTSBy);
		driver.findElement(sideTSBy).click();
		//employee
		By empBy = By.xpath("//div[@dm-data-id='timeregistrationcard-employeenamevar']");
		waitVisibility(empBy);
		driver.findElement(empBy).click();
		
	
		WebElement item2 = driver.findElements(By.xpath("//div[@class='dropdown-menu show']")).get(3);
		System.out.println(item2);
		
		
		*/
		
		//Expense
		/*
		By newExpSheetBy = By.xpath("//button[@dmdataid='dm-add-button']");
		wait.until(ExpectedConditions.elementToBeClickable(newExpSheetBy));
		//waitVisibility(newExpSheetBy);
		driver.findElement(newExpSheetBy).click();
		*/
		
		By jobBy = By.xpath("//*[@dm-data-id='expensesheetscard-jobname']");
		wait.until(ExpectedConditions.elementToBeClickable(jobBy));
		driver.findElement(jobBy).click();
		
		By jobDropDownToggle = By.xpath("//div[contains(@class,'dropdown-toggle')]");
		Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(jobDropDownToggle));
		
		driver.findElement(jobDropDownToggle).click();
		
		
		//thread sleep allow dropdown to populate
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[contains(@dm-data-id,'expensesheetscard-jobname')]//div[contains(@class,'dropdown-toggle')]//dm-spinner/div")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(@dm-data-id,'expensesheetscard-jobname')]//div[contains(@class,'dropdown-toggle')]//dm-spinner/div")));
		//visible  hidden
		
		List<WebElement> jobDropDownListItems = driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu show')]//div[contains(@class,'dropdown-item') and @tabindex='0']"));
		LinkedList<String> link = new LinkedList();	
		for(WebElement x : jobDropDownListItems) {
			//x.wait(1);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
			System.out.println("items" + x.getText());
			
			link.add(x.getText());
		}
		
		System.out.println("count of job items: " + jobDropDownListItems.size());
		System.out.println("Linkedlist item: " + link.getFirst());
		
		/*
		WebElement jobDropDownListItem = driver.findElement(By.xpath("//div[contains(@class,'dropdown-menu show')]//div[contains(@class,'dropdown-item') and @tabindex='0']"));
		//for(WebElement x : jobDropDownListItem) {
		System.out.println("item" + jobDropDownListItem.getText());
		
		//}
		*/		
		
		By jobDropDownListBy = By.xpath("//div[contains(@class,'dropdown-menu show')]//div[contains(@class,'dropdown-item') and @tabindex='0'][2]");
		wait.until(ExpectedConditions.elementToBeClickable(jobDropDownListBy));
		WebElement jobDropDownList = driver.findElement(jobDropDownListBy);
		jobDropDownList.click();
		
		System.out.println("job value: " + driver.findElement(jobBy).getText());
		
		
		
		
		//if have select
		/*
		Select selDrp = new Select(item2);
		selDrp.selectByIndex(2);
		selDrp.
		*/
		driver.close();
		
		System.out.println("success");
	}
	
	public static void waitVisibility(By elementBy) {
		wait = (WebDriverWait) wait.until(ExpectedConditions.elementToBeClickable(elementBy));
		//wait = (WebDriverWait) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
	}
	
}
