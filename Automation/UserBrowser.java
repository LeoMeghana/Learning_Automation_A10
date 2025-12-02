package Automation;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter required Browser!!");
	   String input=sc.next();//chrome
	    WebDriverManager.chromedriver().setup();
	    WebDriverManager.edgedriver().setup();
	    WebDriverManager.firefoxdriver().setup();
	   
	   if(input.equals("chrome"))
	   {
		   ChromeDriver driver=new ChromeDriver();
	   }
	   else if(input.equals("edge"))
	   {
		   EdgeDriver driver=new EdgeDriver();
	   }
	   else if(input.equals("firefox"))
	   {
		   FirefoxDriver driver=new FirefoxDriver();
	   }
	   else
	   {
		   System.out.println("plz enter chrome/edge/firefox");
	   }
	          
	          

	}

	private static WebDriverManager edgedriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
