package LearningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1_POMFile {
	//____________________LOGIN ACTION__________________
	//1.Declaration
	    //find element
	       @FindBy(id="user-name")
	       private WebElement userName_t1;
	//2.initialization
	       public Task1_POMFile(WebDriver driver)
	       {
	    	   PageFactory.initElements(driver,this);
	       }
	
	//3.Utilization
	       public WebElement getuserName_t1()
	       {
			return userName_t1;
	    	   
	       }
	       //______________________________password_________
	      @FindBy(id="password")
	      private WebElement password_t1;
	      //utilization
	      public WebElement getpassword_t1()
	      {
			return password_t1;
	    	  
	      }
	      //________________________________Button____________
	      @FindBy(id="login-button")
	      private WebElement loginButton_t1;
	      //utilization
	      WebElement getloginButton_t1()
	      {
			return loginButton_t1;
	    	  
	      }
	      
	      //********************************HOMEPAGE ACTION****************************************
	     @FindBy(xpath = "//div[contains(text(),'Sauce Labs Backpack')]")
	     private WebElement item;//Declaration
	     public WebElement getitem()
	     {
			return item;
	    	 
	     }
	     @FindBy(id="add-to-cart")
	     private WebElement addToCartButton;
	     public WebElement getaddToCartButton()
	     {
			return addToCartButton;
	    	 
	     }
	     @FindBy(id="shopping_cart_container")
	     private WebElement cartContainer;
	     public WebElement getcartContainer()
	     {
			return cartContainer;
	    	 
	     }
	     
	     @FindBy(id="checkout")
	     private WebElement checkoutButton;
	     public WebElement getcheckoutButton()
	     {
			return checkoutButton;
	    	 
	     }
	     //******************************CHCEKOUT INFO***************************
	     @FindBy(id="first-name")
	    private WebElement firstName;
	     public WebElement getfirstName()
	     {
	    	 return firstName;
	     }
	     @FindBy(id="last-name")
	     private WebElement lastName;
	     public WebElement getlastName()
	     {
	    	 return lastName;
	     }
	     @FindBy(id="postal-code")
	     private WebElement zipCode;
	     public WebElement getzipCode()
	     {
	    	 return zipCode;
	     }
	     @FindBy(id="continue")
	     private WebElement coninueButton;
	     public WebElement getconinueButton()
	     {
	    	 return coninueButton;
	     }
	     @FindBy(id="finish")
	     private WebElement finishButton;
	     public WebElement getfinishButton()
	     {
	    	 return finishButton;
	     }
	     @FindBy(id="checkout_complete_container")
	     private WebElement pagetext;
	     public WebElement getpagetext()
	     {
	    	 return pagetext;
	     }
}

