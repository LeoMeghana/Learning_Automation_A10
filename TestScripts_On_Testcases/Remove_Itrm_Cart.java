package TestScripts_On_Testcases;

import java.sql.Driver;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Remove_Itrm_Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//configure and setup
		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	     //userinput
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter BrowserName?");
		String browser=sc.next();
		System.out.println("Enter ProductNUmber, you Want to add!?");
		int product=sc.nextInt();
		//launching browser
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Edge")){
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			driver=new FirefoxDriver();
		}
		else{
			System.out.println("Enter chrome/edge/firefox");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30l, TimeUnit.SECONDS);
		
		//ExplicitWait
		WebDriverWait wait = new WebDriverWait(driver, 30l);
		
		
		
		driver.get("https://www.saucedemo.com/");
	    String	expected_url=driver.getCurrentUrl();
		//veryfing login page
		String login_url="https://www.saucedemo.com/";
		if(expected_url.equals(login_url)){
			System.out.println("Verified:Login Page is Displyed");
		}
		else{
			System.out.println("Login Page not displyed");
		}
		//login with username and password
		//LoginPAge--username
        WebElement username=driver.findElement(By.id("user-name"));
        username.sendKeys("error_user");
        //password
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        //loginButton
        WebElement login_button=driver.findElement(By.cssSelector("#login-button"));
        login_button.click();
       //verifying homepage
       String  homepage_url=driver.getCurrentUrl();
       String homepage_actualurl="https://www.saucedemo.com/inventory.html";
       if(homepage_actualurl.equals(homepage_actualurl)) {
    	   System.out.println("Verified:HomePage is Displyed");
       }
       else {
    	   System.out.println("HomePage is Not verified");
       }
     //add item to cart
       WebElement addProduct =null;
       switch(product) {
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
	//click on carticon
	WebElement cartsvg=driver.findElement(By.className("shopping_cart_link"));
	cartsvg.click();
	//Verifing YourCartPAge
	String  carturl=driver.getCurrentUrl();
    String  cart_actualurl="https://www.saucedemo.com/cart.html";
    if(cart_actualurl.equals(cart_actualurl)){
 	   System.out.println("Verified:YourPage is Displyed");
    }
    else{
 	   System.out.println("YourCArt is Not verified");
    }
    Thread.sleep(3000);
    //click on removw button
    WebElement  element=driver.findElement(By.xpath("//div[@class='cart_item']"));
     if(element.isDisplayed()){
    	 WebElement removeButton=driver.findElement(By.xpath("//button[text()='Remove']"));
    	 removeButton.click();
	  System.out.println("Item is Removed From Cart");
       }
     else{
    	 System.out.println("Item is Not Removed From cart.");
     }
     
    // Thread.sleep(3000);
     wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout")));
     //checkout button
     WebElement checkoutButton=driver.findElement(By.id("checkout"));
 	checkoutButton.click();
 	//fiestname
 	String infoPageUrl="https://www.saucedemo.com/checkout-step-one.html";
     String	expected_url1=driver.getCurrentUrl();
     if(infoPageUrl.equals(expected_url1)){
     	System.out.println("Verified:Your InformationPage is Displyed.");
     }
     else {
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
     if(overviewUrl.equals(over_expected_url1)) {
     	System.out.println("Verified:OverView Page is Displyed");
     }
     else {
     	System.out.println("OverView Page is Not Displyed");
     }
   //for scrolling page
     JavascriptExecutor js = (JavascriptExecutor) driver;
 	js.executeScript("window.scrollBy(0,250)");
 	
 	Thread.sleep(5000);
 	
 	//Explicit Condition
 	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Finish')]")));
 	
 	//__________________________________NOT EXECUTING________________________________________
 	  //finish button
 	WebElement finishButton=driver.findElement(By.xpath("//button[contains(text(),'Finish')]"));
 	finishButton.click();
      //congat page
     WebElement cong=driver.findElement(By.xpath("//button[text()='Back Home']"));
     System.out.println("Congatulations!! Page");
     Thread.sleep(2000);
     //clicking menu
     WebElement menulist=driver.findElement(By.xpath("//button[text()='Open Menu']"));
     menulist.click();
     Thread.sleep(2000);
     //for logout
     WebElement logout=driver.findElement(By.xpath("//a[text()='Logout']"));
     logout.click();
     Thread.sleep(2000);
     System.out.println("Logout done Succesfully!!");
     //exit from page
      driver.quit();
      }
	}

	


