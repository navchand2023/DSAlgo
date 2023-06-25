package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;




public class Register_Page {
	//public static WebDriver driver = new ChromeDriver();
	public static WebDriver driver = DriverFactory.getdriver();
	//static String URL = "https://dsportalapp.herokuapp.com/register";
	static String URL = ConfigReader.getRegisterPageURL();
	
	@FindBy(xpath="//input[@id='id_username']") WebElement username;
	@FindBy(xpath="//input[@id='id_password1']") WebElement password;
	@FindBy(xpath="//input[@id='id_password2']") WebElement repeatPasswd;
	@FindBy(xpath="//input[@value='Register']") WebElement registerbtn;
	@FindBy(xpath="//a[@href='/login']") WebElement loginlink;
	@FindBy(xpath="//a[@href='/register']") WebElement registerlink;
	@FindBy(xpath="//div[@class='alert alert-primary']") WebElement errormessage;
	
	public Register_Page()
	{
		PageFactory.initElements(driver, this);
		
	}
	public Register_Page(WebDriver driver1)
	{
		//this.driver = driver1;
		//driver.get(URL);
		
	}
	public void getRegisterPage()
	{
		driver.get(URL);
	}
	public void register(String uname,String passwd,String rptpass)
	{
		username.sendKeys(uname);
		password.sendKeys(passwd);
		repeatPasswd.sendKeys(rptpass);
		registerbtn.click();
	}
	public String getAlertMessage(String textBoxName) {
		String alert="";
		if(textBoxName == "UserName") {
			alert= username.getAttribute("validationMessage");
			System.out.println("alert message :"+alert);
		}
		if(textBoxName == "Password") {
			alert= password.getAttribute("validationMessage");
			System.out.println("alert message :"+alert);
		}
		if(textBoxName == "rptPassword") {
			alert= repeatPasswd.getAttribute("validationMessage");
			System.out.println("alert message :"+alert);
		}
		return alert;
	}
	public String getErrorMessage()
	{
		String message="";
		message=errormessage.getText();
		return message;
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}

}
