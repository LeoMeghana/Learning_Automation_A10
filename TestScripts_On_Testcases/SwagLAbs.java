package TestScripts_On_Testcases;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLAbs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//configure and setup
		WebDriverManager.chromedriver().setup();
		//user input
		System.out.println("Enter Which Product Want to add?");
        Scanner sc=new Scanner(System.in);
        int product=sc.nextInt();//4
		//launching chromeBroeser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to SwagLabs via URL
		driver.get("https://www.saucedemo.com/");
		
		//LoginPAge--username
          WebElement username=driver.findElement(By.id("user-name"));
          username.sendKeys("error_user");
          //password
          WebElement password=driver.findElement(By.id("password"));
          password.sendKeys("secret_sauce");
          //loginButton
          WebElement login_button=driver.findElement(By.cssSelector("#login-button"));
           login_button.click();
           //______________________________________________________
           //verying Products PAge is Displyed?
          String homepage="Swag Labs";
          String Expected_title=driver.getTitle();
         if(Expected_title.equals(homepage))
         {
        	 System.out.println("HomePAge is verified.");
         }
         else
         {
        	 System.out.println("HomePage is not Verified.");
         }
           //________________________________________________
         //add item to cart
         
         WebElement addProduct =null;
         switch(product)
         {
         case 1:addProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[1]"));
         break;
         case 2:addProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[2]"));
         break;
         case 3:addProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[3]"));
         break;
         case 4:addProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[4]"));
         break;
         case 5:addProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[5]"));
         break;
         case 6:addProduct=driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[6]"));
         break;
         }
	addProduct.click();
	
	//click on AddtoCart button
	WebElement addToCartButton=driver.findElement(By.xpath("//button[contains(text(),'cart')]"));
	addToCartButton.click();
	
	WebElement cartsvg=driver.findElement(By.className("shopping_cart_link"));
	cartsvg.click();
	
	WebElement checkoutButton=driver.findElement(By.id("checkout"));
	checkoutButton.click();
	//fiestname
	String infoPageUrl="https://www.saucedemo.com/checkout-step-one.html";
    String	expected_url=driver.getCurrentUrl();
    if(infoPageUrl.equals(infoPageUrl))
    {
    	System.out.println("Your InformationPage is Displyed.");
    }
    else
    {
    	System.out.println("Info Page is not displayed.");
    }
    //firstname
    WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
    firstname.sendKeys("Meghana");
    //lastName
    WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
    lastname.sendKeys("Sarampelli");
    //postalcode
    WebElement postalCode=driver.findElement(By.xpath("//input[contains(@id,'postal-code')]"));
    postalCode.sendKeys("507123");
    //Click on Continue button
    WebElement continueButton=driver.findElement(By.xpath("//input[@name='continue']"));
    continueButton.click();
    //verifying Overviewpage
    String overviewUrl="https://www.saucedemo.com/checkout-step-two.html";
    String over_expected_url1=driver.getCurrentUrl();
    if(overviewUrl.equals(over_expected_url1))
    {
    	System.out.println("OverView Page is Displyed");
    }
    else
    {
    	System.out.println("OverView Page is Not Displyed");
    }
   
  //for scrolling page
    JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
	//is finish button is enabled or not
	//__________________________________________________________________
	 Thread.sleep(2000);
    //finish button////button[@id='finish']////button[contains(@id,'finish')]
    WebElement finishButton=driver.findElement(By.xpath("button[@id='finish']"));
    System.out.println(finishButton.isEnabled());
    finishButton.click();    //button is not working
   
    
    //congat page
    WebElement cong=driver.findElement(By.xpath("//button[text()='Back Home']"));
    System.out.println("Congatulations!!");
    
    Thread.sleep(2000);
    //clicking menu
    WebElement menulist=driver.findElement(By.xpath("//button[text()='Open Menu']"));
    menulist.click();
    Thread.sleep(2000);
    
    //for logout
    WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
    logout.click();
    Thread.sleep(2000);
    
    //exit from page
     driver.quit();
	}

}
