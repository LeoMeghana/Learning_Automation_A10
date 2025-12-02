package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoWebShopsPOM {
	
	@FindBy(linkText = "Register")
	private WebElement rigisterLink;
	
	@FindBy(id = "gender-female")
	private WebElement gender;
	
	@FindBy(name="FirstName")
	private WebElement firstName;
	
	@FindBy(id="LastName")
	private WebElement lastName;
	
	@FindBy(id="Email")
	private WebElement emailId;
	
	@FindBy(name="Password")
	private WebElement password;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	@FindBy(partialLinkText = "out")
	private WebElement logOutLink;
	
	//Initialization
	public DemoWebShopsPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getrigisterLink()
	{
		return rigisterLink;
	}
	
	public WebElement getgender()
	{
		return gender;
	}
	
	public WebElement getfirstName()
	{
		return firstName;
	}

	public WebElement getlastName()
	{
		return lastName;
	}
	
	public WebElement getemailId()
	{
		return emailId;
	}
	
	public WebElement getpassword()
	{
		return password;
	}
	
	public WebElement getconfirmPassword()
	{
		return confirmPassword;
	}
	
	public WebElement getregisterButton()
	{
		return registerButton;
	}
	
	public WebElement getlogOutLink()
	{
		return logOutLink;
	}
	

}
