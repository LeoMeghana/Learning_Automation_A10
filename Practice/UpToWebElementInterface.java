package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpToWebElementInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launch chrome
		WebDriver driver=new ChromeDriver();
		
		//maximizing Browser
		driver.manage().window().maximize();
		
		//navigating to Demoqa site
		driver.get("https://demoqa.com/");
		//__________________________________
		//getTitle
		String actual_title="DEMOQA";
		String  expected_title=driver.getTitle();//gives title of page
		if(expected_title.equals(expected_title))
		{
		System.out.println("Title Verified:"+expected_title);
		}else
		{
			System.out.println("Title Not verified");
		}
		//______________________________________________
		//getCurrentUrl()
		String actual_url="https://demoqa.com/";
		String expected_url=driver.getCurrentUrl();//gives current url of page
		if(actual_url.equals(expected_url))
		{
		System.out.println("Url Verified:"+expected_url);
		}else
		{
			System.out.println("Url not Verified.");
		}
		//___________________________________
		//getPageSource()
		String htmlcode=driver.getPageSource();//give html code
		
		//cssSelector---(.classname)
		WebElement element_icon=driver.findElement(By.cssSelector(".card-up"));
		element_icon.click();
		  
		//clicking TextBox --textValue();
	      WebElement textBox=driver.findElement(By.xpath("//span[text()='Text Box']"));
	      textBox.click();
	      
	      //for userName ---Xpath_Attribute
	      WebElement fullname= driver.findElement(By.xpath("//input[@id='userName']"));
	      fullname.sendKeys("Mghana");
	    //for scrolling
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			
			//for Email --usng id() locator
		     WebElement  mail=driver.findElement(By.id("userEmail"));
		     mail.sendKeys("meena@gmail.com");
		     
		     //for button ---xpath_PartialAttribue
		     WebElement button=driver.findElement(By.xpath("//button[contains(@id,'submit')]"));
		     button.submit();
		     
		     //Xpath_partialTextValue
		    WebElement checkbox=driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"));
			checkbox.click();
			
			//check the checkbox
			WebElement check=driver.findElement(By.className("rct-checkbox"));
			check.click();
			Thread.sleep(3000);
			
			//Webtbale using_Axes_child
		      WebElement   webtable=driver.findElement(By.xpath("//li/child::span[contains(text(),'Web Tables')]"));
		     webtable.click();
		     
		     //using Axes-Folloing
		     WebElement searchbar=driver.findElement(By.xpath("//div/following::input[@id='searchBox']"));
		      searchbar.sendKeys("kierra");
		      Thread.sleep(3000);
		      searchbar.clear();
		      
		     WebElement  addbutton= driver.findElement(By.xpath("//button[text()='Add']"));
		     addbutton.click();
		     //firstName ---xpath_Following-sibling
		    WebElement  add_fn= driver.findElement(By.xpath("//div/following-sibling::div/input[@id='firstName']"));
		   add_fn.sendKeys("Meghana");
		   Thread.sleep(3000);
		   //lastname using Xpath_Dependancy
		    WebElement add_ln= driver.findElement(By.xpath("//label[contains(text(),'Last Name')]/../../div[2]/input"));
		    add_ln.sendKeys("Gaddam");
		    Thread.sleep(3000);
		    
		    //email  Axes_following
	     WebElement email= driver.findElement(By.xpath("//div[@id='lastName-wrapper']/following::div/div/input[@id='userEmail']"));
		 email.sendKeys("megha@gmail.com")  ; 
		 Thread.sleep(3000);
		 
		 //  age using Preceding
	  WebElement age=driver.findElement(By.xpath("//div[@id='salary-wrapper']/preceding::input[@id='age']"));
	  age.sendKeys("21");
	  Thread.sleep(3000);
	  
	  //sal using CssSelector_#id
	    WebElement  sal= driver.findElement(By.cssSelector("#salary"));
		    sal.sendKeys("45000");
		    
		    //department
		 WebElement  department=driver.findElement(By.xpath("(//form/div[6])[1]/div/input[@id='department']"));
		    department.sendKeys("Qspiders");
		    Thread.sleep(3000);
		    
		    //button Using SpecialOperator
		   WebElement add_button= driver.findElement(By.xpath("//button[@id='submit'][@type='submit']"));
		    add_button.click();
		    
		    //ButtonsPage
		   WebElement buttons =driver.findElement(By.xpath("//span[text()='Buttons']"));
		    buttons.click();
		    
		    
		    //actions class
		    Actions actions= new Actions(driver);
		    
		    //doubleclick button
//		  WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Right Click Me']/../preceding-sibling::div/button"));
//		    actions.doubleClick(doubleclick).perform();
//		    System.out.println("Double CLick done.");
//		    
//		    //rightclick action
//	    WebElement rightclick= driver.findElement(By.xpath("//button[contains(text(),'Right Cl')]"));
//	    actions.contextClick(rightclick).perform();
//	   System.out.println("Rightclick is done");
	   
	   //navigate to linksText
	WebElement links=driver.findElement(By.xpath("//li[@id='item-5']/span[text()='Links']"));
		links.click();
		 Thread.sleep(3000);
		  System.out.println("text is:"+links.getText());
		  System.out.println("tagname:"+links.getTagName());
		  
		  //linktext
	WebElement linktext=driver.findElement(By.linkText("Home"));
		  linktext.click();  
		  Thread.sleep(3000);
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		   
		   
		
		
		//close
		//quite
	}

}
