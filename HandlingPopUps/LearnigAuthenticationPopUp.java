package HandlingPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnigAuthenticationPopUp {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//confi
		WebDriverManager.chromedriver().setup();
		//launching browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//navigating t--go to coded pad type 2617 u get one code copy and paste
		//String uname="admin";
		//String password="admin";
		
		 String custom_url="https://"+"admin"+":"+"admin"+"@"+"the-internet.herokuapp.com/basic_auth";
		driver.get(custom_url);
		
		//protocol+username+:+@+password+domainname
		

	}

}
