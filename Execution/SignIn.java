package Execution;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SignIn extends BaseClass {
	@Test(groups="Smoke")
	public void signIn()
	{
		driver.findElement(By.xpath("//a[@title=\"Login Now\"]")).click();
		driver.findElement(By.xpath("//input[@formcontrolname=\"username\"]")).sendKeys("sarampellimeghana@gmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).sendKeys("Meghana@123");
		driver.findElement(By.xpath("//button[text()='sign in']")).click();
	}
	@Test(groups={"Sanity","Smoke"})
	public void s1()
	{
		System.out.println("IM s1 from SignIn");
	}
	
	@Test(groups="Smoke")
	public void s2()
	{
		System.out.println("Im s2 from SignIn");
	}

}
