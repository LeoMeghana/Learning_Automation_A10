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

public class RemoveProductFromCart {
	
	WebDriver driver;
	
	@BeforeClass
	public void browserSetup()
	{
		//configuration and setUp
		WebDriverManager.chromedriver().setup();
		//launching browser
		driver=new ChromeDriver();
		//navigating to Saucedemo page
		driver.get("https://www.saucedemo.com/");
		
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
		   
		  WebElement cartSymbol=driver.findElement(By.id("shopping_cart_container"));
		  cartSymbol.click();
		   
		   
		
	}
	
	
	
	
	@AfterMethod
	public void remove()
	{
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		System.out.println("Product Removed from cart");
	}
	
	public void checkOut() throws InterruptedException
	{
	WebElement	cartSymbol=driver.findElement(By.id("shopping_cart_container"));
	cartSymbol.click();
	Thread.sleep(3000l);
	 WebElement  checkOutButton=driver.findElement(By.xpath("//button[text()='Checkout']"));
	 checkOutButton.click();
      WebElement	 firstName=driver.findElement(By.id("first-name"));
      firstName.sendKeys("Meghana");
      WebElement lastNamae=driver.findElement(By.id("last-name"));
      lastNamae.sendKeys("Smiley");
      WebElement pinCode=driver.findElement(By.id("postal-code"));
      pinCode.sendKeys("50123");
      WebElement continueButton=driver.findElement(By.id("continue"));
      continueButton.click();
      System.out.println("CheckOut Done SuccessFully!!");
	}
	
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
	public void browserTerminates()
	{
		driver.quit();
		System.out.println("Browser terminated Successfully!!");
	}
	

}
