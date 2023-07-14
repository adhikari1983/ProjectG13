Feature: Adding Employee to the HRMS application
  Background:
    Given user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in

    @addEmpWithoutIDProviding
  Scenario: Add employee without providing an employee ID
    When user clicks on PIM option
    And user clicks on add employee button
    And user enters firstName and middleName and lastName
    And user clicks on save button
    Then employee was added successfully
