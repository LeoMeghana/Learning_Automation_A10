package Selenium_Tasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClosingOneWindowAmongAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		 WebDriver  driver=new ChromeDriver();
		 
		 //maximizing browser
		 driver.manage().window().maximize();
		 
		 //waiting
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		
		 
		 //Navigating to shppersStack via URL
		 driver.get("https://www.shoppersstack.com/");
		 
		
		 
		 //identifying element
		 driver.findElement(By.id("men")).click();

	}

}
