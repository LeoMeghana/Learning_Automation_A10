package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverToeBay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launch browser
	WebDriver	driver=new ChromeDriver();
	
	//maximizing
	
	
	//navigating
	driver.get("https://www.ebay.com/");
	
	//actions class
    Actions action=new Actions(driver);
    //WebElement	electronics=;
	action.moveToElement(driver.findElement(By.xpath("//a[text()='Electronics']"))).perform();
	action.doubleClick().perform();
	
	}

}
