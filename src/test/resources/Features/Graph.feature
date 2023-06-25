#Author: your.email@your.domain.com
@tag
Feature: Graph
  I want to use this template for my feature file
  
 Scenario: The user is logged in to DS Algo portal
  	Given The user is on Signin page of DS Algo portal
  	When The user enter valid "numpy@108_1" and "Welcome108" and login  	
  	Then The user is redirected to homepage

  @tag1
  Scenario: The user is able to navigate to Graph Data Structure page
    Given The user is on the Ninja home page after logged in
    When The user clicks the graph item from the drop down menu
    Then The user should be redirected to Graph page after logged in
    

  @tag2
  Scenario: The user is able to navigate to Graph page 
    Given The user is on the Graph Page after logged in
    When The user clicks Graph link on Graph page
    Then The user should be redirected2 to Graph Graph page

   @tag3
   Scenario: The user should be directed to editor page with run button to test python code
   Given The user navigates to "Graph" Graph-Graph page
   When The user clicks "Try Here" button on "Graph-Graph" page
   Then The user should be redirected to Try Here page
   
   @tag4
   Scenario Outline: The user is able to run code in Editor for Graph page
   Given The user is in a page having an tryEditor with a Run button to test
   When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      |PythonCode  |         0 |
      
   @tag5
   Scenario Outline: The user is presented with error message for invalid code in Editor for Graph page
   Given The user is in a page having an tryEditor with a Run button to test
   When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
   And The user clicks on run button
   Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      |PythonCode  |         1 |
      
    
      
      @tag7
      Scenario Outline: The user is able to navigate to graph page and click on Graph Representations link
      Given The user is on the Graph Page after logged in
      When The user clicks on Graph Representations link
      Then The user should be redirected to Graph Representations page
      
      @tag8
      Scenario: The user should be directed to editor page with run button to test python code from Graph Representations page
      Given The user is in Graph Representations  page
      When The user clicks "Try Here" button on "Graph-GraphRepresentation" page
      Then The user should be redirected to Try Here page
      
      @tag9
      Scenario Outline: The user is able to run code in Editor for Graph Representations page
      Given The user is in a page having an tryEditor with a Run button to test
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
      And The user clicks on run button
      Then The user should be presented with Run result
   
    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      @tag10
      Scenario Outline:The user is presented with error message for invalid code in Editor for Graph Representations page
      Given The user is in a page having an tryEditor with a Run button to test
      When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
      And The user clicks on run button
      Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
      
      @tag11
      Scenario: The user is able to navigate to graph representations page and click on Practice Questions
      Given The user is in Graph Representations  page
      When The user clicks on Practice Questions in graph representations page
      Then The user is directed to graph Practice page
      
      
      
      
      
      
      
      
      
      
   
