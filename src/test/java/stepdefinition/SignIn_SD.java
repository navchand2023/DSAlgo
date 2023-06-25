package stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.qa.utilities.ExcelUtility;

import pageObjects.SignIn_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_SD {
	private  SignIn_Page loginpage;
	ExcelUtility excelreader = new ExcelUtility();
	String xlpath = System.getProperty("user.dir")+"/src/test/resources/TestData/LoginTestData4.xlsx";
	
	@Given("user opens sign_in page")
	public void user_opens_sign_in_page() {
		loginpage = new SignIn_Page();
	     loginpage.getSignInPage();
	}

	@Given("User is in sign-in page")
	public void user_is_in_sign_in_page() {
	     loginpage = new SignIn_Page();
	     loginpage.getSignInPage();
	     //loginpage.logout();//signs out if logged in
	}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		
	    loginpage.gotoRegnpage();
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
	    String title = loginpage.getPageTitle();
	    System.out.println("Redirected to :"+title);
		  Assert.assertEquals(title.contains("Registration"), true);
	}

	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
		loginpage = new SignIn_Page();//need to remove/improve
		loginpage.getSignInPage();
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String string, String string2) {
	    loginpage.signIn(string, string2);
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify() {
	    System.out.println(loginpage.getAlertMessage());
	}

	@When("The user enter sheet {string} and row{int}")
	public void the_user_enter_sheet_and(String sheetname, Integer rownum) throws InvalidFormatException, IOException {
		String sheetnm = sheetname;
		Integer rowno= rownum;
		
		
		System.out.println("Sheet name is : "+sheetnm+" and rownumber is : "+rowno);
		List<Map<String,String>> loginData =excelreader.getData(xlpath, sheetnm); 
		String username =loginData.get(rownum).get("Username");
		String password = loginData.get(rownum).get("Password");
		loginpage.signIn(username, password);
		
	    System.out.println("username is :"+username+" and password is : "+password);
	}
	@Then("click login button to get message")
	public void click_login_button_to_get_message() {
	    System.out.println(loginpage.getErrorMessage());
	}

	@Given("signed in")
	public void signed_in() {
		loginpage.signIn("numpy@108_1", "Welcome108");//testing
	    if(loginpage.isLoggedIn())
	    	System.out.println("The user is logged in");
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
	    loginpage.logout();
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		String title = loginpage.getPageTitle();
		
	    System.out.println("Redirected to :"+title);
		Assert.assertEquals(title.contains("NumpyNinja"), true);
	}

}
