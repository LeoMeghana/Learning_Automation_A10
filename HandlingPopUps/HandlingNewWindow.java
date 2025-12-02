package HandlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
				WebDriverManager.chromedriver().setup();
				
				//launch browser
			     WebDriver  driver=new ChromeDriver();
			     
			     //maximizing browser
			     driver.manage().window().maximize();
			     
			     //navigating to tutorialpoint via url
			     driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
			     
			     String parentAdddriver = driver.getWindowHandle();
			     
			     WebElement newWindow=driver.findElement(By.xpath("//button[text()='New Window']"));
			     newWindow.click();
			     Set<String> allWindows = driver.getWindowHandles();
			     
			     int count=allWindows.size();//2
			     
			     for(String str:allWindows)
			     {
			    	 if(parentAdddriver.equals(str)) {
			    		 driver.switchTo().window(str);
			    		 System.out.println(driver.getTitle());
			    	 }
			     }
	}
}
			     
			     


			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     
			     

			     
			    			     
//			   Set<String> winCounts = driver.getWindowHandles();
//			   
//			   System.out.println(winCounts);
//			   //we want to print  in list way
//			   
//			   for(String window_id:winCounts)
//			   {
//				   if(!parentAdddriver.equals(window_id))
//				   {
//					   driver.switchTo().window(window_id);
//					   //fetching child window title
//					 String title= driver.getTitle();
//				   System.out.println("Title is:"+title);
//				   }
//			   }


