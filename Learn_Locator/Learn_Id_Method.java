package Learn_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learn_Id_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configuring and setup
		WebDriverManager.chromedriver().setup();
		
		//launching Browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to saucedemo page
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		//verify the page
	    String	actual_title=driver.getTitle();
	    //System.out.println(actual_title);
	    String expected_title="Swag Labs";
	    if(actual_title.equals(expected_title))
	    {
	    	System.out.println("Title_Verified:TestPass");
	    }
	    else
	    {
	    	System.out.println("Title_Verified:TestFail__Tryy again");
	    }
	    Thread.sleep(3000);
	    
		
		//step-3identify the element and store
	      WebElement username_textfield= driver.findElement(By.id("user-name"));
	    //for passwordTextfield
	      WebElement password_field=driver.findElement(By.id("password"));
	    //for button
	      WebElement button_field=driver.findElement(By.id("login-button"));
	   
		//step-4validate the elemt
	      boolean result=username_textfield.isDisplayed();
	      if(result==true)
	      {
	      System.out.println("Username"+username_textfield+" and result is "+result);
	      }
	      else
	      {
	    	  System.out.println("False");
	      }
	    //for passwordTextfield
	      System.out.println("Password result is:"+password_field.isDisplayed());
	    //for button
	      System.out.println("Button result is:"+button_field.isDisplayed());
	      
		//step-5perform action
	      username_textfield.sendKeys("standard_user");
	      password_field.sendKeys("secret_sauce");
	      button_field.click();
	      Thread.sleep(4000);
	      
	     //closing
	    driver.close();

	}

}
