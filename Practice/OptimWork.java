package Practice;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptimWork {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//configuring and setup
		WebDriverManager.chromedriver().setup();
	
		
		//launch chrome
		
		System.out.println("enter Test Data?");
		Scanner sc=new Scanner(System.in);
		String data=sc.next();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//waiting stmt
		driver.manage().timeouts().implicitlyWait(10l, TimeUnit.SECONDS);
		//navigate to amazon
		driver.get("https://www.amazon.in/");
		
		//search for samsung
		//identifying searchbar
         WebElement	searchbar=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
         //enter data
         searchbar.sendKeys(data);
         //for entering text
         WebElement enter=driver.findElement(By.xpath("//input[contains(@id,'nav-search')]"));
         enter.click();
         
         //identifynig dropdown
         WebElement dropdown=driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
         //dropdown.click();
         
         //for filtering price from low to high
         Select filter_price=new Select(dropdown);
         filter_price.selectByIndex(1);
         
		//verify serach result sorted correctly
         System.out.println("Product Prices In  SortingOreder:");
         List<WebElement> producr_price = driver.findElements(By.xpath("//span[@class='a-price']"));
         for(int i=0;i<producr_price.size();i++)
         {
        	System.out.println(producr_price.get(i).getText());
         }
         System.out.println("Product Names Of SortingOreder List:");
        List<WebElement> product_names = driver.findElements(By.xpath("//span[contains(text(),'Samsung')]"));
        for(int j=0;j<product_names.size();j++)
        	{
        	System.out.println(product_names.get(j).getText());
        	}
        System.out.println("_____________________________________________________________________________________________");
        	
      //filter black color
        WebElement filter_color = driver.findElement(By.xpath("(//div[@class='colorsprite aok-float-left'])[1]"));
	   
        //for scrolling
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",filter_color);
       
        //click
        filter_color.click();
        
        //phones varies.............................................
        WebElement thirdProd = driver.findElement(By.xpath("//img[@data-image-index='3']"));
	  thirdProd.click();
	  
	  //product Details
	  System.out.println("Product Details:");
	  System.out.println("Product Name:"+driver.findElement(By.xpath("//div[@id='title_feature_div']")).getText());
	  System.out.println("Product ActualPrice:"+driver.findElement(By.xpath("//td[@class='a-span12 a-color-secondary a-size-base']")).getText());
	System.out.println("Discpunt Price is:"+driver.findElement(By.xpath("//td[@class='a-span12']")).getText());
	System.out.println("Rating is:"+driver.findElement(By.xpath("//span[text()=' 2.9 ']")).getText());
	
	}
	   
	
		//click on 3rd s
	

		//verifu product details
}
	



