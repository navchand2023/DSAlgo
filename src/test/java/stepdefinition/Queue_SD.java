package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.qa.utilities.ExcelUtility;

import dsutilities.ConfigReader;
import dsutilities.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Queue_Page;
import pageObjects.SignIn_Page;

public class Queue_SD {
	private Queue_Page queuepage = new Queue_Page();
	private SignIn_Page loginpage = new SignIn_Page();
	ExcelUtility excelreader = new ExcelUtility();
	String xlpath = ConfigReader.getexcelfilepath();
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
	    queuepage.getSigninPage();
	}

 
	@When("The user enter valid {string} and {string} and login")
	public void the_user_enter_valid_and_and_login(String string, String string2) {
		loginpage.signIn(string, string2);
	}
	
	@Then("The user is redirected to homepage")
	public void the_user_is_redirected_to_homepage() {
	    
	}


	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
		queuepage.getHomePage();
	    
	}

	@When("The user clicks the Queue item from drop down menu")
	public void the_user_clicks_the_queue_item_from_drop_down_menu() {
	   queuepage.clickQueuedropdown(); 
	}

	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
	    System.out.println("User is on :"+queuepage.getPageTitle());
	}

	@Given("The user is in Queue Page")
	public void the_user_is_in_queue_page() {
		queuepage = new Queue_Page();
	     queuepage.getQueuePage();
	    
	}

	@When("The user clicks on Implementation of queue  in Python link")
	public void the_user_clicks_on_implementation_of_queue_in_python_link() {
	  queuepage.clickPythonLink();  
	}

	@Then("The user should be directed to Implementation of queue  in Python Page")
	public void the_user_should_be_directed_to_implementation_of_queue_in_python_page() {
	    
	}

	@Given("The user is in Implementation of queue  in Python Page")
	public void the_user_is_in_implementation_of_queue_in_python_page() {
	   queuepage.getImplimentationListsPage(); 
	   Loggerload.info("Title of the page User is on "+queuepage.getPageTitle());
	   System.out.println("The user is on !!@@^^&&"+queuepage.getPageTitle());
	}

	@When("The user clicks on Try here link")
	public void the_user_clicks_on_try_here_link() {
		//queuepage.getImplimentationListsPage(); //...
		queuepage.clickTryHere();//...
	}

	@Then("The user navigates to Editor page with Run button")
	public void the_user_navigates_to_editor_page_with_run_button() {
		String title = queuepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		Loggerload.info("Title of the page User is on "+title);
	}
	//scenario
	
	@Given("The user is in a page having an Editor with a Run Button to Test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
	    queuepage.getEditorPage();
	}

	@When("The user enters valid python code in Editor <pythoncode>")
	public void the_user_enters_valid_python_code_in_editor_pythoncode(io.cucumber.datatable.DataTable dataTable) {
		//queuepage.getEditorPage();//
	    String code = dataTable.cell(0, 0).toString();
	    System.out.println("The code is !!!!!" +code);
	    queuepage.enterPythonCode(code);
	}


	@When("clicks Run Button")
	public void clicks_run_button() {
	    queuepage.clickRun();
	}

	@Then("The user is presented with the result after Run Button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
	    System.out.println(queuepage.getOutput());
	}
	

	@When("The user enters invalid python code in Editor  from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		String sheetnm = sheetname;
		Integer rowno= rownum;
		
		
		System.out.println("Sheet name is : "+sheetnm+" and rownumber is : "+rowno);
		List<Map<String,String>> pythonCodes =excelreader.getData(xlpath, sheetnm); 
		String code =pythonCodes.get(rownum).get("Pythoncode");
		
		queuepage.enterPythonCode(code);
		
	    System.out.println("sheetname is :"+sheetname+" and python code  is : "+code);
	}

	@Then("The user gets an Error Message")
	public void the_user_gets_an_error_message() {
		
		String errormessage = queuepage.getAlertText();
	    System.out.println("Error message is :"+errormessage);
	    queuepage.acceptalert();
	}
	//@tag1_queue_06
	@Given("The user is in Editor Page and navigates to Queue Page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_page() {
	    queuepage.getQueuePage();
	}

	@When("The user clicks on Implementation using collections deque link")
	public void the_user_clicks_on_implementation_using_collections_deque_link() {
	    queuepage.clickDequeueLink();
	}

	@Then("The user should be redirected to Implementation using collections deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		System.out.println("The user is on :::::"+queuepage.getPageTitle());
	}
	//@tag1_queue_07
	@Given("The user in implementation using collections page")
	public void the_user_in_implementation_using_collections_page() {
	    queuepage.getdeQueuePage();
	}
	//@tag1_queue_08
	@When("The user enters valid python code in Editor  from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		String sheetnm = sheetname;
		Integer rowno= rownum;
		
		
		System.out.println("Sheet name is : "+sheetnm+" and rownumber is : "+rowno);
		List<Map<String,String>> pythonCodes =excelreader.getData(xlpath, sheetnm); 
		String code =pythonCodes.get(rownum).get("Pythoncode");
		
		queuepage.enterPythonCode(code);
		
	    //System.out.println("sheetname is :"+sheetname+" and python code  is : "+code);
	}
	//@tag1_queue_10
	@When("The user clicks on Implementation using array link")
	public void the_user_clicks_on_implementation_using_array_link() {
	    queuepage.clickImpArrayLink();
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		String title = queuepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		Loggerload.info("Title of the page User is on "+title);
	}
	//@tag1_queue_11
	@Given("The user in Implementation using array page")
	public void the_user_in_implementation_using_array_page() {
		queuepage.getImpArrayPage(); 
		Loggerload.info("Title of the page User is on "+queuepage.getPageTitle());
		System.out.println("The user is on "+queuepage.getPageTitle());
	}

	@When("The user clicks on Tryhere link")
	public void the_user_clicks_on_tryhere_link() {
		queuepage.clickTryHere();
	}
	//@tag1_queue_14
	@When("The user clicks on Queue Operations  link")
	public void the_user_clicks_on_queue_operations_link() {
	    queuepage.clickQueueOpLink();
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		String title = queuepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		Loggerload.info("Title of the page User is on "+title);
	}
	//@tag1_queue_15
	@Given("The user in Queue Operations page")
	public void the_user_in_queue_operations_page() {
	    queuepage.getQueueOpPage();
	}
	//@tag1_queue_16
	
	//@tag1_queue_17
	
	//@tag1_queue_18
	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
	    queuepage.getQueueOpPage();
	}

	@When("The user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
		queuepage.clickPracticeQLink();	    
	}

	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		String title = queuepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		Loggerload.info("Title of the page User is on "+title);  
	}


}
