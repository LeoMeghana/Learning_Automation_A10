package Selenium_Tasks;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationExcercise_GetPropertirs_T5 {

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
	    
	    
	    //Validating Using TitleName
	    String actual_title=driver.getTitle();
	     String expected_title="Automation Exercise";
	     if(actual_title.equals(expected_title))
	     {
	    	 System.out.println("Page Verified:Success-TestPass");
	     }
	    //_______________________________________________________________________
	     
	     
	   
	    //using Xpath_By_TextValue
	    WebElement signup=driver.findElement(By.xpath("//a[text()=' Signup / Login']"));
	    if(signup.isDisplayed() && signup.isEnabled())
	    {
	    signup.click();
	    System.out.println("SignUpLink is Cliked");
	    }
	    else
	    {
	    	System.out.println("SignUpLink is Not Displayed or Enabled");
	    }
	    
	    //using Xpath_By_Attribute
	    WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
	    if(username.isDisplayed() && username.isEnabled())
	    {
	    username.sendKeys("Apple17");
	    System.out.println("UserName is Entered.");
	    }
	    else
	    {
	    	System.out.println("UserName Field is not Enabled Or Displayed");
	    }
	    Thread.sleep(1000);
	    
	    //using Group_Indexing
	     WebElement mail=driver.findElement(By.xpath("(//input)[6]"));
	     //validating Mail
	     if(mail.isDisplayed() && mail.isEnabled())
		    {
	    	 mail.sendKeys("apple21@gmail.com");
	    	 System.out.println("Email is Entered");
		    }
		    else
		    {
		    	System.out.println("Mail-Field is not Enabled Or Displayed");
		    }
	     
	     Thread.sleep(1000);
	     
	     //using Partial_Attribute
	     WebElement button=driver.findElement(By.xpath("//button[contains(@data-qa,'up-button')]"));
	     if(button.isDisplayed() && button.isEnabled())
		    {
	    	 button.click();
	    	 System.out.println("Button is Clicked");
		    }
		    else
		    {
		    	System.out.println("Button is not Enabled Or Displayed");
		    }
	     
		
	     //using Id_Locator
	     WebElement gender=driver.findElement(By.id("id_gender2"));
	     gender.click();
	     if(gender.isDisplayed() && gender.isEnabled() && gender.isSelected() )
		    {
	    	   System.out.println("RadioButton for Gender is Checked");
		    }
		    else
		    {
		    	System.out.println("Gender RadioButton is not Enabled Or Displayed");
		    }
	   
	     
	   //using css Selector--->(tn[an='val']) 
	     WebElement password=driver.findElement(By.cssSelector("input[data-qa='password']"));
	     if(password.isDisplayed() && password.isEnabled())
		    {
	    	 password.sendKeys("apple123");
	    	   System.out.println("Password is Entered.");
		    }
		    else
		    {
		    	System.out.println("PasswordField is not Enabled Or Displayed");
		    }
	     
	     Thread.sleep(1000);
	     
	   //for scrolling page
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
	     
	     //using NameLocator
	     WebElement check1=driver.findElement(By.name("newsletter"));
	     check1.click();
	     if(check1.isDisplayed() && check1.isEnabled() && check1.isSelected())
		    {
	    	   System.out.println("CheckBox-1 is checked.");
		    }
		    else
		    {
		    	System.out.println("checkbox is not Enabled Or Displayed or selected");
		    }
	     
	     
	     //using CSS_Selector_idvalue
	     WebElement check2=driver.findElement(By.cssSelector("#optin"));
	     check2.click();
	     if(check2.isDisplayed() && check2.isEnabled() && check2.isSelected())
		    {
	    	   System.out.println("CheckBox-2 is checked.");
		    }
		    else
		    {
		    	System.out.println("checkbox-2 is not Enabled Or Displayed or selected");
		    }
	     
	     
	     //using special operator_Or
	  WebElement firstname= driver.findElement(By.xpath("//input[@id='first_name' or @class='form']"));
	  if(firstname.isDisplayed() && firstname.isEnabled() )
	    {
		  firstname.sendKeys("Fruit");
    	   System.out.println("FirstName is Entered.");
	    }
	    else
	    {
	    	System.out.println("FirstName field not Enabled Or Displayed or selected");
	    }
	  
	  Thread.sleep(1000);
	  
	//using special operator_And
	   WebElement lastname=driver.findElement(By.xpath("//input[@name='last_name' and @id='last_name']"));
	   if(lastname.isDisplayed() && lastname.isEnabled() )
	    {
		   lastname.sendKeys("Apple");
    	   System.out.println("LastName is Entered.");
	    }
	    else
	    {
	    	System.out.println("LastName field not Enabled Or Displayed or selected");
	    }
	
	   Thread.sleep(1000);
	   
	   //using following-sibling
	  WebElement company= driver.findElement(By.xpath("//label[text()='Company']/following-sibling::input"));
	  if(company.isDisplayed() && company.isEnabled() )
	    {
		  company.sendKeys("QSpiders");
    	   System.out.println("CompanyName is Entered.");
	    }
	    else
	    {
	    	System.out.println("Company field not Enabled Or Displayed or selected");
	    }
	 
	  Thread.sleep(1000);
	  
	  //using  following
	  WebElement add1=driver.findElement(By.xpath("//input[@id='company']/following::input"));
	  if(add1.isDisplayed() && add1.isEnabled() )
	    {
		  add1.sendKeys("Jntuh,hyderabd");
    	   System.out.println("Address(Mandatory) is Entered.");
	    }
	    else
	    {
	    	System.out.println("Address-1 field not Enabled Or Displayed or selected");
	    }
	  
	 Thread.sleep(1000);
	
	//using preceding
	 WebElement add2=driver.findElement(By.xpath("//select/preceding::input[@data-qa='address2']"));
	 if(add2.isDisplayed() && add2.isEnabled() )
	    {
		 add2.sendKeys("Qspiderss!!");
    	   System.out.println("Address(Optional) is Entered.");
	    }
	    else
	    {
	    	System.out.println("Address-2 field not Enabled Or Displayed or selected");
	    }	
	 
		 Thread.sleep(1000);
		
		//using preceding-sibling
		WebElement state=driver.findElement(By.xpath("//label[text()='City ']/../preceding-sibling::p/input[@id='state']"));
		 if(state.isDisplayed() && state.isEnabled() )
		    {
			 state.sendKeys("Telangana");
	    	   System.out.println("StateName is Entered.");
		    }
		    else
		    {
		    	System.out.println("State field not Enabled Or Displayed or selected");
		    }	
		
		 Thread.sleep(1000);
		
		//using child
		WebElement city=driver.findElement(By.xpath("//form/child::p[8]/input"));
		 if(city.isDisplayed() && city.isEnabled() )
		    {
			 city.sendKeys("Khammam");
	    	   System.out.println("CityName is Entered.");
		    }
		    else
		    {
		    	System.out.println("City field not Enabled Or Displayed or selected");
		    }	
		
	    
	    //Using Dependency IN BackwardDirection
	   WebElement pin= driver.findElement(By.xpath("//label[text()='Zipcode ']/../input"));
	   if(pin.isDisplayed() && pin.isEnabled() )
	    {
		   pin.sendKeys("507123");
    	   System.out.println("PinCode is Entered.");
	    }
	    else
	    {
	    	System.out.println("PinCode field not Enabled Or Displayed or selected");
	    }	
	
	   
	   Thread.sleep(1000);
	   
	   //using PartialTextValue and following
	   WebElement mobile=driver.findElement(By.xpath("//label[contains(text(),'Mobile')]/following::input"));
	   if(mobile.isDisplayed() && mobile.isEnabled() )
	    {
		   mobile.sendKeys("8765432222"); 
    	   System.out.println("MobileNumber is Entered.");
	    }
	    else
	    {
	    	System.out.println("MobileNum field not Enabled Or Displayed or selected");
	    }	 
	  
	    Thread.sleep(1000);
	    
	    //Using NormalXpath
	    WebElement finish=driver.findElement(By.xpath("//button"));
	    if(finish.isDisplayed() && finish.isEnabled() )
	    {
	    	finish.submit();
    	   System.out.println("Submit Button.");
	    }
	    else
	    {
	    	System.out.println("Submit Button is not clicked.");
	    }
	    
	    System.out.println("________________________________________________");
	    
	    //____________________________________________________________________
	    //using GetPropertie Methods
	    System.out.println("Details About Account Created Page!!");
	    WebElement lastPage =driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"));
	    System.out.println("Text:"+lastPage.getText());
	    System.out.println("TageName:"+lastPage.getTagName());
	    System.out.println("AttributeVAlue:"+lastPage.getAttribute("style"));
	    System.out.println("CssVAlue:"+lastPage.getCssValue("color"));
	    System.out.println("Height:"+lastPage.getSize().getHeight());
	    System.out.println("Width:"+lastPage.getSize().getWidth());
	    System.out.println("Size:"+lastPage.getSize());
	    System.out.println("Location-X axes:"+lastPage.getLocation().getX());
	    System.out.println("Location-Y axes:"+lastPage.getLocation().getY());
	    System.out.println("Location:"+lastPage.getLocation());
	    System.out.println("It's an alternative method for getPosition()\nUsing getRect:"+lastPage.getRect().getPoint());
	    System.out.println("get x-axes Uinsg getRect():"+lastPage.getRect().getX());
	    System.out.println("get Y-axrs using getRect():"+lastPage.getRect().getY());
	    System.out.println("It's is an alternative method for getSize()\nUsing GetRect:"+lastPage.getRect().getDimension());
	    System.out.println("get width using getRect():"+lastPage.getRect().getWidth());
	    System.out.println("get Height using getRect():"+lastPage.getRect().getHeight());
	    
	   // driver.quit();

	}

}
