package IBMGPac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateMasterProduct extends SuperAdmin{
	
		

	public void create(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test_editor@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123$");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//b[text()=' Master Product Details']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Create Master Product']")).click();
	    
		Thread.sleep(3000);
		
		//Product Group under PAC structure 
		driver.findElement(By.id("basic-addon2")).click();
		Thread.sleep(3000);
		Select pac = new Select(driver.findElement(By.xpath("//select[@id='autoSizingSelect']")));
		pac.selectByIndex(3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='100mm Clay Drainage']")).click();
	}
	 public void fields(WebDriver driver) throws InterruptedException
	 {
		
		//product Description
		driver.findElement(By.xpath("//textarea[@formcontrolname='ProductDescription']")).sendKeys("Need to test the description part");
		
		//Code i.e manufacturer code, EAN and TSI code
		driver.findElement(By.xpath("//input[@formcontrolname='ManufacturerCode']")).sendKeys("NewJeevakTest123");
		driver.findElement(By.xpath("//input[@formcontrolname='EAN']")).sendKeys("101023");
		driver.findElement(By.xpath("//input[@formcontrolname='TSICode']")).sendKeys("239011");
		
		//Product Supplier
		driver.findElement(By.xpath("//input[@formcontrolname='SupplierCode']")).sendKeys("suplier Testing");
		driver.findElement(By.xpath("//input[@formcontrolname='DefaultSupplier']")).sendKeys("Default suplier Testing");
		driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier1']")).sendKeys("Alternative1");
		driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier2']")).sendKeys("Alternative2");
		driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier3']")).sendKeys("Alternative3");
		driver.findElement(By.xpath("//input[@formcontrolname='AlternativeSupplier4']")).sendKeys("Alternative4");
		
		//Price
		driver.findElement(By.xpath("//input[@formcontrolname='CentralPurchasePrice']")).sendKeys("765786");
		driver.findElement(By.xpath("//input[@formcontrolname='CentralPurchaseUnit']")).sendKeys("45KG");
		driver.findElement(By.xpath("//input[@formcontrolname='CentralSalePrice']")).sendKeys("7865875");
		driver.findElement(By.xpath("//input[@formcontrolname='CentralSaleUnit']")).sendKeys("abcdefg");
		driver.findElement(By.xpath("//textarea[@formcontrolname='CreatorComments']")).sendKeys("comments need to be test");
		
		//Send for Approval button
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//button[text()=' Send for approval ']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
		Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='OK']")).click();
        
        Thread.sleep(3000);

	 }

}
