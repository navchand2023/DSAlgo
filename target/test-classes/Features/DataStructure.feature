#Author: your.email@your.domain.com
@tag
Feature: DataStructures
  I want to use this template for my feature file

Scenario: The user is logged in to DS Algo portal
  	Given The user is on Signin page of DS Algo portal
  	When The user enter valid "numpy@108_1" and "Welcome108" and login  	
  	Then The user is redirected to homepage

  @tag1
  Scenario: The user is able to navigate to Data Structure introduction page
    Given The user is on the Ninja home page after logged in
    When The user clicks the "Getting Started" button in Data Structure Page introduction Panel
    Then The user should be redirected to "home page" after logged in
    

  @tag2
  Scenario: The user is able to navigate to Time Complexity page
    Given The user is on the Data Structures Introduction after logged in
    When The user clicks Time Complexity link
    Then The user should be redirected to "Time Complexity" page
    
    @tag3
  Scenario: The user is able to navigate to a page having an tryEditor from Time Complexity page
    Given The user is on the "Time Complexity" after3 logged in
    When The user clicks "Try Here" button on "Time Complexity" page
    Then The user should be redirected to Try Here page
    
    @tag4
  Scenario Outline: The user is able run code in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
     Examples: 
      | Sheetname | RowNumber |
      |PythonCode |         0 |
    
    @tag5
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Time Complexity page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then  The user should be presented with error message
    
    
    Examples: 
      | Sheetname  | RowNumber |
      |PythonCode  |         1 |
    

