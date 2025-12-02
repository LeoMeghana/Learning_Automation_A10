package HandlingWebTable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingAllDetailsOfParticularPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//userinput
				System.out.println("Enter Record Number,I'll Give all Details");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
		
		//configuration and setup
		WebDriverManager.chromedriver().setup();
		
		//launching Browser
		WebDriver driver=new ChromeDriver();
		
		//navigate to tutorials point
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement>  table=driver.findElements(By.xpath("//tbody/tr["+num+"]/td"));
	
		
		for(int i=0;i<table.size();i++)
		{
		  String element = table.get(i).getText();
		  System.out.println(element);
		}

	}

}
