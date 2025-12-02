package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoblazeUITesting {
	
	@Test
	public void addingProduct()
	{
		//configuring and setUp
		WebDriverManager.chromedriver().setup();
		//launching browser
	    WebDriver	driver=new ChromeDriver();
	    //waiting stmnt
	    driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	    //Navigating through URL
	    driver.get("https://www.demoblaze.com/");
	    WebElement nextButton=driver.findElement(By.xpath("//button[text()='Next']"));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", nextButton);
		
		
		
	}

}
