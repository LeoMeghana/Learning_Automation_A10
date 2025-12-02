package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHoldRelease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launch browser
	    WebDriver	driver=new ChromeDriver();
	    //waiting stment
	    driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	    //navigating
	    driver.get("");

	}

}
