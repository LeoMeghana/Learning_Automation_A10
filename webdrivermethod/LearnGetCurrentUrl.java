package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		//for wait stmt---Thread.sleep(5000)(5sec)
		  String expected_url="https://www.saucedemo.com/v1/";
		  String actual_url=driver.getCurrentUrl();
		
		  
		if(actual_url.equals(expected_url))
		{
			System.out.println("Verified-Testpass "+actual_url+" "+expected_url);
		}
		else
		{
			System.out.println("Verified-TestFailll!!"+actual_url);
		}
		
		//wait statement
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		//close the browser
		driver.close();		

	}

}
