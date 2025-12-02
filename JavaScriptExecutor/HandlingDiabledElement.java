package JavaScriptExecutor;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDiabledElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//userInput
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter New Mail");
        String newMail=sc.next();
		
		//launching browser
	    WebDriver	driver=new ChromeDriver();
	    
	    //waiting statement
	    driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
	    
	    //navigating
	    driver.get("https://www.automationexercise.com/");
	    
	    //finding signup button
	    driver.findElement(By.xpath("//a[text()=' Signup / Login']")).click();
	    
	       WebElement userName=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
	       userName.sendKeys("Meghana");
	       WebElement mail=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
	       mail.sendKeys("yukthasri11@gmail.com");
	       System.out.println();
	       //button
	       driver.findElement(By.xpath("//button[text()='Signup']")).click();
	       
	     WebElement  disabledEle=driver.findElement(By.id("email"));
	     //System.out.println(disabledEle.isEnabled());
	    
	    	String jscode="arguments[0].value='"+newMail+"@gmail.com'";
	    	//System.out.println("Modified Mail:"+jscode);
	    	
	    	//identify the dis elemnet
	    	//driver.findElement(By.id("email"));
	    	
	    	//perfrom typecasting
	    	JavascriptExecutor js = (JavascriptExecutor)driver;
	    	
	    	//call the abstfract method to execute js
	    	js.executeScript(jscode, disabledEle);
	    	
	     
	    

	}

}
