package HandlingPopUps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNotificationPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		
//		//Customise the Browser Settings(AS of now we are just skipping the notifications,after we handle)
//	      ChromeOptions	option=new ChromeOptions();
//	  
//	   //1.Disble the notification
//		 option.addArguments("--disable-notifications");//--allow-silent-push,--disable-notifications
//		 
//		 
		//launching browser
		//WebDriver driver=new ChromeDriver(option);//(Exaple for constructor overloading)
//		
//		
//	        
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
        //navigating to easemytrip site
	        driver.get("https://www.easemytrip.com/");
	        
	        Actions action=new Actions(driver);
	        Thread.sleep(3000);
	        action.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		
		

	}

}
