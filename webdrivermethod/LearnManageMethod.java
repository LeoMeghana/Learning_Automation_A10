package webdrivermethod;





import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnManageMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		 //launching browser
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		//for maximizing browser
		//driver.manage().window().maximize();
		
		//for fullscreen
		driver.manage().window().fullscreen();
		
		//for getsize
		   Dimension size=driver.manage().window().getSize();
		   System.out.println("Browser Size is(width,height):"+size);
		   
		   //for getposition
		    Point position=driver.manage().window().getPosition();
		    System.out.println("Position is(X,Y):"+position);
		    
		    //setsize
		   // driver.manage().window().setSize(new Dimension(100, 1000));//width,height
		    
		    //set position
		    driver.manage().window().setPosition(new Point(100, 200));
		   
		    //for waiting
		    Thread.sleep(5000);
		    driver.close();		    
		    
		    
		    
		    
		 
			
			
		    

	}

}
