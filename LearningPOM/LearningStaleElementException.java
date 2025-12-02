package LearningPOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningStaleElementException {
	
	@Test
	public void task1()
	{
		//1.launch browser
		   WebDriverManager.chromedriver().setup();
		   WebDriver driver=new ChromeDriver();
		//2.navigate through URL
		   driver.get("https://www.saucedemo.com/");
		//identify username,password,button and store it
		   WebElement  userName_textField=driver.findElement(By.id("user-name"));
		   WebElement password_textField=driver.findElement(By.id("password"));
		   WebElement login_button=driver.findElement(By.id("login-button"));
		//reload the page
		   driver.navigate().refresh();
		//enter username ,password
		   userName_textField.sendKeys("standard_user");
		   password_textField.sendKeys("secret_sauce");
		   login_button.click();//stale element reference Exception
	}

}
