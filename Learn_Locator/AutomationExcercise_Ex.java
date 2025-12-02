package Learn_Locator;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcercise_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		//launching chrome
		String res="chrome";
		String res2="edge";
		String res3="firefox";
		
		//user input
		System.out.println("Choose the Browser!!\nchrome\nedge\nfirefox");
		Scanner sc=new Scanner(System.in);
		String choose=sc.next();//chrome
		WebDriver driver=null;
		 
		if(res.equalsIgnoreCase(choose))
		{
			 driver=new ChromeDriver();
			//code
			
		}
		else if(choose.equalsIgnoreCase(res2))
		{
		     driver=new EdgeDriver();
		}
		else if(choose.equalsIgnoreCase(res3))
		{
		      driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Please select Anyone of the follow \nChrome \nedge \nfirefox");
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/login");
		
		//finding element
		WebElement name=driver.findElement(By.name("name"));
	    WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
	    WebElement button=driver.findElement(By.xpath("//button[text()='Signup']"));
	    //validating
	    System.out.println(name.isDisplayed());
	    System.out.println(email.isDisplayed());
	    System.out.println(button.isDisplayed());
	    //inserting data
	    name.sendKeys("Smiley11");
	    email.sendKeys("smiley11@gmail.com");
	    button.click();
	//	Thread.sleep(3000);
	    
	    //account details
	    
	    //for gender
	    WebElement gender1=driver.findElement(By.id("id_gender1"));
	    WebElement gender2=driver.findElement(By.id("id_gender2"));
	    gender2.click();//id_gender2
	    Thread.sleep(1000);
	    
	    //for scrolling
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	    // for password
	    WebElement password=driver.findElement(By.name("password"));
	    password.sendKeys("1234568");
	    Thread.sleep(1000);
	    
	    //for checkbox
	    WebElement check1=driver.findElement(By.id("newsletter"));
	    check1.click();
	    WebElement check2=driver.findElement(By.id("optin"));
	    check2.click();
	    Thread.sleep(1000);
	    
	    //for firstname
	   WebElement fname=driver.findElement(By.id("first_name"));
	   fname.sendKeys("Smiley");
	   Thread.sleep(1000);
	   //lastname
	    WebElement lname=driver.findElement(By.id("last_name"));
	    lname.sendKeys("Sarampelli");
	    Thread.sleep(1000);
	    
	    //address
	       WebElement address=driver.findElement(By.id("address1"));
		address.sendKeys("No.2,Bathi,Yellandu");
		Thread.sleep(1000);
		
		//state
		 WebElement state=driver.findElement(By.id("state"));
		 state.sendKeys("Telangana");
		 Thread.sleep(1000);
		 
		 //city
		 WebElement city=driver.findElement(By.id("city"));
		 city.sendKeys("Khammam");
		 Thread.sleep(1000);
		 
		 //pincode
		  WebElement pin=driver.findElement(By.id("zipcode"));
		  pin.sendKeys("507123");
		  Thread.sleep(1000);
		  
		  WebElement  mob=driver.findElement(By.id("mobile_number"));
		  mob.sendKeys("8108765432");
		  Thread.sleep(1000);
		  
		  //buttton
		  WebElement finish=driver.findElement(By.xpath("//button[@data-qa='create-account']"));
          finish.click();
          Thread.sleep(3000);
          driver.close();

	}

}
