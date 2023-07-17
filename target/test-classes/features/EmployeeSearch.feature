Feature: Search an employee in the HRMS Application

  Background:
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option and employee list option

  @fullName
  Scenario: Search employee by full name
    And user enters valid employee full name in name text box
    And user clicks on search button
    Then user is able to see employee information

  @partial
  Scenario: Search employee by partial name matches in variations and capitalizations
    When user enters partial name match in variations and capitalizations
    And user clicks on search button
    Then user is able to see employee information

  @searchById
  Scenario: Search employee by id
    And user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information

  @invalidName
  Scenario:Invalid name no matching record found
    When user enters invalid name
    And user clicks on search button
    Then user is able to see No Records Found message

  @invalidId
  Scenario: Invalid id no matching found
    When user enters invalid id
    And user clicks on search button
    Then user is able to see No Records Found message




