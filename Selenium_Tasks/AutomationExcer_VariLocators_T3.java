package Selenium_Tasks;

import java.util.Scanner;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcer_VariLocators_T3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring and setup
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		//user input
		System.out.println("Enter Browser Name");
		Scanner sc=new Scanner(System.in);
	    String browser=sc.next();
	    
	     //launching browser
	    WebDriver driver=null;
	    if(browser.equalsIgnoreCase("Chrome"))
	    {
	    	 driver=new ChromeDriver();
	    	
          }
	    else if(browser.equalsIgnoreCase("Edge"))
	    {
	    	driver=new EdgeDriver();
	    }
	    else if(browser.equalsIgnoreCase("Firefox"))
	    {
	    	driver=new FirefoxDriver();
	    }
	    
	    //maximizing window
	    driver.manage().window().maximize();
	    
	    //Navigating to AutomationExcercise page
	    driver.get("https://www.automationexercise.com/");
	    
	    //using Xpath_By_TextValue
	    WebElement signup=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
	    signup.click();
	    
	    //using Xpath_By_Attribute
	    WebElement username=driver.findElement(By.xpath("//input[@type='text']"));	
	    username.sendKeys("Apple11");
	    Thread.sleep(1000);
	    
	    //using Group_Indexing
	     WebElement mail=driver.findElement(By.xpath("(//input)[6]"));
	     mail.sendKeys("apple11@gmail.com");
	     Thread.sleep(1000);
	     
	     //using Partial_Attribute
	     WebElement button=driver.findElement(By.xpath("//button[contains(@data-qa,'up-button')]"));
	     button.click();
		
	     //using Id_Locator
	     WebElement gender=driver.findElement(By.id("id_gender2"));
	     gender.click();
	     
	   //using css Selector--->(tn[an='val']) 
	     WebElement password=driver.findElement(By.cssSelector("input[data-qa='password']"));
	     password.sendKeys("apple123");
	     Thread.sleep(1000);
	     
	   //for scrolling page
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
	     
	     //using NameLocator
	     WebElement check1=driver.findElement(By.name("newsletter"));
	     check1.click();
	     
	     //using CSS_Selector_idvalue
	     WebElement check2=driver.findElement(By.cssSelector("#optin"));
	     check2.click();
	     
	     //using special operator_Or
	  WebElement firstname= driver.findElement(By.xpath("//input[@id='first_name' or @class='form']"));
	  firstname.sendKeys("Fruit");
	  Thread.sleep(1000);
	  
	//using special operator_And
	   WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name' and @id='last_name']"));
	   lastname.sendKeys("Apple");
	   Thread.sleep(1000);
	   
	   //using following-sibling
	  WebElement company= driver.findElement(By.xpath("//label[text()='Company']/following-sibling::input"));
	  company.sendKeys("QSpiders");
	  Thread.sleep(1000);
	  
	  //using  following
	  WebElement add1=driver.findElement(By.xpath("//input[@id='company']/following::input"));
	add1.sendKeys("Jntuh,hyderabd");
	 Thread.sleep(1000);
	
	//using preceding
	 WebElement add2=driver.findElement(By.xpath("//select/preceding::input[@data-qa='address2']"));
		add2.sendKeys("Qspiderss!!");
		 Thread.sleep(1000);
		
		//using preceding-sibling
		WebElement state=driver.findElement(By.xpath("//label[text()='City ']/../preceding-sibling::p/input[@id='state']"));
		state.sendKeys("Telangana");
		 Thread.sleep(1000);
		
		//using child
		WebElement city=driver.findElement(By.xpath("//form/child::p[8]/input"));
	    city.sendKeys("Khammam");
	    
	    //Using Dependency IN BackwardDirection
	   WebElement pin= driver.findElement(By.xpath("//label[text()='Zipcode ']/../input"));
	   pin.sendKeys("507123");
	   Thread.sleep(1000);
	   
	   //using PartialTextValue and following
	   WebElement mobile=driver.findElement(By.xpath("//label[contains(text(),'Mobile')]/following::input"));
	    mobile.sendKeys("8765432222"); 
	    Thread.sleep(1000);
	    
	    //Using NormalXpath
	    WebElement finish=driver.findElement(By.xpath("//button"));
	    finish.click();
	    
	    driver.quit();
	}

}
