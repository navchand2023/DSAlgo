
Feature: Use Array Data structure
#Background: The user is logged in to DS Algo portal
  #Given The user is on the Sign in page
  #When The user enter valid "Ninja_Hawks3" and "SDET@110"
  #Then The user click on login button

  @tag1
  Scenario: The user is able to navigate to "ARRAY" Data Structure Page
    Given The user is in the Ninja home page after logged in
    When The user clicks the "Getting Started" button in the Page introduction Panel
    Then The user be directed to "ARRAY" Data Structure Page

  @tag2
  Scenario: The user is able to navigate to arrays in Python page
    Given The user is on the "Array home page" after2 logged in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to Arrays in Python page 
    
    @tag3
    Scenario: The user is able to navigate to a page having an tryEditor from Arrays in Python page
    Given The user is on the "Arrays in Python page" after1 logged in
    When The user clicks "Try Here" button on "Arrays in Python" page
    Then The user should be redirected to Try Here page
    
    @tag4
    Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
     Examples: 
      | Sheetname  | RowNumber |
      |PythonCode |         0 |

    
    @tag5
    Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
    
     Examples: 
      | Sheetname  | RowNumber |
      |PythonCode |         1 |
    
    @tag6
    Scenario: The user is able to navigate to Arrays Using List page
    Given The user is on the "Array home page" after2 logged in
    When The user clicks Arrays Using List link
    Then The user should be redirected to Arrays Using List page
    
    @tag7
    Scenario: The user is able to navigate to a page having an tryEditor from Arrays Using List page
    Given The user is on the Arrays Using List after logged in
    When The user clicks "Try Here" button on "Arrays Using List" page
    Then The user should be redirected to Try Here page
    
    @tag8
    Scenario Outline: The user is able run code in tryEditor for Arrays Using List page
    Given The user is in array page having an tryEditor with a Run button to test
    When   The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
     Examples: 
      | Sheetname  | RowNumber |
      |PythonCode |         0 |
    
    @tag9
    Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays Using List page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
    
     Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
    
    @tag10
    Scenario: The user is able to navigate to Basic Operations in Lists page
    Given The user is on the "Array home page" after2 logged in
    When The user clicks Basic Operations in Lists link
    Then The user should be redirected to Basic Operations in Lists page
    
    @tag11
    Scenario: The user is able to navigate to a page having an tryEditor from Basic Operations in Lists page
    Given The user is on the Basic Operations in Lists after logged in
    When The user clicks "Try Here" button on "Basic Operations in Lists" page
    Then The user should be redirected to Try Here page
    
    @tag12
    Scenario Outline: The user is able run code in tryEditor for Basic Operations in Lists page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
     Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
    
    @tag13
    Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Basic Operations in Lists page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
    
     Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
    
    @tag14
    Scenario: The user is able to navigate to Applications of Array page
    Given The user is on the "Array home page" after2 logged in
    When The user clicks Applications of Array link
    Then The user should be redirected to Applications of Array page
    
    @tag15
    Scenario: The user is able to navigate to a page having an tryEditor from Applications of Array page
    Given The user is on the Applications of Array after logged in
    When The user clicks "Try Here" button on "Applications of Array" page
    Then The user should be redirected to Try Here page
    
    @tag16
    Scenario Outline: The user is able run code in tryEditor for Applications of Array page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    
     Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
    
    
    @tag17
    Scenario Outline:The user is presented with error message for code with invalid syntax in tryEditor for Applications of Array page
    Given The user is in array page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message
    
     Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
      
      @tag18
      Scenario: The user is able to navigate to Practice page
      Given The user is on the "Arrays in Python page" after1 logged in
      When The user clicks Practice Questions link
      Then The user should be redirected to Practice page
      
      @tag19
      Scenario: The user is able to navigate to Question page from Search the array link
      Given The user is on the Practice page after logged in
      When The user clicks the Search the array link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
      
      @tag20
      Scenario Outline: The user is able to run code in tryEditor for Search the array link
      Given The user is on Question page of Search the array after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with Run result
      
       Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      @tag21
      Scenario Outline: The user is able to submit code in tryEditor for Search the array link
      Given The user is on Question page of Search the array after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on Submit button
      Then The user should be presented with successful submission message
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
      
      @tag22
      Scenario Outline:  The user is presented with error message for code with invalid syntax in tryEditor for Search the array link
      Given The user is on Question page of Search the array after logged in
      When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
      
      @tag23
      Scenario: The user is able to navigate to Question page from Max Consecutive Ones
      Given The user is on the Practice page after logged in
      When The user clicks the Max Consecutive Ones link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
      
      @tag24
      Scenario Outline: The user is able to run code in tryEditor for Max Consecutive Ones
      Given The user is on Question page of Max Consecutive Ones after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with Run result
      
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      @tag25
      Scenario Outline: The user is able to submit code in tryEditor for Max Consecutive Ones
      Given The user is on Question page of Max Consecutive Ones after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      #And The user clicks on Submit button
      #Then The user should be presented with successful submission message
      
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      @tag26
      Scenario Outline: The user is presented with error message for invalid code in tryEditor for Max Consecutive Ones
      Given The user is on Question page of Max Consecutive Ones after logged in
      When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with error message
      
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
    
    
      @tag27
      Scenario: The user is able to navigate to Question page from Find Numbers with Even Number of Digits
      Given The user is on the Practice page after logged in
      When The user clicks the Find Numbers with Even Number of Digits link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
      
      
      @tag28
      Scenario Outline: The user is able to run code in tryEditor for Find Numbers with Even Number of Digits
      Given The user is on Question page of Find Numbers with Even Number of Digits after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with Run result
      
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      @tag29
      Scenario Outline: The user is able to submit code in tryEditor for Find Numbers with Even Number of Digits
      Given The user is on Question page of Find Numbers with Even Number of Digits after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      #And The user clicks on Submit button
      #Then The user should be presented with successful submission message
      
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      
      @tag30
      Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Find Numbers with Even Number of Digits
      Given The user is on Question page of Find Numbers with Even Number of Digits after logged in
      When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with error message
      Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
      
      @tag31
      Scenario: The user is able to navigate to Question page from Squares of a Sorted Array
      Given The user is on the Practice page after logged in
      When The user clicks the Squares of a Sorted Array link
      Then The user should be redirected to question page contains an tryEditor with Run and Submit buttons
      
      @tag32
      Scenario Outline: The user is able to run code in tryEditor for Squares of a Sorted Array
      Given The user is on Question page of Squares of a Sorted Array after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with Run result
       Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         0 |
      
      @tag33
      Scenario Outline: The user is able to submit code in tryEditor for Squares of a Sorted Array
      Given The user is on Question page of Squares of a Sorted Array after logged in
      When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      #And The user clicks on Submit button
      #Then The user should be presented with successful submission message
       Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
      
      @tag34
      Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Squares of a Sorted Array
      Given The user is on Question page of Squares of a Sorted Array after logged in
      When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> for the question
      And The user clicks on run button
      Then The user should be presented with error message
       Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         1 |
