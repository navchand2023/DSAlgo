package pageObjects;

import static org.hamcrest.CoreMatchers.theInstance;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dsutilities.ConfigReader;
import com.qa.utilities.ExcelUtility;
import dsutilities.LoggerLoad;
import factory.DriverFactory;



public class DataStructure {
	
	public static WebDriver driver = DriverFactory.getdriver();
	ConfigReader CR = new ConfigReader();
	
	
	ExcelUtility ER = new ExcelUtility();
	String xlpath = ConfigReader.getexcelfilepath();

	public DataStructure() {
		PageFactory.initElements(driver, this);
	}
	
	
	//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	
	@FindBy (xpath = "//input[@id='id_username']")WebElement usernametext;
	@FindBy (xpath = "//input[@id='id_password']")WebElement passwordtext;
	@FindBy (xpath = "//input[@value='Login']")WebElement loginbutton;
	@FindBy (xpath = "//div[3]/div[1]/div[1]/div/a")WebElement DSgetstarted;
	@FindBy (xpath = "//a[text()='Time Complexity']")WebElement timecomplex;
	@FindBy (xpath = "//a[text()='Try here>>>']")WebElement tryherebutton;
	@FindBy (xpath = "//textarea[@tabindex='0']")WebElement TextEditor;
	@FindBy (xpath = "//button[text()= 'Run']")WebElement runButton;
	@FindBy (xpath = "//*[@id=\"output\"]")WebElement Output;
	
		public void Credentials () {
			
			usernametext.sendKeys("numpy@108_1");
			passwordtext.sendKeys("Welcome108");
			
		}
		public void Login() {
			
			loginbutton.click();
		}
		
		public void Datastructurehomepage() {
			
		String title= driver.getTitle();
		//String expectedtitle = "NumpyNinja";
		//Assert.assertEquals(expectedtitle, title);
		System.out.println("The user is on Page : "+ title);
		}
		
		public void DSGetstarted() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOf(DSgetstarted));
			DSgetstarted.click();
			
		}
		
		public void verifyDSpage() {
			String expected0 = "Data Structures-Introduction";
			String page0= driver.getTitle();
			Assert.assertEquals(expected0, page0);
		}
		
		public void CilckTimeComplex() {
			
			String DSURL = CR.getDataStructureURL();	
			driver.navigate().to(DSURL);
			WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
			wait.until(ExpectedConditions.visibilityOf(timecomplex));
			timecomplex.click();
			
		}
		
		public void verifyTCpage() {
			String expected1 = "Time Complexity";
			String page1= driver.getTitle();
			Assert.assertEquals(expected1, page1);
		}
		
		public void TimeComplexityPage () {
			
			String DSURL2 = CR.getTimeComplexityURL();
			driver.navigate().to(DSURL2);
			
		}
		
		public void TryHerebutton() {
			Actions action = new Actions(driver);
			action.sendKeys(Keys.END).perform();
			
			tryherebutton.click();
		}
		
		public void verifyTHpage() {
			
			String expected2= "Assessment";
			String page2 = driver.getTitle();
			System.out.println(page2);
			Assert.assertEquals(expected2, page2);
		}
		
		public void TryHerepage() {
			String DSURL3 = ConfigReader.getEditorUrl();
			driver.navigate().to(DSURL3);
			
			
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
		
		public void RunButton() {
			runButton.click();
		}
		
		public void getOutput() {
			
			String output= Output.getText();
			System.out.println(output);
			LoggerLoad.info(output);
		}
		

		public void Errormessage() {
			Alert alert = driver.switchTo().alert();
			String errormessage = alert.getText();
			alert.accept();
			System.out.println(errormessage);
			LoggerLoad.info(errormessage);
			
		}
		
		
		
		
}
