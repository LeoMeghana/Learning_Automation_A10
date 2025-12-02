package HandlingMultipleElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fetching_Mynta_aTaglinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		//launching
		 WebDriver  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //navigating to myntra
		 driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAiAn9a9BhBtEiwAbKg6flPOXHVkuSrwOgiMuqu3PxWXWzY7z-6mTX9Gzwgz4VrlyUHdmDpfahoCDLoQAvD_BwE");
         //finding
	 	 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	 	 int  count=allLinks.size();
	 	 System.out.println(count);
	 	 
	 	 //toget names on tag
	 	 for(int i=0;i<count;i++)
	 	 {
	 		 System.out.println(allLinks.get(i).getText());
	 	 }
		 
		 
	}

}
