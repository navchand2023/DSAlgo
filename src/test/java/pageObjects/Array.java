package pageObjects;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import dsutilities.ConfigReader;
import com.qa.utilities.ExcelUtility;
import dsutilities.LoggerLoad;
import factory.DriverFactory;

public class Array {

	public static WebDriver driver = DriverFactory.getdriver();
	ConfigReader CR = new ConfigReader();	
	ExcelUtility ER = new ExcelUtility();
	String xlpath = ConfigReader.getexcelfilepath();
	
	@FindBy(xpath = "//div[3]/div[2]/div/div/a")WebElement GetStarted;
	@FindBy(xpath = "//a[text()='Arrays in Python']" )WebElement arrayinpython;
	@FindBy(xpath = "//a[text()='Arrays in Python']")WebElement ArrayInPythonButton;
	@FindBy(xpath = "//a[text()='Try here>>>']")WebElement tryherebutton;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement TextEditor;
	@FindBy(xpath = "//a[text()='Arrays Using List']")WebElement ArrayusingLinkButton;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")WebElement ArrayBasicOperationInListButton;
	@FindBy(xpath = "//a[text()='Applications of Array']")WebElement ApplicationOfArrayButton;
	@FindBy(xpath = "//a[text()='Practice Questions']")WebElement practiceQuestionsButton;
	@FindBy(xpath = "//a[text()='Search the array']")WebElement SearchTheArray;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")WebElement QuestionTexteditor;
	@FindBy(xpath = "//input[@type='submit']")WebElement submitbutton;
	@FindBy(xpath = "//pre[text()='Submission Successful']")WebElement submitsuccess;
	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")WebElement maxConsecutiveLink;
	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")WebElement FindNumbers;
	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array']")WebElement SquaresofSortedArray;
	@FindBy (xpath = "//input[@id='id_username']")WebElement usernametext;
	@FindBy (xpath = "//input[@id='id_password']")WebElement passwordtext;
	@FindBy (xpath = "//input[@value='Login']")WebElement loginbutton;
	
	public Array() {
		
		PageFactory.initElements(driver, this);
	}
	public void NinjaHomepage() {
		String signinurl = CR.getLoginPage();
		driver.get(signinurl);
//		Usernamebutton.sendKeys("Ninja_Hawks3");
//		passwordText.sendKeys("SDET@110");
		usernametext.sendKeys("numpy@108_1");
		passwordtext.sendKeys("Welcome108");
		loginbutton.click();
	}
	
	public void clickgetStarted() {
		
		GetStarted.click();
		
	}
	
	public void verifypage() {
		String expected = "Array";
		String page= driver.getTitle();
		Assert.assertEquals(expected, page);
	}
	
	public void clickonPython() {
		arrayinpython.click();
		
	}
	public void Arrayhomepage() {
		String arrayURl= CR.getArrayURL();
		driver.navigate().to(arrayURl);
		
	}
	
	public void ArrayInPython() {
		
		ArrayInPythonButton.click();
	}
	
	public void verifypageArrayInPython() {
		String Userpage = driver.getTitle();
		String Expectedpage = "Arrays in Python";
		Assert.assertEquals(Expectedpage, Userpage);
		}
	
