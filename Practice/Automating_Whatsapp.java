package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automating_Whatsapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring
		WebDriverManager.chromedriver().setup();
		//launching chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		//waiting stmt
		driver.manage().timeouts().implicitlyWait(50l, TimeUnit.SECONDS);
		
		//searchbar
		WebElement searchbar = driver.findElement(By.xpath("//div[@aria-label='Search']"));
		searchbar.sendKeys("8106967704");
		
		//identfyning contanvt
		WebElement contact = driver.findElement(By.xpath("//div[@class='_ak8l']"));
		contact.click();
		
		//click on forwad button
		WebElement forward = driver.findElement(By.xpath("(//span[@class='x17t9dm2'])[5]"));
		forward.click();
		
//		//clicking plus icon
//		WebElement plusicon = driver.findElement(By.xpath("//button[@title='Attach']"));
//		plusicon.click();
//		
//		WebElement doc = driver.findElement(By.xpath("//span[text()='Document']"));
//		doc.click();

	}

}
