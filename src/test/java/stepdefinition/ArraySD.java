package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Array;

public class ArraySD {
	
	Array arraypage = new Array();
	
	@Given("The user is in the Ninja home page after logged in")
	public void the_user_is_on_the_Ninja_home_page_after_logged_in() {
		arraypage.NinjaHomepage();
	}
	

	@When("The user clicks the {string} button in the Page introduction Panel")
	public void the_user_clicks_the_button_in_the_page_introduction_panel(String string) {
		arraypage.clickgetStarted();
	}

	@Then("The user be directed to {string} Data Structure Page")
	public void the_user_be_directed_to_data_structure_page(String string) {
		arraypage.verifypage();
	}

	@Given("The user is on the {string} after2 logged in")
	public void the_user_is_on_the_after2_logged_in(String string) {
		arraypage.Arrayhomepage();
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		arraypage.ArrayInPython();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		arraypage.verifypageArrayInPython();
	}
	@Given("The user is on the {string} after1 logged in")
	public void the_user_is_on_the_after1_logged_in(String string) {
		arraypage.ArrayInPythonPage();
	}

	@Given("The user is in array page having an tryEditor with a Run button to test")
	public void the_user_is_in_array_page_having_an_try_editor_with_a_run_button_to_test() {
	    arraypage.TryHerePage();
	}

  @When("The user clicks Arrays Using List link")
   public void the_user_clicks_arrays_using_list_link() {

	  arraypage.ArrayUsingLink();
   }

  @Then("The user should be redirected to Arrays Using List page")
  public void the_user_should_be_redirected_to_arrays_using_list_page() {
	  arraypage.ArrayUsingLinkPage();
  }

  @Given("The user is on the Arrays Using List after logged in")
  public void the_user_is_on_the_arrays_using_list_after_logged_in() {
	  arraypage.TryHerepageUsingLink();
  }
  
  @When("The user clicks Basic Operations in Lists link")
  public void the_user_clicks_basic_operations_in_lists_link() {
	  arraypage.ArrayBasicOperationInList();
  }

  @Then("The user should be redirected to Basic Operations in Lists page")
  public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
	  arraypage.ArrayBasicOperationInListPage();
  }

  @Given("The user is on the Basic Operations in Lists after logged in")
  public void the_user_is_on_the_basic_operations_in_lists_after_logged_in() {
	  arraypage.TryHerePageBasicOperations();

  }
  
  @When("The user clicks Applications of Array link")
  public void the_user_clicks_applications_of_array_link() {
      arraypage.ApplicationOfArray();
  }

  @Then("The user should be redirected to Applications of Array page")
  public void the_user_should_be_redirected_to_applications_of_array_page() {
     arraypage.ApplicationOfArrayPage();
  }

  @Given("The user is on the Applications of Array after logged in")
  public void the_user_is_on_the_applications_of_array_after_logged_in() {
      arraypage.TryHerePageApplicationOfArray();
  }

  @When("The user clicks Practice Questions link")
  public void the_user_clicks_practice_questions_link() {
      arraypage.PracticeQuestions();
  }

  @Then("The user should be redirected to Practice page")
  public void the_user_should_be_redirected_to_practice_page() {
      arraypage.PracticeQuestionsPage();
  }
  @Given("The user is on the Practice page after logged in")
  public void the_user_is_on_the_practice_page_after_logged_in() {
      arraypage.GoToPracticeQuestions();
  }

  @When("The user clicks the Search the array link")
  public void the_user_clicks_the_search_the_array_link() {
	  arraypage.SearchTheArray();
  }

  @Then("The user should be redirected to question page contains an tryEditor with Run and Submit buttons")
  public void the_user_should_be_redirected_to_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
      arraypage.SearchTheArrayPage();
  }
  
  @Given("The user is on Question page of Search the array after logged in")
  public void the_user_is_on_question_page_of_search_the_array_after_logged_in() {
      arraypage.QuestionsPage();
  }

  @When("The user enter valid python code in tryEditor from sheet {string} and {int} for the question")
  public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, Integer RowNumber) throws Exception {
     arraypage.TryEditor1(Sheetname, RowNumber);
  }
  
  @When("The user clicks on Submit button")
  public void the_user_clicks_on_submit_button() {
      arraypage.clickSubmitButton();
  }

  @Then("The user should be presented with successful submission message")
  public void the_user_should_be_presented_with_successful_submission_message() {
	  //arraypage.successmessage();
  }
  
  @When("The user enter invalid python code in tryEditor from sheet {string} and {int} for the question")
  public void the_user_enter_invalid_python_code_in_try_editor_from_sheet_and_for_the_question(String Sheetname, int RowNumber) throws Exception {
      //arraypage.invalidCode( Sheetname, RowNumber);
	  arraypage.TryEditor1(Sheetname, RowNumber);
  }
  @When("The user clicks the Max Consecutive Ones link")
  public void the_user_clicks_the_max_consecutive_ones_link() {
	  arraypage.maxConsecutiveLink();
  }
  
  @Given("The user is on Question page of Max Consecutive Ones after logged in")
  public void the_user_is_on_question_page_of_max_consecutive_ones_after_logged_in() {
      arraypage.TryEditorMaxConsecutiveLink();
  }
  @When("The user clicks the Find Numbers with Even Number of Digits link")
  public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
	  arraypage.FindNumbers();
  }
  @Given("The user is on Question page of Find Numbers with Even Number of Digits after logged in")
  public void the_user_is_on_question_page_of_find_numbers_with_even_number_of_digits_after_logged_in() {
	  arraypage.findNumbersPage();
  }
  @When("The user clicks the Squares of a Sorted Array link")
  public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	  arraypage.SortedArrayLink();
  }
  @Given("The user is on Question page of Squares of a Sorted Array after logged in")
  public void the_user_is_on_question_page_of_squares_of_a_sorted_array_after_logged_in() {
      arraypage.QuestionsSortedArrayLink();
  }  
}