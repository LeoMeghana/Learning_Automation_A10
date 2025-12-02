package webdrivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//learnig how to navigate to the application via url
public class LearnGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//pre step-1:Configure the browser
		WebDriverManager.chromedriver().setup();
		
		//step-1: Launch the browser-Chrome driver
		WebDriver driver=new ChromeDriver();
		
		//step-2:Navigate to the application via url
		driver.get("https://www.saucedemo.com/v1/");

	}

}
