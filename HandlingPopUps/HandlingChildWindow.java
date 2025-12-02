package HandlingPopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildWindow {

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
	     
	     //fetch the parent window address
	        String  parentWindow=driver.getWindowHandle();
	        System.out.println("Address of Parent Window:"+parentWindow);
	     
	     //identifying element
	      WebElement newTab=driver.findElement(By.xpath("//button[text()='New Tab']"));
	      newTab.click();
	      
	      
	         //Fetching all the windows
	      Set<String> allWindow= driver.getWindowHandles();
	      System.out.println(allWindow.size());
	     for(String windowAddress:allWindow)
	     {
	    	 System.out.println(windowAddress);
	     }
	     
	    
	      

	}

}
