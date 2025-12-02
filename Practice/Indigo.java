package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Indigo {
          	public static void main(String[] args) throws InterruptedException {
          	WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.indigo.ca");
			driver.manage().window().maximize();
			driver.findElement(By.className("user-message")).click();
			driver.findElement(By.xpath("//a[text()='Create an account']")).click();
			driver.findElement(By.id("first-name")).sendKeys("SRINIVAS");
			driver.findElement(By.id("last-name")).sendKeys("DULLA");
			driver.findElement(By.id("phone-number")).sendKeys("6309195069");
			driver.findElement(By.xpath("//input[@inputmode='email']")).sendKeys("dullasrinivas17@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Srinivas@12");
			driver.findElement(By.xpath("//button[@type='button']")).click();
			driver.findElement(By.xpath("//label[@for='email-opt-in']")).click();
			driver.findElement(By.xpath("//label[@for='terms-of-service']")).click();
			driver.findElement(By.xpath("//button[text()='Create Account']")).click();
			driver.findElement(By.xpath("//a[text()='Sign in']")).click();
			driver.findElement(By.id("username")).sendKeys("dullasrinivas17@gmail.com");
			driver.findElement(By.id("password")).sendKeys("Srinivas@12");
			driver.findElement(By.xpath("//button[@role='switch']")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[text()='Continue']")).click();
			//driver.findElement(By.id("af_uid_405")).sendKeys("513284");
		
		    
			Thread.sleep(5000);
			//driver.close();
		}

	}
