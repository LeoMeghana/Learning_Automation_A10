package LearningPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1_HomePage {
	
	@Test
	public void login() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();//Configuration and setup
	     WebDriver	driver=new ChromeDriver();//launching browser
	     driver.get("https://www.saucedemo.com/");//Navigating through URL
	     Task1_POMFile homeObj=new Task1_POMFile(driver);
	     //____________Using property file to fetch data________________
	     FileInputStream fis=new FileInputStream("./src/test/resources/PropertyFiles/sauceDemoLoginData.properties/");
	     Properties obj=new Properties();
	     obj.load(fis);
	  
	     //_____________LOGIN ACTIONS__________________________
	     homeObj.getuserName_t1().sendKeys(obj.getProperty("userName_t1"));//username entered
	     homeObj.getpassword_t1().sendKeys(obj.getProperty("password_t1"));
	     homeObj.getloginButton_t1().click();
	     
	     //>>>>>>>>>>Using Assertions to Validate HomePage<<<<<<<<<<<<<<<<<
	     String homePageUrl="https://www.saucedemo.com/inventory.html";
	     String actualUrl=driver.getCurrentUrl();
	     Assert.assertEquals(homePageUrl, actualUrl);
	     System.out.println("HomePage is verified Succesfully!!");
	     
	     //click on item
	     homeObj.getitem().click();
	     //click on addtoCart button
	     homeObj.getaddToCartButton().click();
	     //click on cartContainer
	     homeObj.getcartContainer().click();
	     //clik on checkOut Button
	     homeObj.getcheckoutButton().click();
	     //checkOut Information
	     homeObj.getfirstName().sendKeys(obj.getProperty("firstName"));
	     homeObj.getlastName().sendKeys(obj.getProperty("lastName"));
	     homeObj.getzipCode().sendKeys(obj.getProperty("zipCode"));
	     homeObj.getconinueButton().click();
	     homeObj.getfinishButton().click();
	     
	     //completepage(LastPAge)
	     String lastPageUrl="https://www.saucedemo.com/checkout-complete.html";
	     String actualUrlOfLP=driver.getCurrentUrl();
	     
	     //>>>>>>>>>>using SoftAssert<<<<<<<<<<<<<<<<<<<<
	     SoftAssert softObj=new SoftAssert();
	     softObj.assertEquals(lastPageUrl, actualUrlOfLP);
	     softObj.assertAll();
	     System.out.println("CheckOut Completed Succesfully!");
	    
	    System.out.println( homeObj.getpagetext().getText());
	     
	     
	     
		
	}

}
