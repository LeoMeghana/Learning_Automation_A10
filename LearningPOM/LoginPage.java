package LearningPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//1.Element Declaration
	@FindBy(id="user-name")//for identifying
	private WebElement userName_textField;
	
	
	//2.Element initialization
	public  LoginPage(WebDriver driver)//constructor
	{
		PageFactory.initElements(driver,this);
	}
	
	//3.Element utilization
	public WebElement getuserName_textField()
	{
		return userName_textField;
	}
	
	//____________________2_______________________________
	//1.Declaration
	@FindBy(id="password")
	private WebElement  password_textField;
	//utilization
     public WebElement getpassword_textField()
     {
    	 
	return password_textField;
	
     }
     //______________________3______________
     //declaration
     @FindBy(id="login-button")
      private WebElement login_button ;
     //utilization
     public WebElement getlogin_button()
     {
		return login_button;
    	 
     }

}
