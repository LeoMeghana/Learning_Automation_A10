package LearnigTakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launch browser
	WebDriver	driver=new ChromeDriver();
	
	//navigating
	driver.get("https://www.google.com/");
	
	driver.findElement(By.id("APjFqb")).sendKeys("YukthaMe");
	
	//___________SCREENSHOT Process_____________
	
	//1.Perform TYpecasting
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	//2.calling method (OutPut type is Interface here)
	File temp = ts.getScreenshotAs(OutputType.FILE);
	
   File	perminent=new File("./ScreenShots/YukthaName.png");
   //if u r not givin filenaem/folderName it'll throw FileNotFoundException

    org.openqa.selenium.io.FileHandler.copy(temp, perminent);
    System.out.println("Screenshot done.");
	

	}

}
