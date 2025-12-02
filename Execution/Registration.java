package Execution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Registration extends BaseClass {
	@Test(groups="smoke")
	public void  registration()
	{
		driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("Meghana");
		driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys("sarampellimeghana@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname=\"mobile\"]")).sendKeys("8106967704");
		driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Meghana@123");
		driver.findElement(By.xpath("//input[@placeholder=\"Confirm Password\"]")).sendKeys("Meghana@123");
		driver.findElement(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]")).click();
		driver.findElement(By.id("acceptGDPRConsent")).click();
		System.out.println("im Smoke1 from Registration");
	}

	@Test(groups="Smoke")
	public void m1()
	{
		System.out.println("Im Smoke2 from registration");
	}
	
	@Test(groups="Sanity")
	public void m3()
	{
		System.out.println("Im sanity from Registration");
	}
}
