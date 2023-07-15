Feature: Search an employee

  Background:
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option and employee list option

  @searchById
  Scenario: Search employee by id
    And user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information



