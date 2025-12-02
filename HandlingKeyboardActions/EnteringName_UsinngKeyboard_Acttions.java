package HandlingKeyboardActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyUpAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnteringName_UsinngKeyboard_Acttions {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		//waiting stmet
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		//navigating
		driver.get("https://www.google.com/");
		//Actions action=new Actions(driver);
		Robot robotObj=new Robot();
		robotObj.keyPress(KeyEvent.VK_M);
		robotObj.keyRelease(KeyEvent.VK_M);
		
		robotObj.keyPress(KeyEvent.VK_E);
		robotObj.keyRelease(KeyEvent.VK_E);
		
		robotObj.keyPress(KeyEvent.VK_G);
		robotObj.keyRelease(KeyEvent.VK_G);
		
		robotObj.keyPress(KeyEvent.VK_A);
		robotObj.keyRelease(KeyEvent.VK_A);
		

	}

}
