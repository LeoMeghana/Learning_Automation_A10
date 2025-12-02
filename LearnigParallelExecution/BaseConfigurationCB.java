package LearnigParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseConfigurationCB {
	//it handles/catch the parameters those are Thrown by SuiteFile
	@Parameters("Browser")
	@BeforeClass
	public void browserSetup(String browsername)
	{
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			new ChromeDriver();
			Reporter.log("BrowserSetup Success!!", true);
		}
		else if(browsername.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			new EdgeDriver();
			Reporter.log("BrowserSetup Success!!", true);
		
		}
		else
		{
		   Reporter.log("OOPS!! Wrong Browser name is entered.", true);
		}
	}
	
	@AfterClass
	public void browserTerminates()
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = null;
//		driver.quit();
		Reporter.log("Browser Terminates SuccesFully!!", false);
	}

}
