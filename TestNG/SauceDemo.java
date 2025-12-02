package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {
	WebDriver driver;
	
	@BeforeClass
	public void browserSetup()
	{
	   WebDriverManager.chromedriver().setup();
	   ChromeOptions option=new ChromeOptions();
	   option.addArguments("--disable-notifications");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void login()
	{
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test
	public void clickOnProduct()
	{
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
	}
	
	@AfterClass 
	public void browserteardown()
	{
		driver.close();
		
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(5);
	    driver.findElement(By.id("logout_sidebar_link")).click();
	    String ExpTitle=driver.getTitle();//Swag Labs
	    String actualTitle="Swag Lab";
	    Assert.assertEquals(actualTitle, ExpTitle);
	    
	}
	
	

}
