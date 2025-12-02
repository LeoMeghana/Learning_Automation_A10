package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launhcing browser
		WebDriver driver=new ChromeDriver();
		//navigating to site
		driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		WebElement elem=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		Actions action=new Actions(driver);
		action.contextClick(elem).perform();

	}

}
