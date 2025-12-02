package HandlingMultipleElements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_FetchingSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Test Data?");
		String data=sc.next();
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching Browser
		WebDriver  driver=new ChromeDriver();
		//navigating to amazonsite
		driver.navigate().to("https://www.amazon.in/");
        //to enter captcha
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		WebElement  searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchbox.sendKeys(data);
        
         List<WebElement> products = driver.findElements(By.xpath("//div[contains(text(),'"+data+"')]"));
            
         int  count=products.size();
           System.out.println("Suggestions Count is: "+count);
             for(int i=0;i<count;i++)
             {
            	 System.out.println(products.get(i).getText());
             }
             
             driver.quit();
	}

}
