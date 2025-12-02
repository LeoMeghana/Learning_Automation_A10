package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Swiggy {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		//Navigating to Naukri Site
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//Elements Xpaths
		WebElement userName=driver.findElement(By.xpath("//label[text()='Email ID / Username']//following-sibling::input"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginButton=driver.findElement(By.xpath("//small[text()='Show']"));
		//Enter EmailID
		userName.sendKeys("sarampellimeghana@gmail.com");
		//Enter Password
		password.sendKeys("Meghana_(11)@");
		//View Password
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		//Click on Login Button
		loginButton.click();
		Thread.sleep(5000);
		//Searching Job in Naukri
		WebElement searchBar=driver.findElement(By.xpath("//span[text()='Search jobs here']"));
		searchBar.click();
		//Searching By Skills
		WebElement  skillSearch=driver.findElement(By.xpath("//input[contains(@placeholder,\"designation\")]"));
		skillSearch.sendKeys("Selenium WebDriver");
		//Experience Dropdown
		WebElement experience = driver.findElement(By.id("experienceDD"));
		experience.click();
		//Selecting Fresher
	    driver.findElement(By.xpath("//span[text()='Fresher']")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\"Enter location\"]")).sendKeys("Hyderabad");
		//Click on zsearch
	    driver.findElement(By.xpath("//span[text()='Search']")).click();
	
		
	}

}
