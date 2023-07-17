Feature: employee job details

  Background:
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option and employee list option

  @addEmp
  Scenario: add current job details for employees
 # The Admin user can access the employee's profile and navigate to the current job details section.
    #When user clicks PIM in the navigation bar
    And user should see the employee list page
    Then user will select an employee id from the employee list
    When user selects the job tab on the personal details page
    And user should select the edit button
    And the following fields should be displayed and editable
      | JobTitle  | employeeStatus | jobCategory | joinedDate | subUnit | location | startDate  | endDate    |
      | Developer | Active         | sales       | 2020-01-01 | Account | Chicago  | 2022-01-02 | 2023-01-02 |
    Then user should select the save button and verify it