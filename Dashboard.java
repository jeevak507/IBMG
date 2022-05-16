package IBMGPac;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class Dashboard{
	 @Test
		public void HomePage() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://164.52.210.11:8086/");

			driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("reader@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("reader");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			Thread.sleep(7000);

			driver.findElement(By.xpath("//span[text()='reader']")).click();
			driver.findElement(By.xpath("//button[text()='Change Password']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@formcontrolname='oldPassword']")).sendKeys("password@1");
			
			WebElement New_pass=  driver.findElement(By.xpath("//input[@formcontrolname='newPassword']"));
			WebElement Confirm_pass= driver.findElement(By.xpath("//input[@formcontrolname='rePassword']"));
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[text()='Submit']")).click();
			
            String n1= New_pass.getText();
			String n2 =Confirm_pass.getText();
			
			if(n1==n2)
			{
				System.out.println("Password match successfully");
			}
			else
			{
				System.out.println("New password and confirm password does not match");
			}
			
			

		}
	
	

}
