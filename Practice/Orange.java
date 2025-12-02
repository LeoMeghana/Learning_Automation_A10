package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		WebElement  email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sarampellimeghana@gmail.com");
		WebElement freeTrail = driver.findElement(By.xpath("//input[@type='submit']"));
		freeTrail.click();
		WebElement orgName=driver.findElement(By.xpath("//input[@name='subdomain']"));
		orgName.sendKeys("Techmol");
		WebElement name=driver.findElement(By.id("Form_getForm_Name"));
	     name.sendKeys("Meghana");
	    WebElement phoneNum=driver.findElement(By.id("Form_getForm_Contact"));
	   phoneNum.sendKeys("8106967704");
	   WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
	   
	   Select sl=new Select(country);
	   
	   //_______________________________
	   //WebElement dd=driver.findElement(By.xpath("//option[@value='India']"));
	  // JavascriptExecutor js=(JavascriptExecutor)driver;
	  //  js.executeScript("arguments[0].scrollIntoView(true)",country);
	   //Thread.sleep(4000);
	   sl.selectByVisibleText("India");
	   //WebElement checkbox=driver.findElement(By.xpath("//span[@role='checkbox']"));
	  // checkbox.click();
	   Thread.sleep(3000);
	   WebElement submitButton=driver.findElement(By.xpath("//input[@name='action_submitForm']"));
	   submitButton.click();
	
	}

}
