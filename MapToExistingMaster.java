package IBMGPac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MapToExistingMaster {
	 @Test
	public void advanceFilter() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://164.52.210.11:8086/");

		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("jack.tester@independentbm.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jack@123$");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(4000);
		 
		driver.findElement(By.xpath("//a[contains(@href,'#/control-report')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@id='dropdownMenu2'])[1]")).click();
		
		//Advance filter 
		driver.findElement(By.xpath("(//button[text()=' Map To Existing Master Product '])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@formcontrolname='MasterProductCode']")).sendKeys("JZROYSXE");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		WebElement element = driver.findElement(By.xpath("//button[text()='Search']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
		//click on '+' button to map with Existing master product
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//button[@title='Assign to this master product']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
		
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Yes']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        
		
	}
	
	
	
}
