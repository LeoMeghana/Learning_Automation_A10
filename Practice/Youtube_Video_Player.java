package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube_Video_Player {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//confugure and setup
		WebDriverManager.chromedriver().setup();
		
		//launch browser
		WebDriver  driver=new ChromeDriver();
		
		//maxize the browser
		driver.manage().window().maximize();
		
		//navigating to YOUTUBe via Url
		driver.get("https://www.youtube.com/");
		
		//for search box
		WebElement  searchBar=driver.findElement(By.xpath("//input[@name='search_query']"));
		searchBar.sendKeys("Prabhas  old songs");
		searchBar.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		// for fliters option
		 WebElement  filters=driver.findElement(By.xpath("//button[@aria-label='Search filters']"));
          filters.click();
          Thread.sleep(2000);
          
          //for last UploadDate
          WebElement  lastHour=driver.findElement(By.xpath("//div[@title='Search for Last hour']"));
	         lastHour.click();
	         
	         //removing text
        WebElement  removeText=driver.findElement(By.xpath("//input[@name='search_query']"));
	       removeText.click();
	       
	       
	       Thread.sleep(3000);
	       removeText.clear();
	       Thread.sleep(3000);
	       removeText.sendKeys(" prabhas New songs");
	       removeText.sendKeys(Keys.ENTER);
	       
	       //clicking one first video
	       WebElement video=driver.findElement(By.xpath("//a[contains(@aria-label,'Ta Takkara (Telugu) ')]"));
	      video.click();
	      
	      //maximizing video
	    WebElement   maximizingVideo=driver.findElement(By.xpath("//button[@title='Full screen (f)']"));
	     maximizingVideo.click();
	     
	     Thread.sleep(22000);
	     //skip the advertisement
	     if(driver.findElement(By.xpath("//div[text()='Skip']")).equals("Skip"))
	     {
	    	 WebElement skipAdd=driver.findElement(By.xpath("//div[text()='Skip']"));
		     skipAdd.click();
	     }
	     else
	     {
	    	 System.out.println("Please wait until Advertisement finished.");
	     }
	     
	     

	       
	       
	
	}

}
