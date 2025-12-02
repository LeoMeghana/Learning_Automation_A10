package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebShops {
	
	@Test
	public void demoWebShops()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		DemoWebShopsPOM demoObj = new  DemoWebShopsPOM(driver);
		demoObj.getrigisterLink().click();
		demoObj.getgender().click();
		demoObj.getfirstName().sendKeys("Megha");
		demoObj.getlastName().sendKeys("na");
		demoObj.getemailId().sendKeys("meeena@gmail.com");
		demoObj.getpassword().sendKeys("meena@123");
		demoObj.getconfirmPassword().sendKeys("meena@123");
		demoObj.getregisterButton().submit();
		demoObj.getlogOutLink().click();
		
	}

}
