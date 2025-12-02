package LearnigTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddProductToCart {
	
	WebDriver driver;
	//waiting stmt
	
	
	
	@BeforeClass
	public void BrowserSetup()
	{
		//configuration and setup
	    WebDriverManager.chromedriver().setup();
	    //launching browser
	     driver=new ChromeDriver();
	        //navigating to Saucedemo site
	        driver.get("https://www.saucedemo.com/");
	        System.out.println("Browser opened");
	}
	
	@BeforeMethod
	public void login()
	{
		
	    WebElement	userName=driver.findElement(By.id("user-name"));
	    userName.sendKeys("standard_user");
	    System.out.println("Username Entered.");
	    WebElement password=driver.findElement(By.id("password"));
	    password.sendKeys("secret_sauce");
	    System.out.println("Password Entered.");
	    
	    WebElement button=driver.findElement(By.id("login-button"));
	    button.click();
	    System.out.println("Login Success!!");
	}
	
	@Test
	public void addFirstProduct()
	{
	    WebElement  prod=driver.findElement(By.xpath("//div[contains(text(),'Backpack')]"));
	    prod.click();
	    
	   WebElement addCart=driver.findElement(By.id("add-to-cart"));
	   addCart.click();
	   System.out.println("Product is added to Cart");
	}
	
	@AfterMethod
	public void logOut() throws InterruptedException
	{
		WebElement menu=driver.findElement(By.xpath("//button[text()='Open Menu']"));
		menu.click();
		Thread.sleep(3000l);
		WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		System.out.println("LogOut Done Succesfull");
	}
	
	@AfterClass
	public void BrowserTerminates()
	{
		driver.quit();
		System.out.println("Browser Termination is Done");
	}

}
