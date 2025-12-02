package HandlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPromtAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launch browser
       WebDriver  driver=new ChromeDriver();
       
       //waiting stmt
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       WebDriverWait wait= new WebDriverWait(driver, 30l);
       
       //maximizring
       //driver.manage().window().maximize();
       
       //navigating
       driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
       
       //handling Prompt popup
       driver.findElement(By.xpath("//button[@onclick='myPromp()']")).click();
       
       //Thread.sleep(3000);
//       wait.until(ExpectedConditions.visibilityOf(null))
       driver.switchTo().alert().sendKeys("Meghnaa");
       Thread.sleep(2000);
       driver.switchTo().alert().accept();
       
       //close
       //driver.quit();
       
       

	}

}
