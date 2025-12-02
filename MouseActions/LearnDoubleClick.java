package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launching chrome
		WebDriver driver=new ChromeDriver();
		//waiting stment
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//navigating to site
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		
		//finding elem
	  WebElement	elem=driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
	  Actions action=new Actions(driver);
	  action.doubleClick(elem).perform();
	  
	 WebElement text=driver.findElement(By.xpath("//div[@id='welcomeDiv']"));
	 Thread.sleep(3000);
	 System.out.println(text.getText());
	}

}
