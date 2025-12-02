package Learn_Locator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn_NameMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//navigate to swag labs page
		driver.get("https://www.saucedemo.com/");
		
		//identifying the elemt
		 WebElement user_name=driver.findElement(By.name("user-name"));
		  WebElement password=driver.findElement(By.name("password"));
		  WebElement button=driver.findElement(By.name("login-button"));
		  
		  //validating the elemnt
		  System.out.println("user-name is:"+user_name.isDisplayed());
		  System.out.println("Password is:"+password.isDisplayed());
		  System.out.println("button is:"+button.isDisplayed());
		  
		  //performing action
		  user_name.sendKeys("standard_user");
		  password.sendKeys("secret_sauce");
		  button.click();
		  Thread.sleep(3000);
		  driver.close();

	}

}
