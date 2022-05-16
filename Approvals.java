package IBMGPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Approvals extends SuperAdmin {
	 @AfterMethod
	public void pendingApproval(WebDriver driver) throws InterruptedException
	{
		  
			
			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test_editor@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123$");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			Thread.sleep(4000);
		 
		Thread.sleep(3000);
	    //click on Pending Approvals section
	    driver.findElement(By.xpath("//b[text()=' Pending Approvals']")).click();
	    
	    //click on first row drop down three dots
	    Thread.sleep(3000);
	    WebElement dropdown = driver.findElement(By.xpath("(//div[@id='dropdownMenu2'])[1]"));
	    dropdown.click();
	    
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[text()=' Approve ']")).click();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[text()='Yes']")).click();
	    
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}
