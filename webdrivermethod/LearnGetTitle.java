package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnGetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configuring 
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to the browser
		driver.get("https://www.saucedemo.com/v1/");
	    String	actual_title=driver.getTitle();		
	    System.out.println("Title is:"+actual_title);
	    
	    
	   String expected_title="Swag Labs";
	   if(expected_title.equals(actual_title))
	   {
		   System.out.println("Verified:Test pass.");
	   }
	   else
	   {
		   System.out.println("Verified:Test Fail.");
	   }
		

	}

}
