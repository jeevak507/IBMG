package IBMGPac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Login{
	
	@Test(priority = 1)
	public void email() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://164.52.210.11:8086/");
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("readergmail.com");
		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Email']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String validationMessage = (String)js.executeScript("return arguments[0].validationMessage;", ele);
		System.out.println(validationMessage);
		
		WebElement pass1=  driver.findElement(By.xpath("//input[@type='password']"));
		String n =pass1.getText();
		if(n.length()<6)
		{
			System.out.println("Password must contains 6 characters");
		}
	    
		
		
	}
	
	@Test(priority = 2)
	public void logintest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://164.52.210.11:8086/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("reader@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("reader");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
	}
	
	@Test(priority = 3)
	public void controlReport() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://164.52.210.11:8086/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("reader@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("reader");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[text()=' Control Report']")).click();
		Thread.sleep(3000);
		Select prodCode = new Select(driver.findElement(By.id("autoSizingSelect")));
		prodCode.selectByVisibleText("Product Code");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Product Code']")).sendKeys("abcdefg");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
	}
		
		
}
	
