Feature: Editing personal details in HRMS application

  Background:
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option and employee list option

  @smoke @regression @editEmployee
  Scenario: Search employee by id
    And user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information
    And user clicks on same valid employee id on the listed employee data table
    And user clicks on Edit button
    When user edit firstName and middleName and lastName and gender and maritalStatus and nationality and verify it
      | firstName | middleName | lastName | gender | maritalStatus | nationality |
      | Kiran     | Prayas     | Adhikari | Male   | Married       | Nepalese    |
    And user clicks on the save button