package HandlingMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_DropDown_ArunIce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		
		//launching Browser
		WebDriver driver=new ChromeDriver();
		
		//navigating t0 ArunIce
		driver.navigate().to("https://arunicecreams.in/");
		
		//identifying Products Dropdown
		WebElement productsDropDown = driver.findElement(By.xpath("//a[text()='Products ']"));
		productsDropDown.click();
		
		//identifying is it single or Multi select
		Select select=new Select(productsDropDown);
		
		if(select.isMultiple())
		{
			System.out.println("Single Select DropDown");
		}
		else
		{
			System.out.println("Multi Select DropDown");
		}
		
	     select.selectByVisibleText("Specialites");
		

	}

}
