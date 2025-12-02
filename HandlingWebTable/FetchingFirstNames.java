package HandlingWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingFirstNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching Browser
		WebDriver driver=new ChromeDriver();
		
		//navigating 
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		//
		List<WebElement> elem = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		for(int i=0;i<elem.size();i++)
		{
			System.out.println(elem.get(i).getText());
		}

	}

}
