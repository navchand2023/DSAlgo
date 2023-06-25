package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Queue_Page {
	
	
	public static WebDriver driver = DriverFactory.getdriver();
	static String QueueURL = ConfigReader.getQueueUrl();
	static String homePageURL = ConfigReader.getHomePageURL();
	static String signInURL = ConfigReader.getLoginPage();
	static String implementListURL = ConfigReader.getImpOfQPythonUrl();
	static String dequeueURL = ConfigReader.getDQUrl();
	static String queueOpURL = ConfigReader.getQueueOpUrl();
	static String editorPageURL = ConfigReader.getEditorUrl();
	static String implementArrayURL = ConfigReader.getImpArrayUrl();
	static String practiceQURL = ConfigReader.getPracticeQUrl();
	@FindBy(xpath="//a[@href='implementation-lists']") WebElement pythonImplink;
	@FindBy(xpath="//a[@href='/queue/implementation-lists/']") WebElement dequeuelink;
	@FindBy(xpath="//a[@href='implementation-collections']") WebElement dqlink;
	@FindBy(xpath="//a[@href='Implementation-array']") WebElement impArraylink;
	@FindBy(xpath="//a[@href='QueueOp']") WebElement queueOplink;
	@FindBy(xpath="//a[@href='/queue/practice']") WebElement practiceQlink;	
	@FindBy(xpath="//a[@class='btn btn-info']") WebElement tryherebtn;
	@FindBy(xpath="//textarea[@tabindex='0']") WebElement editorbox;
	//@FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea") WebElement editorbox;
	//@FindBy(xpath="//*[@id='answer_form']/div/div/div[6]/div[1]/div") WebElement editorbox;
	@FindBy(xpath="//button[text()='Run']") WebElement runbutton;
	@FindBy(xpath="//*[@id='output']") WebElement outputbox;
	//*[@id="output"]
	@FindBy(xpath="//div[@class='nav-item dropdown']") WebElement dropdown;
	@FindBy(xpath="//a[text()='Queue']") WebElement qlist;
	public Queue_Page()
	{
		PageFactory.initElements(driver, this);
	}
	public Queue_Page(WebDriver driver1)
	{
		
	}
	public void getHomePage()
	{
		driver.get(homePageURL);
	}
	public void getQueuePage()
	{
		driver.get(QueueURL);
	}
	public void getSigninPage()
	{
		driver.get(signInURL);
	}
	public void clickQueuedropdown()
	{
		dropdown.click();
		qlist.click();
	}
	public void getImplimentationListsPage()
	{
		driver.get(implementListURL);
	}
	public void getdeQueuePage()
	{
		driver.get(dequeueURL);
	}
	public void getEditorPage()
	{
		driver.get(editorPageURL);
	}
	public void getImpArrayPage()
	{
		driver.get(implementArrayURL);
	}
	public void getQueueOpPage()
	{
		driver.get(queueOpURL);
	}
	public void getPracticeQPage()
	{
		driver.get(practiceQURL);
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void clickPythonLink()
	{
		pythonImplink.click();
	}
	public void clickDequeueLink()
	{
		//dequeuelink.click();
		dqlink.click();
	}
	public void clickImpArrayLink()
	{
		impArraylink.click();
	}
	public void clickQueueOpLink()
	{
		queueOplink.click();
	}
	public void clickPracticeQLink()
	{
		practiceQlink.click();
	}
	public void clickTryHere()
	{
		tryherebtn.click();
	}
	
	public void enterPythonCode(String code) {
		
		editorbox.sendKeys(code);
		
	}
	public void clickRun() {
		runbutton.click();
		
	}
	public String getOutput()
	{
		String output = "";
		output =outputbox.getText();
		return output;
	}
	public String getAlertText()
	{
		String msg = "";
		msg= driver.switchTo().alert().getText();
		return msg;
	}
	public void acceptalert()
	{
		driver.switchTo().alert().accept();
	}

}
