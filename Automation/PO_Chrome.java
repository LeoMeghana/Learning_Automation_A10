package Automation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PO_Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring the driver executable file
		WebDriverManager.chromedriver().setup();
		//launching the browser
		ChromeDriver driver=new ChromeDriver();
	}

}
