package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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

public class StackPage {
	
	private WebDriver driver;
	
	private static ConfigReader configReader;
	static Properties prop;
		
	ExcelUtility ER = new ExcelUtility();
	String xlpath = ConfigReader.getexcelfilepath();
	
	// Locators
	private @FindBy(xpath="//div[@class='nav-item dropdown']") WebElement dsDropdown;
	private @FindBy(xpath="//a[text()='Operations in Stack']") WebElement opInStack;
	//private @FindBy(xpath="//a[text()='Try here>>>']") WebElement stackTryhere;
	private @FindBy(xpath="//a[@href='/tryEditor']") WebElement stackTryhere;
	
	private @FindBy(xpath="//button[text()='Run']") WebElement runStackCodeBtn;
	private @FindBy(xpath="//a[text()='Implementation']") WebElement implementBtn;
	private @FindBy(xpath="//a[text()='Applications']") WebElement applicationsBtn;
	private @FindBy(xpath="//a[text()='Practice Questions']") WebElement practiceBtn;
	private @FindBy(xpath = "//textarea[@tabindex='0']")WebElement TextEditor;
	//Constructor of the page class
	public StackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Data Structure Dropdown option
	public void dsDropdownforStack(String Option) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		dsDropdown.click();	
				
		//to catch all web elements into list
		List<WebElement> allDSOptions = driver.findElements(By.xpath("//a[(@class='dropdown-item')]"));//Get all the options on the ds dropdown
		
		System.out.println("In StackPage: Option passed :" +Option);
						
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
	
	public void redirectStackPage() {
//		configReader = new configReader();
//		prop = configReader.init_prop();
//		String stack = prop.getProperty("Stack");
//		System.out.println("Stack url: " +stack);
		String stack = configReader.getStackURL();
		driver.get(stack);
	}
	
	public void opInStackClick() {
		opInStack.click();		
	}
	
	public void tryhereClick() {
		stackTryhere.click();		
	}
	
	public void runBtnClick() {
		runStackCodeBtn.click();
	}
	
	public void implementBtnClick() {
		implementBtn.click();
	}
	
	public void applicationsBtnClick() {
		applicationsBtn.click();
	}
	
	public void practiceBtnClick() {
		practiceBtn.click();
	}
	public void enterPythonCode(String Sheetname, int RowNumber) throws Exception {
		
		String sheetnm = Sheetname;
		Integer rowno= RowNumber;


		System.out.println("Sheet name is : "+sheetnm+" and rownumber is : "+rowno);
		List<Map<String,String>> pythonCodes =ER.getData(xlpath, sheetnm); 
		String code =pythonCodes.get(rowno).get("Pythoncode");
		System.out.println("Python code is ::::"+code);
		TextEditor.sendKeys(code);
	}
	public void goToEditorpage()
	{
		String editorURL=configReader.getEditorUrl();
		driver.get(editorURL);
	}
	
}