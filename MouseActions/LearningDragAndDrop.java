package MouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launhcing browser
	WebDriver	driver=new ChromeDriver();
	
	//waiting statement
	driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	
	//navigating to tutorils point
	driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
	
WebElement	from=driver.findElement(By.id("draggable"));

    WebElement   to=driver.findElement(By.id("droppable"));
	
//creating object for Actions class
Actions action=new Actions(driver);
action.dragAndDrop(from,to).perform();
System.out.println("Droppped");



	}

}
