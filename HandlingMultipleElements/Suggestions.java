package HandlingMultipleElements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Suggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure and store
		WebDriverManager.chromedriver().setup();
		
		
		System.out.println("Enter the Word I'll give all the suggestions from google!!");
		Scanner sc=new Scanner(System.in);
		String data=sc.next();
		//launch browser
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //navigating to google
		 driver.get("https://www.google.co.in/");
		    WebElement searchbar=driver.findElement(By.tagName("textarea"));
		    searchbar.sendKeys(data);
		   // Thread.sleep(3000);
		    driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);
		    //options
		   List<WebElement> suggestions = driver.findElements(By.xpath("//span[text()='"+data+"']"));
		   int count=suggestions.size();
		   System.out.println("Total Suggestions:"+count);
		   //loop
		   for(int i=0;i<count;i++)
		   {
			   System.out.println(suggestions.get(i).getText());
		   }
		   
		   driver.quit();
		    

	}

}
