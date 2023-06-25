@tagStack
Feature: Stack
  I want to use this template for my feature file

@tagStack1
 Scenario: SignInPage
 Given The user is on Signin page of DS Algo portal
 When  The user enter valid "Numpy@108_1" and "Welcome108"
 And The user click on login button
 Then The user is redirected to homepage
 
@tagStack2
 Scenario: The user is directed to "Stack" Page
 Given The user is on the "home page" after logged in
 When The user select "Stack" item from the drop down menu
 Then  The user should be directed to "Stack" Page
  
@tagStack3
 Scenario: The user is able to navigate to "Operations in Stack" page
 Given The user is on the Stack page after logged in
 When  The user clicks on the Operations in Stack link
 Then  The user should then be directed to "Operations in Stack" Page
 
@tagStack4
 Scenario: The user is able to navigate to a page having an tryEditor
 Given The user is on the "Operations in Stack page" after logged in
 When  The user clicks "Try Here" button in "stack" page
 Then  The user should be redirected to a page having an tryEditor with a Run button to test
 
@tagStack5
 Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When  The user gets input from sheet "<Sheetname>" and <RowNumber>
 And   The user clicks on Run button after Entering valid python code in stack tryEditor
 Then  The user should be presented with Run output
 
 Examples: 
 | Sheetname   			|RowNumber| 
 | PythonCode  |    0    |
 
@tagStack6
 Scenario Outline: The user is able to get the error message for invalid syntax
 Given The user is in the option operations-in-stack in "Stack" page having tryEditor with a Run button to test for Invalid syntax
 When  The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> 
 And   The user clicks on Run button after Entering invalid python code in stack tryEditor
 Then  The user should be presented with the Run output with popup
 
 Examples: 
 | Sheetname  			| RowNumber | 
 | PythonCode  |         1 |
 
@tagStack7
 Scenario: The user is able to navigate to "Implementation" Page
 Given The user is on the Stack page after logged in
 When  The user clicks on the Implementation button
 Then  The user should then be directed to Implementation Page
 
@tagStack8
 Scenario: The user is able to navigate to Implementation page having an tryeditor
 Given The user is on the "Stack Implementation page" after logged in
 When  The user clicks "Try Here" button1 in "stack Implementation" page
 Then  The user should be redirected to a page having an tryEditor with a Run button to test
 
@tagStack9
 Scenario Outline: The user is able to run code in tryEditor
 
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When  The user gets input from sheet "<Sheetname>" and <RowNumber>
 And   The user clicks on Run button after Entering valid python code in stack tryEditor
 Then  The user should be presented with Run output
 
 Examples: 
 | Sheetname   			|RowNumber| 
 | PythonCode  |    0    |
@tagStack10
 Scenario Outline: The user is able to get the error message for invalid syntax
 
 Given The user is in the option operations-in-stack in "Stack" page having tryEditor with a Run button to test for Invalid syntax
 When  The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber> 
 And   The user clicks on Run button after Entering invalid python code in stack tryEditor
 Then  The user should be presented with the Run output with popup
 
 Examples: 
 | Sheetname  			| RowNumber | 
 | PythonCode  |         1 |
 
 
@tagStack11
 Scenario: The user is able to navigate to "Applications" in stack Page
 Given The user is on the Stack page after logged in
 When  The user clicks on the Applications button
 Then  The user should be directed to Applications Page
 
@tagStack12
 Scenario: The user is able to navigate to Applications page having an tryEditor
 Given The user is on the "Applications stack page" after logged in
 When  The user clicks "Try Here" button in "stack Applications" page
 Then  The user should be redirected to a page having an tryEditor with a Run button to test
 
@tagStack13
 Scenario Outline: The user is able to run code in tryEditor
 Given The user is in the Stack page after having an tryEditor with a Run button to test
 When  The user gets input from sheet "<Sheetname>" and <RowNumber>
 And   The user clicks on Run button after Entering valid python code in stack tryEditor
 Then  The user should be presented with Run output
 
 Examples: 
 | Sheetname   			|RowNumber| 
 | PythonCode	|       0 |
 
@tagStack14
Scenario Outline: The user is able to get the error message for invalid syntax
 Given The user is in the option stack-applications in Stack page having tryEditor with a Run button to test for Invalid syntax
 When  The user Enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
 And   The user clicks on Run button after Entering invalid python code in stack tryEditor
 Then  The user should be presented with the Run output with popup
 
 Examples: 
 | Sheetname  		 | RowNumber | 
 | PythonCode |         1 |
 
@tagStack15
 Scenario: The user is able to navigate to "Practice Questions" in stack Page
 Given The user is on the Stack page after logged in
 When The user clicks on the Operations in Stack link 
 And  The user clicks on the Practice Questions button
 Then  The user should be redirected to Practice Questions page
 
 
