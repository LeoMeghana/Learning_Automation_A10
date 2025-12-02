package HandlingWebTable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingAllDepartmentNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launching
		WebDriver driver=new ChromeDriver();
		
//		//navigating
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		List<WebElement> elem = driver.findElements(By.xpath("//tbody/tr/td[6]"));
		
		for(int i=0;i<elem.size();i++)
		{
  		System.out.println(elem.get(i).getText());
		}
		
	
		
		
		
	}

}
