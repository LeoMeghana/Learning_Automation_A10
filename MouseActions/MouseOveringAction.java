package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOveringAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring and setup
		WebDriverManager.chromedriver().setup();
		
		//launhcing brwosrr
	     WebDriver	driver=new ChromeDriver();
	     
	     //waiing
	     driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	     
	     //navigating to Qspiders Sitecc
	     driver.get("https://qspiders.com/");
	     
	     WebElement  offline=driver.findElement(By.xpath("//span[text()='Offline Centers']"));
	     //handling Mouse Actions
	     Actions action=new Actions(driver);
	     action.moveToElement(offline).perform();
	     
	    
	     //identifying hyd
	     WebElement  hyd=driver.findElement(By.xpath("//button[text()='Hyderabad']"));
	     action.moveToElement(hyd).perform();
	   
	    //course type
	    WebElement  course=driver.findElement(By.xpath("//button[contains(text(),' Complete Course with Java Selenium')]"));
        action.moveToElement(course).perform();
	
        //branch
	    WebElement  branch=driver.findElement(By.xpath("//h3[text()='Kphb Qspiders']"));
	    action.moveToElement(branch).perform();
	   
	   //click 
	   branch.click();
	   WebElement   title=driver.findElement(By.xpath("//div[text()='kphb qspiders']"));
	   System.out.println(title.getText());
	
	
	}

}
