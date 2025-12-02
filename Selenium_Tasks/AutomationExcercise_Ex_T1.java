package Selenium_Tasks;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcercise_Ex_T1 {

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
		driver.get("https://www.automationexercise.com/");
		
		WebElement login=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
		login.click();
		
		//finding element
		WebElement name=driver.findElement(By.name("name"));
	    WebElement email=driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
	    WebElement button=driver.findElement(By.xpath("//button[text()='Signup']"));
	    //validating
	    System.out.println(name.isDisplayed());
	    System.out.println(email.isDisplayed());
	    System.out.println(button.isDisplayed());
	    //inserting data
	    name.sendKeys("Smiley15");
	    email.sendKeys("smiley15@gmail.com");
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
	    
	    //for date
	   WebElement date = driver.findElement(By.xpath("//select[@id='days']"));
	    
	   Select select=new Select(date);
	   select.selectByIndex(11);
	   Thread.sleep(2000);
	   
	   
	   //month
	   WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
	   Select select1=new Select(month);
	   select1.selectByValue("1");
	   Thread.sleep(2000);
	   
	   //year
	   WebElement   year=driver.findElement(By.xpath("//select[@id='years']"));
	   Select select2=new Select(year);
	   select2.selectByVisibleText("2004");
	   Thread.sleep(2000);
	   
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
  	  
	     //buttton
		  WebElement finish=driver.findElement(By.xpath("//button[@data-qa='create-account']"));
          finish.click();
          Thread.sleep(3000);
          driver.close();

	}

}
