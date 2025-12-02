package Execution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	@BeforeMethod
	public void browserSetup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://larsentoubrocareers.peoplestrong.com/register");
		
	}

	@AfterMethod
	public void browserTearDown()
	{
		driver.close();
	}
}
