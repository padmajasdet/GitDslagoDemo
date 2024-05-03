
@tag
Feature: Signin Page
  I want to use this template for my feature file

  
  
  Scenario Outline:  Successful signin with valid credentials
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid  "<username>"  and "<password>" 
    Then The error message "<status> "

    Examples: 
     | username  | password | status  |
     | greenhorns |    testing...| You are logged in |
     | greenhorns |     inpass    |Invalid Username and Password|
     | inpass     |      testing...   |Invalid Username and Password|
     |        |      testing...   |Please fill it out|
     |   greenhorns     |        |Please fill it out|
     
