Feature: Question2
  I want to use this template for Question2


  @Question2.1 @Question2.2
 Scenario Outline: Verify user is able to register into IMdb
    Given I open http://www.imdb.com in Firefox
    When I click SignIn
    And I click Create an Account
    Then I provide <name> <email> <password> and user registration successful
    And I Logout and Login with <email> <password> successfully having profile <name> 
  Examples:
  
	|name		|email								|password	|
	|prabha	|prabhadks4@gmail.com	|Test@1234|
	