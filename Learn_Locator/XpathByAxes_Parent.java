package Learn_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathByAxes_Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		
		//launching chrome driver
		WebDriver driver=new ChromeDriver();
		
		//navigating to demowebshop
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//div[@class='master-wrapper-content\']/parent::div[@class='master-wrapper-page']"));
		

	}

}
