package LearningiFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnigCompoundiFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Configure and setuup
		WebDriverManager.chromedriver().setup();
		
		//Launching browser
	    WebDriver driver=new ChromeDriver();
	    
	    //Maximizing browser
	    
	    //Navigate
	    driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");

	    //switching from Mainpage to iframe
	    driver.switchTo().frame(1);
	  WebElement  msg=driver.findElement(By.xpath("//h1[text()='Selenium - Automation Practice Form']"));
	    System.out.println(msg.getText());
	    
	    
	    //switching frame to mainPage
	     driver.switchTo().defaultContent();
	    
	    Thread.sleep(3000);
	    
	    WebElement  title=driver.findElement(By.xpath("//h2[text()='Iframe 1']"));
	    System.out.println(title.getText());
	    
	    Thread.sleep(3000);
	    //driver.quit();
	    
	    //____________USING WEBELEMENT_______________
	    
	   WebElement  iframe_1= driver.findElement(By.xpath("(//iframe)[1]"));
	    driver.switchTo().frame(iframe_1);
	    //fetching the msg inside frame
	     WebElement text=driver.findElement(By.xpath("//h1[text()='//h1[text()='New Tab']']"));
	    System.out.println(text.getText());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	}

}
