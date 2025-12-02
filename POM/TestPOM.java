package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPOM {
	
	@Test
	public void task()
	{
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		LoginPage obj = new LoginPage(driver);
		obj.getuserName().sendKeys("standard_user");
		obj.getpassword().sendKeys("secret_sauce");
		obj.getloginButton().click();
		
	}

}
