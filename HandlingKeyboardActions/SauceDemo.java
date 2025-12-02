package HandlingKeyboardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		//waiting stmets
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//navigatinf
		driver.get("https://www.saucedemo.com/");
		
		//perform login using keyboard actions
		WebElement uName=driver.findElement(By.id("user-name"));
		uName.sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.TAB,Keys.ENTER);
		
		
		
		

	}

}
