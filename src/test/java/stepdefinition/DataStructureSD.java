package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructure;


public class DataStructureSD {
	
	DataStructure datastructure = new DataStructure();	
	
	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String string, String string2) {
		datastructure.Credentials();
	}

	@Then("The user click on login button")
	public void the_user_click_on_login_button() {
	    datastructure.Login();
	}
	@Given("The user is on the Ninja home page after logged in")
	public void the_user_is_on_the_after_logged_in() {
	    datastructure.Datastructurehomepage();
	}
	

	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
        datastructure.DSGetstarted();
     
	}

	@Then("The user should be redirected to {string} after logged in")
	public void the_user_is_on_the_after2_logged_in(String string) {
		datastructure.verifyDSpage();
	}
	//
	@Given("The user is on the Data Structures Introduction after logged in")
	public void the_user_is_on_the_data_structures_introduction_after_logged_in() {
		datastructure.Datastructurehomepage(); 
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		datastructure.CilckTimeComplex();
		
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		datastructure.verifyTCpage();
	}
	
	@Given("The user is on the {string} after3 logged in")
	public void the_user_is_on_the_after3_logged_in(String string) {
	    datastructure.TimeComplexityPage();
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
	   datastructure.TryHerebutton();
	}

	@Then("The user should be redirected to Try Here page")
	public void the_user_should_be_redirected_to_try_here_page() {
		datastructure.verifyTHpage();
	}

	@Given("The user is in a page having an tryEditor with a Run button to test")
	 public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
		datastructure.TryHerepage();
	}

	@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws Exception {
		datastructure.enterPythonCode(Sheetname, RowNumber);
	}

	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
		datastructure.RunButton();

	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
	    datastructure.getOutput();
	}

	@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
	public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws Exception {
		datastructure.enterPythonCode(Sheetname, RowNumber);
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	    datastructure.Errormessage();
	}

	
	
}