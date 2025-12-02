package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_DropDownOfAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching brower
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//waiting
		driver.manage().timeouts().implicitlyWait(20l, TimeUnit.SECONDS);//java.util.concurrent pakage
		
		//navigating to amazon
		driver.get("https://www.amazon.in/");
		
		
       
       //verify the page
		System.out.println(driver.getTitle());
		String actual_title="Amazon.in";
		String expected_title = driver.getTitle();
		if(actual_title.equals(expected_title))
		{
			System.err.println("Home page is Verified");
		}
		else
		{
			System.out.println("Home page is not verified");
		}
		//_____________________________________________________________________
		//1.identifying  Dropdown webelement
	       WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	       
	       //fetchiing the names of dropdown
	       
		
		//Explicitly waiting stment
	     //   WebDriverWait wait=new WebDriverWait(driver,20l);
	       // wait.until(ExpectedConditions.visibilityOf(dropDown));
		 	
	       
	       if(dropDown.isDisplayed()&&dropDown.isEnabled())
	       {
	    	   System.out.println("Dropdown is enabled and seleted");
	       }
	       else
	       {
	    	   System.out.println("Dropdown is not seleced or enabled.");
	       }
	     //fetvh them options text
	       
	       
	       
	       //2.create obj for Select class
	       Select select=new Select(dropDown);
	       
	       //3.call the non-static method for identifying single or multi browser
	       boolean drop_down_result = select.isMultiple();
	       if(drop_down_result)
	       {
	    	   System.out.println("Multiple select dropdown");
	       }else
	       {
	    	   System.out.println("Single selct dropdown");
	       }
	    
	       //select the opetin we have 3
	       select.selectByVisibleText("Amazon Fresh");
	       select.selectByIndex(0);
	       
	       
	       //fetching the options of dropdown
	       List<WebElement> optionsList = select.getOptions();
	       System.out.println("Count of Options are:"+optionsList.size());
	       for(int i=0;i<optionsList.size() ;i++)
	       {
	    	   System.out.println(optionsList.get(i).getText());
	       }
	       Thread.sleep(3000);
	       select.deselectByIndex(0);
	       select.deselectByVisibleText("Amazon Fresh");
	       
	       select.getFirstSelectedOption();	       
	       
	       
	       //CONFIGURING
	       //LAUNCHING
	       //MAXIMIZING
	       //WAIT stmt implicit and explicit
	       //navigate to applicatin
	       //verify the page
	       //identify the web element
	       //identify the dropdown is enabled or not
       
		
		

	}

}
