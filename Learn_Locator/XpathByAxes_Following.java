package Learn_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByAxes_Following {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		//chrome
		WebDriver driver=new ChromeDriver();
		
		//opening automation page
		driver.get("https://www.automationexercise.com/");
		//locating productlink and shifting to womenlink
		WebElement link=driver.findElement(By.xpath("//a[@href='/products']/following::a[@href='#Women']"));
		link.click();
		System.out.println(link.isDisplayed());

	}

}
