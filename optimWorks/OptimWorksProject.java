package optimWorks;

import java.awt.Desktop.Action;
import java.awt.image.TileObserver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptimWorksProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launch the chrome browser
		WebDriver  driver=new ChromeDriver();
		
		//maximising the browser
		driver.manage().window().maximize();
		
		//navigating to Goibibo site
		driver.get("https://www.goibibo.com/");
		Thread.sleep(2000);
		
		//cancling 
	    WebElement	cancel=driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
	    cancel.click();
	   
	    //identifying one way
	     WebElement  oneway_radio=driver.findElement(By.xpath("//p[text()='One-way']"));
	     oneway_radio.click();
	    Thread.sleep(2000);
	    
	    //clicking fromLocation
	    WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
	    from.click();
	    
 	    //Enter From Address
	    WebElement fromAddTextBox=driver.findElement(By.xpath("//input[@type='text']"));
	    fromAddTextBox.sendKeys("new delhi");
	    Thread.sleep(2000);
	
		//fromAddTextBox.sendKeys(Keys.ENTER);
	    
	    //selecting the options fromTextfield
         WebElement selectingOPtion=driver.findElement(By.xpath("//span[text()='New Delhi, India']"));
         selectingOPtion.click();
         Thread.sleep(2000);
         
	    //ToAddress
	    WebElement toOptions=driver.findElement(By.xpath("//div[@class='sc-12foipm-22 OmQvV']"));
	    toOptions.click();
	    
	     //Identifying ToAddress TextField
          WebElement   fromTextBox= driver.findElement(By.xpath("//input[@type='text']"));
	     fromTextBox.sendKeys("hyderabd");
	     Thread.sleep(2000);
	     
	     //Hyderabs Option
	     WebElement   hydOption=driver.findElement(By.xpath("//p[contains(text(),'Rajiv Gandhi')]"));
	     Thread.sleep(2000);   
	     hydOption.click();
	         
	     //click on Depature
	     WebElement depature=driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']"));
          depature.click();
	    
         //selecting today date(22-02-25)
	     WebElement  todaydate=driver.findElement(By.xpath("//div[@aria-label='Sat Mar 22 2025']"));
         todaydate.click();
         Thread.sleep(2000);
	     
	     //click on retun
	     WebElement retunto=driver.findElement(By.xpath("//p[contains(text(),' return flight')]"));	    
	     retunto.click();
	     
	     //clicking on downicon
	     WebElement downicon=driver.findElement(By.xpath("//span[text()='Return']/parent::div"));
	     downicon.click();
     
          //for go to NextMoth (---->)
          WebElement nextMoth=driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
          nextMoth.click();
          Thread.sleep(2000);
  
          //identifying april first
          WebElement  april_1=driver.findElement(By.xpath("//div[@aria-label='Tue Apr 01 2025']"));
          april_1.click();
          Thread.sleep(2000);
     
          //identifying travellers
	     WebElement travellers=driver.findElement(By.xpath("//span[contains(text(),'Travellers')]"));
	     travellers.click();
	   
	     //Identifying and clicking adult Plus Symbol
	      WebElement adult=driver.findElement(By.xpath("//p[text()='Adults']/../div/span/following-sibling::span[contains(@class,'foipm-51 ')]")); 
	      adult.click();
	      Thread.sleep(2000);
	    
	    //identifying child
	    WebElement child=driver.findElement(By.xpath("//p[text()='Children']/../div/span/following-sibling::span[contains(@class,'12foipm-51 kZvHQU')]"));
	    child.click();
	    Thread.sleep(2000);
	    
	    //selecting Class Economi
	    WebElement classEco=driver.findElement(By.xpath("//li[text()='economy']"));
	    classEco.click();
	    Thread.sleep(2000);//(Manually Handle POPUP for Done Button)
	    
//	    //handling popUp
//	   WebElement  popUp=driver.findElement(By.xpath("//button[@id='deny']"));
//	   popUp.click();

	    
	    //click on done
	    WebElement doneButton=driver.findElement(By.xpath("//a[text()='Done']"));
	    doneButton.click();
	    Thread.sleep(2000);
	    
	     //searching for flights
	    WebElement searchingFlight=driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']"));
	    searchingFlight.click();
	    
	    //________________NOT EXECUTING FROM HERE____________________________________
	   
	    
	    //filtering time
	    WebElement timeFilter=driver.findElement(By.xpath("//span[text()='6AM - 12PM']"));
	  
	    
	    //wait until time will appears
	    WebDriverWait wait=new WebDriverWait(driver, 60l);
	    wait.until(ExpectedConditions.visibilityOf(timeFilter));
	    
	    timeFilter.click();
	    
	    //for scrolling
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		//selecting AirINdiaflight
		WebElement airIndia=driver.findElement(By.xpath("(//label[@class='filtersstyles__ChckAirln-sc-1hyeel5-18 fUOHPK'])[1]"));
		airIndia.click();
		
		//selecting Indigoflights
				WebElement indigo=driver.findElement(By.xpath("(//label[@class='filtersstyles__ChckAirln-sc-1hyeel5-18 fUOHPK'])[1]"));
				indigo.click();
//				
//				//closing the browser
//				driver.quit();
	}

}
