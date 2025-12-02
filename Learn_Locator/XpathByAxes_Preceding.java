package Learn_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByAxes_Preceding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
         WebDriverManager.chromedriver().setup();
         
         //launching chrome browser
         WebDriver driver=new ChromeDriver();
         
         //navigating to DemoWebShop site
         driver.get("https://demowebshop.tricentis.com/");
         
         //moving from excellent_Radiobutton to Books_link
          WebElement radiobutton=driver.findElement(By.xpath("//input[@id='pollanswers-1']/preceding::a[@href='/books\']"));
          radiobutton.click();
	}

}
