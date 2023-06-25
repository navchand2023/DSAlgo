package stepdefinition;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;

public class LinkedListPage_SD {
	
	//private LinkedListPage linkedListPage = new LinkedListPage(DriverFactory.getDriver());
	private LinkedListPage linkedListPage = new LinkedListPage(DriverFactory.getdriver());
	@Given("The user is on Signin page of the DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		linkedListPage.signInLink();
	}

	@When("The user enters valid {string} and {string}")
	public void the_user_enter_valid_and(String userName, String password) {
		linkedListPage.signInDetailsRegUser(userName, password);
	}

	@When("The user clicks on login button")
	public void the_user_click_on_login_button() {
		linkedListPage.loginBtnClickRegUser();
	}
	
	@Then("The user redirected to the homepage")
	public void the_user_redirected_to_the_homepage() {
		System.out.println(linkedListPage.getPageTitle());
	}



	
	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		
	}

	@When("The user selecting {string} item from the drop down menu")
	public void the_user_selecting_item_from_the_drop_down_menu(String linkedList) {
		linkedListPage.dsDropdownforLinkedList(linkedList);
	}

	@Given("The user is in the Linked List  page after logged in")
	public void the_user_is_in_the_linked_list_page_after_logged_in() {
		linkedListPage.redirectLinkedListPage();
	}

	@When("The user clicks Introduction {string} link")
	public void the_user_clicks_introduction_link(String string) {
		linkedListPage.linkedListIntro();
	}

	@Then("The user should be directed to {string} of Linked List Page")
	public void the_user_should_be_directed_to_of_linked_list_page(String string) {
		  
	}

//	@Given("The user is on the {string} after logged in")
//	public void the_user_is_on_the_after_logged_in(String string) {
//	    
//	}

	@When("The user clicks {string} button in the {string} page")
	public void the_user_clicks_button_in_the_page(String string, String string2) {
	    linkedListPage.tryhereClick();
	}

//	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
//	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
//	    
//	}

	@Given("The user is in a try here page having  tryEditor with a Run button to test")
	public void the_user_is_in_a_try_here_page_having_try_editor_with_a_run_button_to_test() {
	   
	}

	@When("The user Enter valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		linkedListPage.readDatafromExcel(sheetName, rowNumber);
	}

	@When("user click on Run button")
	public void user_click_on_run_button() {
	    linkedListPage.runBtnClick();
	}

	@Then("The user should be presented with the Run output")
	public void the_user_should_be_presented_with_the_run_output() {
		
	}

	@When("The user Enter invalid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		linkedListPage.readDatafromExcel(sheetName, rowNumber);
	}

	@Then("The user should be presented with the Run output with popup")
	public void the_user_should_be_presented_with_the_run_output_with_popup() {
		linkedListPage.popUpClick();
	}
	
	@When("The user clicks the creating Linked list {string} button")
	public void the_user_clicks_the_creating_linked_list_button(String string) {
		linkedListPage.creatingLLClick();
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String dsDropdown) {
		System.out.println("In SD Option passed in Dropdown: " +dsDropdown);
	}

//	@When("The user Enter valid python code in tryEditor from sheet pythonCode and {int}")
//	public void the_user_enter_valid_python_code_in_try_editor_from_sheet_python_code_and(Integer int1) {
//	    
//	}
	
	@Given("The user is in the option {string} in {string} page having tryEditor with a Run button to test for Invalid syntax")
	public void the_user_is_in_the_option_in_page_having_try_editor_with_a_run_button_to_test_for_invalid_syntax(String pageName, String dsName) {
		linkedListPage.navigateTo(pageName, dsName);
		//linkedListPage.tryhereClick();
	}

	@When("The user clicks the Types of Linked List {string} button")
	public void the_user_clicks_the_types_of_linked_list_button(String string) {
		linkedListPage.llTypesClick();
	}

	@When("The user clicks the Implement {string} button")
	public void the_user_clicks_the_implement_button(String string) {
		linkedListPage.implementLLClick();
	}

	@When("The user clicks the Traversal {string} button")
	public void the_user_clicks_the_traversal_button(String string) {
		linkedListPage.traversalLLClick();
	}

	@When("The user clicks the Insertion {string} button")
	public void the_user_clicks_the_insertion_button(String string) {
		linkedListPage.insertionLLClick();
	}

	@When("The user clicks the deletion {string} button")
	public void the_user_clicks_the_deletion_button(String string) {
		linkedListPage.deletionLLClick();
	}

	@When("The user clicks on the Practice Questions")
	public void the_user_clicks_on_the_practice_questions() {
		linkedListPage.practiceLLClick();
	}

	@Then("The user should be directed to Practice Questions of Linked List Page")
	public void the_user_should_be_directed_to_practice_questions_of_linked_list_page() {
	    
	}
}




