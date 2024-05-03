
Feature: Register page
  I want to use this template for my feature file

Scenario: successful registration with valid credentials
    Given user is in landing page
    When user enters username "sdet133" , password "bughunters@123" and confirm password "bughunters@123"
    Then page Title should be "NumpyNinja" 
  
 Scenario Outline: registration with invalid credentials
    Given user is in landing page
    When user enters username <username> , password <password> and confirm password <confirmpassword>
    Then page Title should be "Registration" 

    Examples: 
      | username  | password | confirmpassword  | 
      | sdet158   |    Bughunters2024  | Bughunters@2024  |  
      |      -   |    Bughunters@2024  | Bughunters@2024  | 
      | sdet158  |    -  | Bughunters@2024  | 
      | sdet158  |    -  | -  | 