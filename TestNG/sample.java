package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	//program for Flag--Priority,InvocationCount, DependsOnMethods,Enabled
	@Test(priority = 4)
	public void m1()
	{
		System.out.println("I'm Method one");
	}
	@Test(dependsOnMethods = "m1")
	public void m2()
	{
		System.out.println("I'm Method Two");
	}
	@Test(invocationCount = 3)
	public void m3()
	{
		System.out.println("I'm Method Three");
	}
	@Test(enabled=false)
	public void m4()
	{
		System.out.println("I'm Method Four");
	}

}
