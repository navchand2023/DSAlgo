package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageObjects.Register_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD {

	private Register_Page regnpage;
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
	    

		regnpage = new Register_Page();
		regnpage.getRegisterPage();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {

	    regnpage.register("", "", "");
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
		String alert= "";
//		System.out.println("alert message :"+alert);
	    alert= regnpage.getAlertMessage("UserName");
	    System.out.println("alert message :"+alert);//need to replace with assert statements....
	}

	@When("The user clicks {string} button with password and repeat password fields empty")
	public void the_user_clicks_button_with_password_and_repeat_password_fields_empty(String string) {

		
		regnpage.register("numpy@1080", "", "");
		
	}

	@Then("It should display an error {string} below password textbox")
	public void it_should_display_an_error_below_password_textbox(String string) {
		String alert= "";
		
		alert= regnpage.getAlertMessage("Password");
	    System.out.println("alert message :"+alert);
	}

	@When("The user clicks {string} button with repeat password empty")
	public void the_user_clicks_button_with_repeat_password_empty(String string) {

		regnpage.register("numpy@1080", "Welcome108", "");
	    
	}

	@Then("It should display an error {string} below repeat password textbox")
	public void it_should_display_an_error_below_repeat_password_textbox(String string) {
		String alert= "";
		
		alert= regnpage.getAlertMessage("rptPassword");
	    System.out.println("alert message :"+alert);
	    
	}

	@When("The user clicks {string} button with  username with characters other than Letters, digits and @\\/.\\/+\\/-\\/_")
	public void the_user_clicks_button_with_username_with_characters_other_than_letters_digits_and(String string) {

		regnpage.register("@#$678&&&&", "Welcome108", "Welcome108");
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
	    
	}

	@When("The user enters a valid existing username with password and password confirmation")
	public void the_user_enters_a_valid_existing_username_with_password_and_password_confirmation() {
		
		regnpage.register("numpy@108_1", "Welcome108", "Welcome108");
	}

	@When("The user clicks {string} button after entering valid username and different passwords in password and password confirmation fields")
	public void the_user_clicks_button_after_entering_valid_username_and_different_passwords_in_password_and_password_confirmation_fields(String string) {
	    
		regnpage.register("numpy@108_2", "Welcome108", "Welcome18");
	}

	@Then("It should display an error message password_mismatch:The two password fields didn’t match.")
	public void it_should_display_an_error_message_password_mismatch_the_two_password_fields_didn_t_match() {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
	}

	@When("The user clicks {string} button after entering valid username  password with characters less than {int}")
	public void the_user_clicks_button_after_entering_valid_username_password_with_characters_less_than(String string, Integer int1) {
		regnpage.register("numpy@108_2", "Welc108", "Welc108");
	    
	}

	@Then("It should display an error message Password should contain at least {int} characters")
	public void it_should_display_an_error_message_password_should_contain_at_least_characters(Integer int1) {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
	    
	}

	@When("The user clicks {string} button after entering valid username  password with only numbers")
	public void the_user_clicks_button_after_entering_valid_username_password_with_only_numbers(String string) {
		regnpage.register("numpy@108_2", "12345678", "12345678");
	    
	}

	@Then("It should display an error message Password can’t be entirely numeric.")
	public void it_should_display_an_error_message_password_can_t_be_entirely_numeric() {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
	    
	}

	@When("The user clicks {string} button after entering valid username  password similar to username")
	public void the_user_clicks_button_after_entering_valid_username_password_similar_to_username(String string) {
		regnpage.register("numpy@108_2", "numpy108_2", "numpy108_2");
	    
	}

	@Then("It should display an error message password can’t be too similar to your other personal information.")
	public void it_should_display_an_error_message_password_can_t_be_too_similar_to_your_other_personal_information() {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
	    
	}

	@When("The user clicks {string} button after entering valid username  and commonly used password")
	public void the_user_clicks_button_after_entering_valid_username_and_commonly_used_password(String string) {
		regnpage.register("numpy@108_2", "abcdefgh", "abcdefgh");
	    
	}

	@Then("It should display an error message Password can’t be commonly used password")
	public void it_should_display_an_error_message_password_can_t_be_commonly_used_password() {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
	    
	}

	@When("The user clicks {string} button after entering valid username  valid password and repeat password")
	public void the_user_clicks_button_after_entering_valid_username_valid_password_and_repeat_password(String string) {
		regnpage.register("numpy@108_4", "Welcome108", "Welcome108");
	    
	}

	@Then("The user should be redirected to Homepage with the message New Account Created. You are logged in as <username>")
	public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created_you_are_logged_in_as_username() {
		String alert= "";		
		alert=regnpage.getErrorMessage();
		System.out.println("Error message :"+alert);
		//Assert.assertTrue(alert.contains("New"));
	    //New Account Created. You are logged in as numpy@108_2
	}

}
