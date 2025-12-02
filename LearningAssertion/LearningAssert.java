package LearningAssertion;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningAssert {
	
	@Test
	public void verifyTile()
	{
		//configuration and setup
		WebDriverManager.chromedriver().setup();
		//launching browser
	    WebDriver	driver=new ChromeDriver();
	    //maximizing browser
	    driver.manage().window().maximize();
		//navigating to SauceDemo
		driver.get("https://www.saucedemo.com/");
		String actTitle=driver.getTitle();
		//System.out.println(actTitle);
		String expTitle="Swag Lab";
//		if(actTitle.equalsIgnoreCase("Swag Labs"))
//		{
//			System.out.println("TestPass:Title Verified");
//		}
//		else
//		{
//			System.out.println("TestFailed!!");
//		}
		Assert.assertEquals(actTitle, expTitle);
		
		driver.quit();
	}

}
