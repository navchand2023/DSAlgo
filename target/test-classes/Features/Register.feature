
@tag @TS_003
Feature: User registering a new user

  @tag1
  Scenario: User gets error message below username textbox
    Given The user opens Register Page    
    When The user clicks "Register" button with all fields empty   
    Then It should display an error "Please fill out this field." below Username textbox
    Scenario: User gets error message below password textbox
    Given The user opens Register Page    
    When The user clicks "Register" button with password and repeat password fields empty   
    Then It should display an error "Please fill out this field." below password textbox
    Scenario: User gets error message below repeat password textbox
    Given The user opens Register Page    
    When The user clicks "Register" button with repeat password empty   
    Then It should display an error "Please fill out this field." below repeat password textbox
    #Scenario: The user is presented with error message for invalid username
    #Given The user opens Register Page    
    #When The user clicks "Register" button with  username with characters other than Letters, digits and @/./+/-/_  
    #Then It should display an error message "Please enter a valid username"
    Scenario: The user is presented with error message for username already exists
    Given The user opens Register Page    
    When The user enters a valid existing username with password and password confirmation  
    Then It should display an error message "Username already exists"
    Scenario: The user is presented with error message for password mismatch
    Given The user opens Register Page    
    When The user clicks "Register" button after entering valid username and different passwords in password and password confirmation fields  
    Then It should display an error message password_mismatch:The two password fields didn’t match.
    Scenario: The user is presented with error message for password with characters less than 8
    Given The user opens Register Page    
    When The user clicks "Register" button after entering valid username  password with characters less than 8  
    Then It should display an error message Password should contain at least 8 characters
    Scenario: The user is presented with error message for password with only numbers
    Given The user opens Register Page    
    When The user clicks "Register" button after entering valid username  password with only numbers  
    Then It should display an error message Password can’t be entirely numeric.
    Scenario: The user is presented with error message for password too similar to your other personal information
    Given The user opens Register Page    
    When The user clicks "Register" button after entering valid username  password similar to username  
    Then It should display an error message password can’t be too similar to your other personal information.
    Scenario: The user is presented with error message for commonly used password
    Given The user opens Register Page    
    When The user clicks "Register" button after entering valid username  and commonly used password 
    Then It should display an error message Password can’t be commonly used password
    Scenario: The user is succesfully able to register 
    Given The user opens Register Page    
    When The user clicks "Register" button after entering valid username  valid password and repeat password
    Then The user should be redirected to Homepage with the message New Account Created. You are logged in as <username>
    
  