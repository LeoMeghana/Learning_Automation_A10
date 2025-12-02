package HandlingPopUps;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring 
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		//time
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		//maximizing
		driver.manage().window().maximize();
		
		//navigat8ing
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		
		//___________Handling FileUpload_________________
		
		//1.create an object for File Class
		 File fileObj=new File("./Data/Notes.txt");//Data is folder,notes is file
		 
		 //2.fetch the Absolute Xpath
		String absolutepath = fileObj.getAbsolutePath();
		
		//3 Pass the path inside element
		driver.findElement(By.id("uploadFile")).sendKeys(absolutepath);
 
	}

}
