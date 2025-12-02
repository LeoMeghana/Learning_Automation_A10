package Learn_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automating_DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		//launching chrome 
		WebDriver driver=new ChromeDriver();
		//navigating to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.xpath("//a[@href='/login\']"));
		login.click();
		WebElement email=driver.findElement(By.xpath("//input[@class='email\']"));
		email.sendKeys("apple@gmail.com");

	}

}
