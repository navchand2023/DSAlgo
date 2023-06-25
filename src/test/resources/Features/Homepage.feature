
@tag @TS_002
Feature: User launch home page of an dsalgo project

  @tag1
  Scenario: User launch home page of an dsalgo project
    Given The user opens DS Algo portal link	   
    When The user clicks the "Get Started" button    
    Then The user should be redirected to homepage
  Scenario: User is on Home page and click on sign in
    Given The user opens Home Page
    And not logged in
    When The user clicks Sign in
    Then The user should be redirected to Sign in page
    Scenario: User is on Home page and click on Register
    Given The user opens Home Page
    And not logged in
    When The user clicks Register
    Then The user should be redirected to Register page    
  	Scenario: User is on Home page and click getstarted link on  home page without sign in
    Given The user opens Home Page
    And not logged in
    When The user clicks on Get Started link on Datastructures on homepage  without login
    Then The user get warning message "You are not logged in"
    When The user clicks on Get Started link on Arrays on homepage  without login
    Then The user get warning message "You are not logged in"
    When The user clicks on Get Started link on Linkedlist  on homepage  without login
    Then The user get warning message "You are not logged in"
    When The user clicks on Get Started link on Stack  on homepage  without login
    Then The user get warning message "You are not logged in" 
    When The user clicks on Get Started link on Queue on homepage  without login
    Then The user get warning message "You are not logged in"
    When The user clicks on Get Started link on Tree on homepage  without login
    Then The user get warning message "You are not logged in"
    When The user clicks on Get Started link on Graph on homepage  without login
    Then The user get warning message "You are not logged in"  
    Scenario Outline: User is on Home page and click on dropdown without sign in
    Given The user opens Home Page
    And not logged in
    When  The user clicks on dropdown "<option>" without login
    Then The user get warning message2 "You are not logged in"
     Examples: 
      | option         |
      | Arrays         |
      | Linked List     |
      | Stack          |
      | Queue          |
      | Tree           |
      | Graph          |           
      