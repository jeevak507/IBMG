package IBMGPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MapToExistingValidation {
    @Test
	public void checkVal() throws InterruptedException
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
		
		WebElement masterCode= driver.findElement(By.xpath("//input[@formcontrolname='MasterProductCode']"));
		WebElement proGroup = driver.findElement(By.xpath("//input[@formcontrolname='ProductGroupRk']"));
		WebElement supplierCode = driver.findElement(By.xpath("//input[@formcontrolname='SupplierCode']"));
		WebElement manufacturerCode = driver.findElement(By.xpath("//input[@formcontrolname='ManufacturerCode']"));
		WebElement defaultSupplier = driver.findElement(By.xpath("//input[@formcontrolname='DefaultSupplier']"));
		WebElement alterSupplier1 = driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier1']"));
		WebElement alterSupplier2 = driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier2']"));
		WebElement alterSupplier3 = driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier3']"));
		WebElement alterSupplier4 = driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier4']"));
		WebElement centralPurchaseUnit = driver.findElement(By.xpath("//input[@formcontrolname='CentralPurchaseUnit']"));
		WebElement centralSaleUnit = driver.findElement(By.xpath("//input[@formcontrolname='CentralSaleUnit']"));
		
	    String mcode = masterCode.getText();
	    String grp = proGroup.getText();
	    String supcode = supplierCode.getText();
	    String manufcode = manufacturerCode.getText();
	    String defaults = defaultSupplier.getText();
	    String alternativesup1 = alterSupplier1.getText();
	    String alternativesup2 = alterSupplier2.getText();
	    String alternativesup3 = alterSupplier3.getText();
	    String alternativesup4 = alterSupplier4.getText();
	
	    if(mcode.length()<9)
		{
			System.out.println("Master product code length under 8 char");
		}
		else
		{
			System.out.println("Master Product Code max 8 characters");
			
		}
		
		if(grp.length()<11)
		{
			System.out.println("Product group length under 10 char");
		}
		else
		{
			System.out.println("Product Group max 10 characters");
		}
		
		if(supcode.contains("@"+"#"+"-"))
		{
			System.out.println("Special character not allowed");
		}
		else
		{
			System.out.println("Execute successfully");
		}
		
		if(manufcode.contains("@"+"#"+"-"))
		{
			System.out.println("Special Character not allowed");
		}
		else
		{
			System.out.println("Only accept varchar");
		}
		
		
	}
}
