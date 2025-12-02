package HandlingKeyboardActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnig_ShiftingAutoControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		//waiting stments
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//navigating
         driver.get("https://demowebshop.tricentis.com/");
         Actions action=new Actions(driver);
//         for(int i=0;i<=5;i++)
//         {
//         action.sendKeys(Keys.TAB,"computer").perform();
//         }
         action.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"computer").perform();
         
	}

}
