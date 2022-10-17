#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Bank
Feature: Register as a new user to parabank
        and Login with valid userName and valid password

  Background: 
    Given open chrome driver browser and launch the parabank url

  @Register
  Scenario: Register as a new user to parabank.
    When I entered valid data in text field
    And I clicked on Register button
    And I Verified that the user is logged in parabank account
    Then I clicked on Log out button

  @Login
  Scenario Outline: Login with parabank valid username and valid password
    When I entered username "<username>" & password "<password>"
    And I click on Login button
    Then Verify user is  "<status>" user of parabank

    Examples: 
      | username | password | status  |
      | raman1   | pass@123  | invalid |
      | raman1234 | pass12   | invalid |
      | raman1234 | pass@123  | valid   |
