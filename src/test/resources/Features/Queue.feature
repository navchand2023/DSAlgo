# Queue Page
@tag
Feature: The user is using on Queue page

  Scenario: The user is logged in to DS Algo portal
  	Given The user is on Signin page of DS Algo portal
  	When The user enter valid "numpy@108_1" and "Welcome108" and login  	
  	Then The user is redirected to homepage
  @tag1_queue_01	
  Scenario: The user is able to navigate to Queue Data Structure Page
    Given The user is in the Home page     
    When The user clicks the Queue item from drop down menu
    Then The user should be directed to Queue Data Structure Page
    @tag1_queue_02
    Scenario: The user is able to navigate to Implementation of Queue in Python link page
    Given The user is in Queue Page    
    When The user clicks on Implementation of queue  in Python link
    Then The user should be directed to Implementation of queue  in Python Page
    @tag1_queue_03
    Scenario: The user should be directed to editor page with run button to test python code
    Given The user is in Implementation of queue  in Python Page
    When The user clicks on Try here link
    Then The user navigates to Editor page with Run button
    @tag1_queue_04
    Scenario: The user is able to run code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters valid python code in Editor <pythoncode>
    |q=[10,100,1000,10000]\nprint("Initial Queue is:",q)\nprint(q.pop(0))\nprint("After Removing elements:",q)|     
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked
    @tag1_queue_05
    Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation of queue page
    Given The user is in a page having an Editor with a Run Button to Test
    When The user enters invalid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 1				 |
    @tag1_queue_06
    Scenario: The user is able to navigate to queue page and click on Implementation using collections deque link
    Given The user is in Editor Page and navigates to Queue Page
    When The user clicks on Implementation using collections deque link    
    Then The user should be redirected to Implementation using collections deque page
    
    @tag1_queue_07
    Scenario: The user should be directed to editor page with run button to test python code from Implementation using collections page
    Given The user in implementation using collections page    
    When The user clicks on Try here link   
    Then The user navigates to Editor page with Run button
    
    @tag1_queue_08
    Scenario Outline: The user is able to run code in Editor for Implementation using collections page
    Given The user is in a page having an Editor with a Run Button to Test   
    When The user enters valid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 0				 |
    @tag1_queue_09
    Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using collections page
    Given The user is in a page having an Editor with a Run Button to Test   
    When The user enters invalid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 1				 |
    
    @tag1_queue_10
    Scenario: The user is able to navigate to queue page and click on Implementation using array link
    Given The user is in Editor Page and navigates to Queue Page   
    When The user clicks on Implementation using array link  
    Then The user should be redirected to Implementation using array page
    
    @tag1_queue_11
    Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
    Given The user in Implementation using array page  
    When The user clicks on Tryhere link  
    Then The user navigates to Editor page with Run button
    
    @tag1_queue_12
    Scenario Outline: The user is able to run code in Editor for Implementation using array page
    Given The user is in a page having an Editor with a Run Button to Test   
    When The user enters valid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 0				 |
    
    @tag1_queue_13
    Scenario Outline: The user is presented with error message for invalid code in Editor for Implementation using array page
    Given The user is in a page having an Editor with a Run Button to Test   
    When The user enters invalid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 1				 |
    
    @tag1_queue_14
    Scenario: The user is able to navigate to queue page and click on Queue Operations link
    Given The user is in Editor Page and navigates to Queue Page 
    When The user clicks on Queue Operations  link 
    Then The user should be redirected to Queue Operations page
    
    @tag1_queue_15
    Scenario: The user should be directed to editor page with run button to test python code from Implementation using array page
    Given The user in Queue Operations page 
    When The user clicks on Tryhere link  
    Then The user navigates to Editor page with Run button
@tag1_queue_16
    Scenario Outline: The user is able to run code in Editor for Queue Operations page
    Given The user is in a page having an Editor with a Run Button to Test   
    When The user enters valid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user is presented with the result after Run Button is clicked
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 0				 |
    
    @tag1_queue_17
    Scenario Outline: The user is presented with error message for invalid code in Editor
    Given The user is in a page having an Editor with a Run Button to Test   
    When The user enters invalid python code in Editor  from sheet "<Sheetname>" and <RowNumber>
    And clicks Run Button
    Then The user gets an Error Message
    Examples:
    | Sheetname  | RowNumber |
    |PythonCode  | 1				 |
    
    @tag1_queue_18
    Scenario: The user is able to navigate to QueueOp page and click on Practice Questions
    Given The user is in Editor page and navigates to QueueOp page
    When The user clicks on Practice Questions    
    Then The user is directed to Practice page