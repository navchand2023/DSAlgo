package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Home_Page {
	
	public static WebDriver driver = DriverFactory.getdriver();
	//static String URL = "https://dsportalapp.herokuapp.com/home";
	//static String AppURL ="https://dsportalapp.herokuapp.com";
	static String URL = ConfigReader.getHomePageURL();
	static String AppURL = ConfigReader.getApplicationUrl();
	private @FindBy(xpath="//a[@href=\"/home\"]") WebElement startbtn;
	private @FindBy(xpath="//a[@href='data-structures-introduction']") WebElement startdsbtn;
	private @FindBy(xpath="//a[@href='stack']") WebElement startstackbtn;
	private @FindBy(xpath="//a[@href='array']") WebElement startarraybtn;
	private @FindBy(xpath="//a[@href='linked-list']") WebElement startLLbtn;
	private @FindBy(xpath="//a[@href='tree']") WebElement startTreebtn;
	private @FindBy(xpath="//a[@href='queue']") WebElement startQbtn;
	private @FindBy(xpath="//a[@href='graph']") WebElement startGraphbtn;
	private @FindBy(xpath="//div[@class='alert alert-primary']") WebElement alertMsg;
	private @FindBy(xpath="//a[text()=' Register ']") WebElement regnlink;
	private @FindBy(xpath="//a[text()='Sign in']") WebElement signInlink;
	private @FindBy(xpath="//div[@class='nav-item dropdown']") WebElement dropdown;
	private @FindBy(xpath="//a[text()='Data Structures']") WebElement dslist;
	private @FindBy(xpath="//a[text()='Arrays']") WebElement arrlist;
	private @FindBy(xpath="//a[text()='Stack']") WebElement stacklist;
	private @FindBy(xpath="//a[text()='Queue']") WebElement qlist;
	private @FindBy(xpath="//a[text()='Graph']") WebElement graphlist;
	private @FindBy(xpath="//a[text()='Linked List']") WebElement lllist;
	private @FindBy(xpath="//a[text()='Tree']") WebElement treelist;
	
	public Home_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Home_Page(WebDriver driver1)
	{
		//this.driver = driver1;
		//driver.get(URL);
		
	}
	public void getAppPage()
	{
		driver.get(AppURL);
	}
	public void getStarted() {
		startbtn.click();
	}
	public void getHomePage()
	{
		driver.get(URL);
	}
	public void goToRegister()
	{
		regnlink.click();
		
	}
	public void goToSignIn()
	{
		signInlink.click();		
	}
	public void clickGetStarted(String option)
	{
		switch(option) {
		case "Datastructures": startdsbtn.click();
			break;
		case "Arrays": startarraybtn.click();;
			break;
		case "Stack": startstackbtn.click();
			break;
		case "Tree": startTreebtn.click();
			break;
		case "Queue": startQbtn.click();
			break;
		case "Graph": startGraphbtn.click();
			break;
		case "Linkedlist": startLLbtn.click();
			break;
		}
		}
	public void clickdropdown(String option)
	{
			dropdown.click();
		
			switch(option) {
			case "Data Structures": dslist.click();
				break;
			case "Arrays": arrlist.click();;
				break;
			case "Stack": stacklist.click();
				break;
			case "Tree": treelist.click();
				break;
			case "Queue": qlist.click();
				break;
			case "Graph": graphlist.click();
				break;
			case "Linked List": lllist.click();
				break;
			}
	}
	public String getWarningMessage()
	{
		String warning ="";
		warning = alertMsg.getText();
		return warning;
	}
	public String getAlertMessage()
	{
		String warning ="";
		warning = alertMsg.getText();
		return warning;
	}
	public boolean isLoggedIn()
	{
		if(signInlink.isDisplayed()) {
	    	System.out.println("Not logged in");
	    	return false;
	    }
		else
			return true;
	}
	public String getPageTitle()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String pagetitle = driver.getTitle();
		return pagetitle;
	}
}
