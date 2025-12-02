 package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetching_aTag_FlipcartLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring and setup
		WebDriverManager.chromedriver().setup();
		//launching brwoser
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        //navigating  to flipkartsite
        driver.get("https://www.flipkart.com/");
        
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int count=allLinks.size();
        System.out.println("Total <a> Tags are:"+count);
        
        for(int i=0;i<count;i++)
        {
        	System.out.println(allLinks.get(i).getText());
        }
        

	}

}
