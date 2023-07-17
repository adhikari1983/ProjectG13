Feature: Managing work experience details in HRMS application

  Background:
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option and employee list option
    And user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information
    When user clicks on same valid employee id on the listed employee data table




  @workExp
  Scenario: Add work experience
    When user clicks on Qualifications button
    And user clicks on Add button
    And user adds Company and Job Title and dates from to and comment and verify it
      | Company | Job Title  | From       | To         | Comment     |
      | Syntax  | Instructor | 2022-01-01 | 2023-01-01 | Taught Java |
    And user clicks on save btn
    And user work experience will be saved  in profile
    When user clicks on Company name
    And user edits Work Experience Page
    When user clicks on Company check box
    And user clicks on Delete button
