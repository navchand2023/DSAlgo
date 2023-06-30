
@tag @TS_004
Feature: User signing in

  @tag1
  Scenario: Verify register link
  Given user opens sign_in page
    #Given User is in sign-in page
    #And not logged in
   When The user clicks on register link on signin page    
   #Then The user redirected to Registration page from signin page 
    
   @tag2 
    Scenario Outline: User on login page and login with invalid inputs
    Given  The user is on signin page
    When  The user enter invalid "<username>" and "<password>"    
    Then click login button to verify
     Examples: 
      | username | password |
      | user     |          |
      |          | passowrd |
      |          |          |
        

  @tag3
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel
    Given The user is on signin page
    When The user enter sheet "<Sheetname>" and row<RowNumber>
    Then click login button to get message

    Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
      
    Scenario:  Verifying signout link
    Given The user is on signin page
    And signed in
    When The user clicks "Sign out"     
    Then The user redirected to homepage
    
