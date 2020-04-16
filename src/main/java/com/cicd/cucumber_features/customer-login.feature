@regression
Feature: Customer Login
  Customer tries to login the XYZ banking application

  Background: 
    Given I navigate to banking portal
    When I click on Customer Login button
    Then System displays Your Name dropdown

  Scenario Outline: Customer logs in with valid credentials
    Given I am on login page
    When I select "<user-name>" username from the dropdown
    And System displays Login button
    And I click on Login button
    Then Login is "<login-type>"

    Examples: 
      | user-name    | login-type |
      | Harry Potter | Success    |
      | Ron Weasly   | Failure    |
