package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;

public class SignIn_Page {
	//public static WebDriver driver = new ChromeDriver();
	public static WebDriver driver = DriverFactory.getdriver();
	static String URL = "https://dsportalapp.herokuapp.com/login";
	@FindBy(xpath="//input[@id='id_username']") WebElement usernamebox;
	@FindBy(xpath="//input[@id='id_password']") WebElement passwordbox;
	@FindBy(xpath="//input[@value='Login']") WebElement loginbtn ;	
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement errormessage;
	@FindBy(xpath="//a[@href='/login']") WebElement loginlink;
	@FindBy(xpath="//a[@href='/login']") WebElement registerlink;
	@FindBy(xpath="//a[@href='/logout']") WebElement logoutlink;
	public SignIn_Page()
	{
		PageFactory.initElements(driver, this);
	}
	public SignIn_Page(WebDriver driver1)
	{
		
	}
	public void getSignInPage()
	{
		driver.get(URL);
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void signIn(String uname,String pwd) {
		usernamebox.sendKeys(uname);
		passwordbox.sendKeys(pwd);
		loginbtn.click();
	}
//	public String getAlertMessage(String textBoxName) {
//		String alert="";
//		if(textBoxName == "UserName") {
//			alert= usernamebox.getAttribute("validationMessage");
//			System.out.println("alert message :"+alert);
//		}
//		if(textBoxName == "Password") {
//			alert= passwordbox.getAttribute("validationMessage");
//			System.out.println("alert message :"+alert);
//		}
//		
//		return alert;
//	}
	public String getAlertMessage() 
	{
		String alert="";
		
			alert= usernamebox.getAttribute("validationMessage")+passwordbox.getAttribute("validationMessage");
			//System.out.println("alert message :"+alert);
		
		return alert;
	}
	public String getErrorMessage()
	{
		String message="";
		message=errormessage.getText();
		return message;
	}
	public void gotoRegnpage()
	{
		registerlink.click();
	}
	public boolean isLoggedIn()
	{
		boolean loggedin= false;
		//loggedin = logoutlink.isDisplayed();
		loggedin = logoutlink.isEnabled();
		return loggedin;
	}
	public void logout() {
		if(isLoggedIn())
		logoutlink.click();
		
	}

}
