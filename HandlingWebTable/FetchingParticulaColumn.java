package HandlingWebTable;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchingParticulaColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//userinput
		//System.out.println("Enter Either First Name(1)/Last Name(2)/Age(3)/Email(4)/Salary(5)/Department(6)");
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int num=sc.nextInt();
		
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		//navigating to tutorialsPoint
		driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		List<WebElement> elements = driver.findElements(By.xpath("//th[text()='"+n+"']/../../../tbody/tr/td['"+num+"']"));
		System.out.println("No.of Records are:"+elements.size());
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
		}
		

	}

}
