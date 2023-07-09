package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.qa.utilities.ExcelUtility;

import dsutilities.ConfigReader;
import dsutilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignIn_Page;
import pageObjects.Tree_Page;

public class Tree_SD {
	private Tree_Page treepage = new Tree_Page();
	private SignIn_Page loginpage = new SignIn_Page();
	ExcelUtility excelreader = new ExcelUtility();
	String xlpath = ConfigReader.getexcelfilepath();
	@When("The user clicks the Tree item from drop down menu")
	public void the_user_clicks_the_tree_item_from_drop_down_menu() {
	   treepage.clickTreedropdown(); 
	}

	@Then("The user should be directed to Tree Data Structure Page")
	public void the_user_should_be_directed_to_tree_data_structure_page() {
		System.out.println("User is on :"+treepage.getPageTitle());
	}

	@Given("The user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
	    treepage.getTreePage();
	}

	@When("The user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
	    treepage.clickPagelink(string);
	    System.out.println("Clicked on page link----"+string);
		//treepage.getPage(string);
	}


	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {
		String title = treepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		LoggerLoad.info("Title of the page User is on "+title);
	}
	//@tag2_tree_04
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		treepage.getPage(string);
	}

	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
	    treepage.clickTryHere();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String title = treepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		LoggerLoad.info("Title of the page User is on "+title);
	}
	//@tag2_tree_05
	@Given("The user is in trees page having an tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
	    treepage.getEditorPage();
	}

	@When("The user gets input from sheet {string} and {int} in trees")
	public void the_user_gets_input_from_sheet_and_in_trees(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		String sheetnm = sheetname;
		Integer rowno= rownum;
		
		
		System.out.println("Sheet name is : "+sheetnm+" and rownumber is : "+rowno);
		List<Map<String,String>> pythonCodes =excelreader.getData(xlpath, sheetnm); 
		String code =pythonCodes.get(rownum).get("Pythoncode");
		
		treepage.enterPythonCode(code);
		
	    System.out.println("sheetname is :"+sheetname+" and python code  is : "+code);
	}

	@When("The user clicks on Run button after Entering valid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
	    treepage.clickRun();
	}

	@Then("The user should be presented with Run output for trees")
	public void the_user_should_be_presented_with_run_output_for_trees() {
		System.out.println(treepage.getOutput());
	}
	//@tag2_tree_06
	@When("The user clicks on Run button after Entering invalid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_trees_try_editor() {
		treepage.clickRun();
	}

	@Then("The user should get the error message for trees")
	public void the_user_should_get_the_error_message_for_trees() {
		String errormessage = treepage.getAlertText();
	    System.out.println("Error message is :"+errormessage);
	    treepage.acceptalert();
	}
	// @tag2_tree_08

	@Given("The user is on the Terminologies page after logged in")
	public void the_user_is_on_the_terminologies_page_after_logged_in() {
	    
	}
	@Given("The user is on the {string} page after logged in")
	public void the_user_is_on_the_page_after_logged_in(String string) {
	    
	}
	// @tag2_tree_59
	@When("The user clicks on the {string} in Overview of Trees")
	public void the_user_clicks_on_the_in_overview_of_trees(String string) {
	    treepage.clickPagelink(string);
	}

	@Then("The user should be redirected to {string} of tree page")
	public void the_user_should_be_redirected_to_of_tree_page(String string) {
		String title = treepage.getPageTitle();
		System.out.println("the user is on page :"+title);
		LoggerLoad.info("Title of the page User is on "+title);
	}
	
}
