package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Graph;

public class GraphSD {
	
	Graph graphobject = new Graph();
	
	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
		graphobject.SelectfromDropDown();
	}

	@Then("The user should be redirected to Graph page after logged in")
	public void the_user_should_be_redirected_to_graph_page_after_logged_in() {
		graphobject.UserOnPage();
	}

	@Given("The user is on the Graph Page after logged in")
	public void the_user_is_on_the_graph_page_after_logged_in() {
		graphobject.userongraphpage();
	}

	@When("The user clicks Graph link on Graph page")
	public void the_user_clicks_graph_link_on_graph_page() {
		graphobject.GraphLink();
	}

	@Then("The user should be redirected2 to Graph Graph page")
	public void the_user_should_be_redirected2_to_graph_graph_page() {
		graphobject.Graph2Page();
	}

	@Given("The user navigates to {string} Graph-Graph page")
	public void the_user_navigates_to_graph_graph_page(String graph) {
		graphobject.graphGraphPage(graph);
	}
	@When("The user clicks on Graph Representations link")
	public void the_user_clicks_on_graph_representations_link() {
		graphobject.graphRepresentation();
	}

	@Then("The user should be redirected to Graph Representations page")
	public void the_user_should_be_redirected_to_graph_representations_page() {
	    graphobject.graphRPage();
	}
    
	@Given("The user is in Graph Representations  page")
	public void the_user_is_on_the_graph_Represtations_page() {
		graphobject.graphRepresentationPage();
	}
	@When("The user clicks on Practice Questions in graph representations page")
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
		graphobject.practiceQuestion();
	}

	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
		graphobject.practiceQuestionpage();
	}

	
 
	
	

}
