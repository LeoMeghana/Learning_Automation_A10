package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
	//Declaration
	@FindBy(xpath = "//input[@placeholder=\"Username\"]")
	 private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(name = "login-button")
	private WebElement loginButton;
	
	//constructor--Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public WebElement getuserName()
	{
		return userName;
	}
	
	public WebElement getpassword()
	{
		return password;
	}
	
	public WebElement getloginButton()
	{
		return loginButton;
	}

}
