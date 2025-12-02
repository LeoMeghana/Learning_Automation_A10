package Learn_Locator;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		//maximising the browser
		driver.manage().window().maximize();
		//Navigating
		//navigating to site
		driver.get("https://www.automationexercise.com/");
		Thread.sleep(3000);
		//get size of webpage
		 Dimension size=driver.manage().window().getSize();
		 System.out.println(size);
		 
		 //gettiltle of page
		 //verifying/validating
		 String actual_title=driver.getTitle();
		 String expected_title="Automation Exercise";
		 if(actual_title.equals(expected_title))
		 {
			 System.out.println("Verified:TestPass");
		 }
		 else
		 {
			 System.out.println("Verified:TestFaill"+actual_title);
		 }
		 
		//close the browser
		driver.close();

	}

}
