package IBMGPac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SuperAdmin {
	@Test
	public void launch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://164.52.210.11:8086/");
		
		
//		Login log = new Login();
//		log.account();
		
//		Dashboard dash = new Dashboard();
//		dash.HomePage(driver);
//		dash.logout(driver);
		
		
//		CreateMasterProduct cr = new CreateMasterProduct();
//		cr.create(driver);
//		cr.fields(driver);
//		
//		
//		MapToExistingMaster map = new MapToExistingMaster();
//		map.advanceFilter(driver);
//		
//		Approvals ap = new Approvals();
//		ap.pendingApproval(driver);
		
	}
	  
}
