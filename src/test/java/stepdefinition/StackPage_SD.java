package stepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;
import pageObjects.StackPage;

public class StackPage_SD {
	
	private StackPage stackPage = new StackPage(DriverFactory.getdriver());
	private LinkedListPage linkedListPage = new LinkedListPage(DriverFactory.getdriver());
	
	@When("The user select {string} item from the drop down menu")
	public void the_user_select_item_from_the_drop_down_menu(String Stack) {
	    stackPage.dsDropdownforStack(Stack);
	}
	
	@Given("The user is on the Stack page after logged in")
	public void the_user_is_on_the_stack_page_after_logged_in() {
		stackPage.redirectStackPage();
	}

	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		stackPage.opInStackClick();
	}

//	@Then("The user should then be directed to {string} Page")
//	public void the_user_should_then_be_directed_to_page(String string) {
//	   
//	}
	
	@When("The user clicks {string} button1 in {string} page")
	public void the_user_clicks_button_in_page(String tryhere, String string2) {
		stackPage.tryhereClick();
	}
	
	@Given("The user is in the Stack page after having an tryEditor with a Run button to test")
	public void the_user_is_in_the_stack_page_after_having_an_try_editor_with_a_run_button_to_test() {
	   
	}

	@When("The user gets input from sheet {string} and {int}")
	public void the_user_gets_input_from_sheet_and(String sheetName, Integer rowNumber) throws Exception {
		stackPage.enterPythonCode(sheetName, rowNumber);
	}


	@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		stackPage.runBtnClick();
	}
	
	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
	   //linkedListPage.popUpClick();//checking...
	}
	//new
	@Then("The user should be presented with the Run output with popup1")
	public void the_user_should_be_presented_with_the_run_output_with_popup1() {
		linkedListPage.popUpClick();
	}

	@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
		stackPage.runBtnClick();
	}

	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		stackPage.implementBtnClick();
	}

	@Then("The user should then be directed to Implementation Page")
	public void the_user_should_then_be_directed_to_implementation_page() {
	    
	}
	
	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		stackPage.applicationsBtnClick();
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
	    
	}
	
	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		stackPage.practiceBtnClick();
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
	    
	}
	@Given("The user is in the option operations-in-stack in {string} page having tryEditor with a Run button to test for Invalid syntax")
	public void the_user_is_in_the_option_operations_in_stack_in_page_having_try_editor_with_a_run_button_to_test_for_invalid_syntax(String string) {
	    stackPage.goToEditorpage();
	}

	@Given("The user is in the option implementation in Stack page having tryEditor with a Run button to test for Invalid syntax")
	public void the_user_is_in_the_option_implementation_in_stack_page_having_try_editor_with_a_run_button_to_test_for_invalid_syntax() {
		stackPage.goToEditorpage();
	}

	@Given("The user is in the option stack-applications in Stack page having tryEditor with a Run button to test for Invalid syntax")
	public void the_user_is_in_the_option_stack_applications_in_stack_page_having_try_editor_with_a_run_button_to_test_for_invalid_syntax() {
		stackPage.goToEditorpage();
	}
}
