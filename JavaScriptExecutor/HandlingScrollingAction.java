5package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingScrollingAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launch browser
		WebDriver driver=new ChromeDriver();
		//waiting stment
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//navigating to site
		driver.get("https://www.automationexercise.com/");
		//_____________________JS CODE________________________________
		String jsCode1="arguments[0].scrollIntoView(false)";
		String jsCode2="window.scrollBy(0,500)";
		String jsCode3="window.scrollTo(0,500)";
		
		//_______________handling Scroll Action____________________
		
		//1.Identify the element
        	WebElement	 elem = driver.findElement(By.id("susbscribe_email"));
		//2.Perform Typecasting
	    JavascriptExecutor	 jse = (JavascriptExecutor)driver;
		//3.Call the Abstract method
	    //jse.executeScript(jsCode2,elem);
	    
	    //scrollBy
	    jse.executeScript(jsCode2);
	    jse.executeScript(jsCode2);

	}

}
