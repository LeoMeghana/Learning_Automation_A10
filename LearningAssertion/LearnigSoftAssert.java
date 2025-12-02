package LearningAssertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnigSoftAssert {
	
	@Test
	public void VerifyTitle()
	{
		//configuring
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		//navigating
		driver.get("https://www.saucedemo.com/");
		//fetching title
		String actTitle="Swag Lab";//Title wrong also  testFail is not done
		String expTitle=driver.getTitle();
		SoftAssert obj=new SoftAssert();
		obj.assertEquals(actTitle, expTitle);
		obj.assertAll();
		driver.close();
		
	}

}
