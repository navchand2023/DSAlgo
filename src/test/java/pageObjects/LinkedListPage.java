package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.qa.utilities.ExcelUtility;
import dsutilities.ConfigReader;
import factory.DriverFactory;

public class LinkedListPage {
	
	

static Properties prop;
public static WebDriver driver = DriverFactory.getdriver();
ConfigReader CR = new ConfigReader();	
ExcelUtility ER = new ExcelUtility();
String xlpath = ConfigReader.getexcelfilepath();
	
	//Locators
	private @FindBy (name = "username") WebElement regUserName;
	private @FindBy (name = "password") WebElement regUserPwd;
	private @FindBy (xpath = "//input[@type='submit']") WebElement regUsrLogin;
	
	private @FindBy(xpath="//div[@class='nav-item dropdown']") WebElement dsDropdown;
	
	private @FindBy(xpath="//a[text()='Introduction']") WebElement llIntroduction;
	//private @FindBy(xpath = "//a[text()='Try here>>>']") WebElement llTryhere;--test
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement llTryhere;
	private @FindBy(xpath = "//textarea[@tabindex='0']") WebElement llTryEditor;
	private @FindBy(xpath = "//button[text()='Run']") WebElement runCodeBtn;
	private @FindBy(xpath = "//a[text()='Creating Linked LIst']") WebElement creatingLL;
	private @FindBy(xpath = "//a[text()='Types of Linked List']") WebElement llTypes;
	private @FindBy(xpath = "//a[text()='Implement Linked List in Python']") WebElement implementLL;
	private @FindBy(xpath = "//a[text()='Traversal']") WebElement traversalLL;
	private @FindBy(xpath = "//a[text()='Insertion']") WebElement insertionLL;
	private @FindBy(xpath = "//a[text()='Deletion']") WebElement deletionLL;
	private @FindBy(xpath = "//a[text()='Practice Questions']") WebElement practiceLL;
	
	//Constructor of the page class
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void signInLink() {
//		configReader = new configReader();
//		prop = configReader.init_prop();
//		String login = prop.getProperty("LoginPage");
//		driver.get(login);
		String login = CR.getLoginPage();
		driver.get(login);
	}
	
	public void signInDetailsRegUser(String Username, String Pwd) {
		regUserName.sendKeys(Username);
		regUserPwd.sendKeys(Pwd);
	}
	
	public void loginBtnClickRegUser() {
		regUsrLogin.click();
	}
	
	public void redirectHomePage() {
		String homepage = CR.getHomePageURL();
		driver.get(homepage);
	}
	
	public void redirectLinkedListPage() {
//		configReader = new configReader();
//		prop = configReader.init_prop();
//		String linkedlist = prop.getProperty("LinkedList");
//		driver.get(linkedlist);
		String linkedlist = CR.getLinkedListURL();
		driver.get(linkedlist);
	}
	
	// Data Structure Dropdown option
	public void dsDropdownforLinkedList(String Option) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		dsDropdown.click();	
			
		//to catch all web elements into list
		List<WebElement> allDSOptions = driver.findElements(By.xpath("//a[(@class='dropdown-item')]"));//Get all the options on the ds dropdown
			
		System.out.println("In LLPage: Option passed :" +Option);
					
		for(WebElement eachOption:allDSOptions){
		 	if (eachOption.getText().contains(Option)){
		 		System.out.println("In Selection: " +Option);
		 		eachOption = wait.until(ExpectedConditions.elementToBeClickable(eachOption));
		 		new Actions(driver).moveToElement(eachOption)
				.pause(Duration.ofSeconds(1)).clickAndHold().pause(Duration.ofSeconds(1)).click().perform();
		 		break;
			}
		}	
	}
	
	public void readDatafromExcel(String sheetname, int rowNumber) throws InvalidFormatException, IOException {
		
		List<Map<String, String>> testdata = ER.getData(xlpath, sheetname);
		String code = testdata.get(rowNumber).get("Code");
		String result = testdata.get(rowNumber).get("Result");

		//Loggerload.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
		System.out.println("Code Entered\" " + code + " \"and Result is \" " + result + "\" ");
		if (code != null || result != null)
			tryEditor(code, result);
		
	}
	
//		ExcelReader reader = new ExcelReader();
//		configReader = new configReader();
//		prop = configReader.init_prop();
//		String usrdir = prop.getProperty("userdir");
//		String ExcelPath = prop.getProperty("ExcelPath");
//		
//		//private static Logger logger = LogManager.getLogger();
//		
//		//String Excelpath = System.getProperty("user.dir")+"/src/test/resources/TestData/TestData.xlsx";
//		String ExcelFilePath = System.getProperty(usrdir)+ ExcelPath;
//
//		List<Map<String, String>> testdata = reader.getData(ExcelFilePath, sheetname);
//		String code = testdata.get(rowNumber).get("Code");
//		String result = testdata.get(rowNumber).get("Result");
//
//		//Loggerload.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
//		System.out.println("Code Entered\" " + code + " \"and Result is \" " + result + "\" ");
//		if (code != null || result != null)
//			tryEditor(code, result);
	
	
	public void tryEditor(String code, String result) {
		llTryEditor.sendKeys(code);
	}
	
	public void navigateTo(String pageName, String dsName)
	{
		String pageUrl = "";
		System.out.println("pageName passed: " +pageName);
		System.out.println("dsName passed: " +dsName);
		
		if (dsName.equalsIgnoreCase("Linked List"))
		{
			System.out.println("I am here in Linked List");
			pageUrl = CR.getLinkedListURL();
		}
		else if (dsName.equalsIgnoreCase("Stack"))
		{
			System.out.println("I am here in Stack");
			pageUrl = CR.getStackURL();
		}
		else if (dsName.equalsIgnoreCase("Arrays"))
		{
			System.out.println("I am here in Arrays");
			pageUrl = CR.getArrayURL();
		}
		
		System.out.println("pageName passed: " +pageName);
		String url = pageUrl +pageName + "/";
		System.out.println("Url " +url);
	
		driver.get(url);
		tryhereClick();
	}
	
	public void tryhereClick() {
		llTryhere.click();
	}
	
	public void runBtnClick() {
		runCodeBtn.click();
	}
	
	public void linkedListIntro() {
		llIntroduction.click();		
	}
	
	public void creatingLLClick() {
		creatingLL.click();
	}
	
	public void llTypesClick() {
		llTypes.click();
	}
	
	public void implementLLClick() {
		implementLL.click();
	}
	
	public void traversalLLClick() {
		traversalLL.click();
	}
	
	public void insertionLLClick() {
		insertionLL.click();
	}
	
	public void deletionLLClick() {
		deletionLL.click();
	}
	
	public void practiceLLClick() {
		practiceLL.click();
	}
	
	public void popUpClick() {
		
		try{
		    System.out.println("Waiting for Alert");
		    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.alertIsPresent()).dismiss();
		    System.out.println("Alert Displayed");
		}
		catch (Exception e){
		    System.out.println("Alert not Displayed");
		}
	}	

	// page actions: features
	public String getPageTitle() {
		return driver.getTitle();
	}
}


