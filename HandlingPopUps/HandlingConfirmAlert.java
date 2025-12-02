package HandlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure browser
		WebDriverManager.chromedriver().setup();
		
		//launch chromedriver
	    WebDriver	driver=new ChromeDriver();
	    
	    //waiting
	    driver.manage().timeouts().implicitlyWait(30l,TimeUnit.SECONDS);
	    
	    driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
	    
	    driver.findElement(By.xpath("//button[@onclick='myDesk()']")).click();
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    //handling confirm alert
	    driver.switchTo().alert().accept();

	}

}
