package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to the appl via url
		driver.get("https://www.saucedemo.com/v1/");
		
		
		//fetch the page source code and print on console
		System.out.println(driver.getPageSource());
		
		//close the browser
		driver.close();

	}

}
