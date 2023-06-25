package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsutilities.ConfigReader;
import factory.DriverFactory;

public class Tree_Page {
	public static WebDriver driver = DriverFactory.getdriver();
	static String treeURL = ConfigReader.getTreeUrl();
	static String homePageURL = ConfigReader.getHomePageURL();
	static String signInURL = ConfigReader.getLoginPage();
	static String editorPageURL = ConfigReader.getEditorUrl();
	@FindBy(xpath="//div[@class='nav-item dropdown']") WebElement dropdown;
	@FindBy(xpath="//a[text()='Tree']") WebElement treelist;
	@FindBy(xpath="//a[@class='btn btn-info']") WebElement tryhereBtn;
	//page links
	@FindBy(xpath = "//*[@href='overview-of-trees']")WebElement overviewOfTreesLink;	
	@FindBy(xpath = "//*[@href='types-of-trees']")WebElement typesoftreesLink;
	@FindBy(xpath = "//*[@href='terminologies']")WebElement terminologiesLink;
	@FindBy(xpath = "//*[@href='tree-traversals']")WebElement treetraversalsLink;
	@FindBy(xpath = "//*[@href='traversals-illustration']")WebElement travIllustrationsLink;
	@FindBy(xpath = "//*[@href='binary-trees']")WebElement binarytreesLink;
	@FindBy(xpath = "//*[@href='types-of-binary-trees']")WebElement typesofBinaryTreesLink;
	@FindBy(xpath = "//a[@href='implementation-in-python']")WebElement implementationInPythonLink;
	@FindBy(xpath = "//a[@href='binary-tree-traversals']")WebElement binaryTreeTraversalsLink;
	@FindBy(xpath = "//a[@href='implementation-of-binary-trees']")WebElement implementationOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='applications-of-binary-trees']")WebElement applicationsOfBinaryTreesLink;
	@FindBy(xpath = "//a[@href='binary-search-trees']")WebElement binarySearchTreesLink;
	@FindBy(xpath = "//a[@href='implementation-of-bst']")WebElement implementationBSTLink;
	@FindBy(xpath = "//a[@href='/tree/practice']")WebElement practiceQLink;
	//editor area
	@FindBy(xpath="//*[@id='answer_form']/div/div/div[1]/textarea") WebElement editorbox;
	@FindBy(xpath="//*[@id='output']") WebElement outputbox;
	@FindBy(xpath="//button[text()='Run']") WebElement runbutton;
	public Tree_Page()
	{
		PageFactory.initElements(driver, this);
	}
	public void getHomePage()
	{
		driver.get(homePageURL);
	}
	public void getTreePage()
	{
		driver.get(treeURL);
	}
	public void getSigninPage()
	{
		driver.get(signInURL);
	}
	public void clickTreedropdown()
	{
		dropdown.click();
		treelist.click();
	}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void getPage(String pageName)
	{
		String subPage;
		switch(pageName) {
		case "Overview of Trees": subPage="overview-of-trees/";
			driver.get(treeURL+subPage);
			break;
		case "Types of Trees":subPage="types-of-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Terminologies":subPage="terminologies/";
		driver.get(treeURL+subPage);
		break;
		case "Tree Traversals":subPage="binary-tree-traversals/";
		driver.get(treeURL+subPage);
		break;
		case "Traversals illustration":subPage="traversals-illustration/";
		driver.get(treeURL+subPage);
		break;
		case "Binary trees":subPage="binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Types of Binary trees":subPage="types-of-binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Implementation in Python":subPage="implementation-in-python/";
		driver.get(treeURL+subPage);
		break;
		case "Binary Tree Traversals":subPage="binary-tree-traversals/";
		driver.get(treeURL+subPage);
		break;
		case "Implementation of Binary Trees":subPage="implementation-of-binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Applications of Binary trees":subPage="applications-of-binary-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Binary Search Trees":subPage="binary-search-trees/";
		driver.get(treeURL+subPage);
		break;
		case "Implementation Of BST":subPage="implementation-of-bst/";
		driver.get(treeURL+subPage);
		break;
		case "Practice Questions":subPage="practice";
		driver.get(treeURL+subPage);
		break;



		}
	}
	public void clickPagelink(String pageName)
	{
		
		switch(pageName) {
		case "Overview of Trees": 
			overviewOfTreesLink.click();
			break;
		case "Types of Trees":
			typesoftreesLink.click();
		break;
		case "Terminologies":
			terminologiesLink.click();
		break;
		case "Traversals illustration":
			travIllustrationsLink.click();
		break;
		case "Tree Traversals":
			treetraversalsLink.click();
		break;
		case "Binary trees":
			binarytreesLink.click();
		break;
		case "Types of Binary trees":
			typesofBinaryTreesLink.click();
		break;
		case "Implementation in Python":
			implementationInPythonLink.click();
		break;
		case "Binary Tree Traversals":
			binaryTreeTraversalsLink.click();
		break;
		case "Implementation of Binary Trees":
			implementationOfBinaryTreesLink.click();
		break;
		case "Applications of Binary trees":
			applicationsOfBinaryTreesLink.click();
		break;
		case "Binary Search Trees":
			binarySearchTreesLink.click();
		break;
		case "Implementation Of BST":
			implementationBSTLink.click();
		break;
		case "Practice Questions":
		practiceQLink.click();
		break;
			

		}
	}
	public void clickTryHere()
	{
		tryhereBtn.click();
	}
	public void getEditorPage()
	{
		driver.get(editorPageURL);
	}
	public void enterPythonCode(String code) {
		
		editorbox.sendKeys(code);
		
	}
	public String getOutput()
	{
		String output = "";
		output =outputbox.getText();
		return output;
	}
	public void clickRun() {
		runbutton.click();
		
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
