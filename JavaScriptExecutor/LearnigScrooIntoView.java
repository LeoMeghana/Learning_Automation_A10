package JavaScriptExecutor;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnigScrooIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		//waiting stmnt
	         driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//navigating
		driver.get("https://www.flipkart.com/");
		
		//_____________Scrolling Using ScroolIntoView_____________
		WebElement helpText=driver.findElement(By.xpath("//div[text()='HELP']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView(false)", helpText);
		
		
		//helpText.click();
		WebElement paymentText = driver.findElement(By.xpath("//a[text()='Payments']"));
		paymentText.click();
		
		List<WebElement> questions = driver.findElements(By.xpath("//h2"));
		System.out.println("Total Questins!"+questions.size());
		
		for(int i=0;i<questions.size();i++)
		{
		              System.out.println(questions.get(i).getText());
		}

	}

}
