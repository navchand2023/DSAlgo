package stepdefinition;

import org.testng.Assert;
import pageObjects.Home_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage_SD {
	  
	
	private Home_Page homepage;
	
	
	

	  @Given("The user opens DS Algo portal link")
	  public void the_user_opens_ds_algo_portal_link() {
		  homepage = new Home_Page();
		  homepage.getAppPage();
	  		  
	  }

	  @When("The user clicks the {string} button")
	  public void the_user_clicks_the_button(String string) {
	  	homepage.getStarted();   
	  }

	  @Then("The user should be redirected to homepage")
	  public void the_user_should_be_redirected_to_homepage() {
		  
		  String pagetitle = homepage.getPageTitle(); //driver.getTitle();
		  //System.out.println("Redirected to :"+pagetitle);
		  Assert.assertEquals(pagetitle.contains("NumpyNinja"), true);  
	  } 
	
	 
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
		
		homepage = new Home_Page();
		homepage.getHomePage();
	}

	@Given("not logged in")
	public void not_logged_in() {
		homepage.isLoggedIn();
	    
	}

	
	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() throws InterruptedException {
		homepage.goToSignIn();
		
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		
		  String pagetitle = homepage.getPageTitle(); 
		  System.out.println("Redirected to :"+pagetitle);
	}
	@When("The user clicks Register")
	public void the_user_clicks_register() throws InterruptedException {
		homepage.goToRegister();
		
	}

	@Then("The user should be redirected to Register page")
	public void the_user_should_be_redirected_to_register_page() {
		
		  String pagetitle = homepage.getPageTitle(); 
		  System.out.println("Redirected to :"+pagetitle);
		  Assert.assertEquals(pagetitle.contains("Registration"), true);
	}
	@When("The user clicks on Get Started link on Datastructures on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_datastructures_on_homepage_without_login() {
	    
		homepage.clickGetStarted("Datastructures");
	}

	@When("The user clicks on Get Started link on Arrays on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_arrays_on_homepage_without_login() {
	    
		homepage.clickGetStarted("Arrays");
	}

	@When("The user clicks on Get Started link on Linkedlist  on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_linkedlist_on_homepage_without_login() {
	    
		homepage.clickGetStarted("Linkedlist");
	}

	@When("The user clicks on Get Started link on Stack  on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_stack_on_homepage_without_login() {
		 
		homepage.clickGetStarted("Stack");
	}

	@When("The user clicks on Get Started link on Queue on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_queue_on_homepage_without_login() {
		
		homepage.clickGetStarted("Queue");
	}

	@When("The user clicks on Get Started link on Tree on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_tree_on_homepage_without_login() {
	    
		homepage.clickGetStarted("Tree");
	}

	@When("The user clicks on Get Started link on Graph on homepage  without login")
	public void the_user_clicks_on_get_started_link_on_graph_on_homepage_without_login() {
	    
		homepage.clickGetStarted("Graph");
	}
	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		
		String message =homepage.getWarningMessage();
		System.out.println(message);
	}
	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string)  {
	   
		homepage.clickdropdown(string);
	}
	@Then("The user get warning message2 {string}")
	public void the_user_get_warning_message2(String string) {
		
		String message =homepage.getWarningMessage();
		System.out.println(message);
	}


}