	public void ArrayInPythonPage() {
		String arrayURL2 = CR.getArrayURL2();
		driver.navigate().to(arrayURL2);
		
		
	}
	 public void tryherebutton() {
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.END).perform();
		 tryherebutton.click();
	 }
	 public void TryHerePage() {
		 String arrayURL3 = CR.getEditorUrl();
		 driver.navigate().to(arrayURL3);
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
	 public void ArrayUsingLink() {
		 ArrayusingLinkButton.click();
		 
	 }
	 public void ArrayUsingLinkPage() {
		 String pageURL = driver.getTitle();
		 String ExpectedPage = "Arrays Using List";
		 Assert.assertEquals(ExpectedPage, pageURL);
		  }
	 
	 public void TryHerepageUsingLink() {
		 String PageURL4 = CR.getArrayURL4();
		 driver.navigate().to(PageURL4);
	 }
	 
	 public void ArrayBasicOperationInList() {
		 ArrayBasicOperationInListButton.click();
		 
	 }
	 public void ArrayBasicOperationInListPage() {
		 String PageURL = driver.getTitle();
		 String Expectedpage= "Basic Operations in Lists";
		 Assert.assertEquals(Expectedpage, PageURL);
	 }
	 public void TryHerePageBasicOperations() {
		 String PageURL5 = CR.getArrayURL5();
		 driver.navigate().to(PageURL5);
	 }
	 public void ApplicationOfArray() {
		 ApplicationOfArrayButton.click();
	 }
	 
	 public void ApplicationOfArrayPage() {
		 String pageurl = driver.getTitle();
		 String expectedurl = "Applications of Array";
		 Assert.assertEquals(expectedurl, pageurl);
				 
	 }
	 public void TryHerePageApplicationOfArray() {
		 String PageURL6= CR.getArrayURL6();
		 driver.navigate().to(PageURL6);
//		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		 wait.until(ExpectedConditions.visibilityOf(practiceQuestionsButton));
		 
	 }
	 public void PracticeQuestions() {
		 practiceQuestionsButton.click();
	 }
	 public void PracticeQuestionsPage() {
		String pageurl = driver.getTitle();
		String expectedurl = "Practice Questions";
		Assert.assertEquals(expectedurl, pageurl);
	 }
	 public void GoToPracticeQuestions() {
		 String pageurl7 = CR.getArrayURL7();
		 
		 driver.navigate().to(pageurl7);
	 }
	 
	 public void SearchTheArray() {
		 SearchTheArray.click();
	 }
	 public void SearchTheArrayPage() {
		 String pageurl = driver.getTitle();
		 String expectedurl = "Assessment";
		 Assert.assertEquals(expectedurl, pageurl);
	 }
	 public void QuestionsPage() {
		 String pageurl8= CR.getArrayURL8();
		 driver.navigate().to(pageurl8);
	 }
	
	 public void TryEditor1(String Sheetname, int RowNumber) throws Exception {
			
			String sheetnm = Sheetname;
			Integer rowno= RowNumber;


			System.out.println("Sheet name is : "+sheetnm+" and rownumber is : "+rowno);
			List<Map<String,String>> pythonCodes =ER.getData(xlpath, sheetnm); 
			String code =pythonCodes.get(rowno).get("Pythoncode");
			System.out.println("Python code is ::::"+code);
			TextEditor.sendKeys(Keys.COMMAND ,"a");
			TextEditor.sendKeys(Keys.CLEAR);
			TextEditor.sendKeys(code);
		}
	 
	public void clickSubmitButton() {
		submitbutton.click();
	}
	
	public void successmessage() {
		String successmessage = submitsuccess.getText();
		LoggerLoad.info(successmessage);
	}
	
	public void invalidCode(String Sheetname, int RowNumber) throws Exception {
		//String xlpath= p.getProperty("ExcelSheet");
		List<Map<String, String>> code = ER.getData(xlpath, Sheetname);
		TextEditor.sendKeys(Keys.CONTROL ,"a");
		TextEditor.sendKeys(code.get(RowNumber).get("PythonCode"));
	}
	public void maxConsecutiveLink() {
		maxConsecutiveLink.click();
	}
	
	public void TryEditorMaxConsecutiveLink() {
		String pageurl9 = CR.getArrayURL9();
		driver.navigate().to(pageurl9);
	}
	
	public void FindNumbers() {
		FindNumbers.click();
	}
	
	public void findNumbersPage() {
		String pageurl10 = CR.getArrayURL10();
		driver.navigate().to(pageurl10);
	}
	public void SortedArrayLink() {
		SquaresofSortedArray.click();

	}
	public void QuestionsSortedArrayLink() {
		String pageurl11 = CR.getArrayURL11();
		driver.navigate().to(pageurl11);
	}
}
