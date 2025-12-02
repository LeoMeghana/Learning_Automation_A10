package LearningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	
	@Test
	public void Task1()
	{
		//configuration and setup
		WebDriverManager.chromedriver().setup();
		
		//launching browser
	     WebDriver	driver=new ChromeDriver();
	     
	     //loadPage
	     driver.get("https://www.saucedemo.com/");
	     
	     //Create an Instance for login page
	      LoginPage loginObj=new LoginPage(driver);
	      
	      driver.navigate().refresh();
	      
	      loginObj.getuserName_textField().sendKeys("standard_user");
	      loginObj.getpassword_textField().sendKeys("secret_sauce");
	      loginObj.getlogin_button().click();
	}

}
