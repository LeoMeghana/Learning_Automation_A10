package HandlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring and setup
		WebDriverManager.chromedriver().setup();
		
		//launching browsre
		WebDriver driver=new ChromeDriver();
		
		//navigating
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		//to handle simple popUp
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//close
		driver.quit();

	}

}
