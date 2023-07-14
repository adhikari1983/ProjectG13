Feature: Adding Employee to the HRMS application
  Background:
    Given user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option
    And user clicks on add employee button
    And user clicks on save button
    Then employee was added successfully


    @addEmpWithoutIDProviding
  Scenario: Add employee without providing an employee ID
      And user enters firstName and middleName and lastName
      And user clicks on save button
      Then employee was added successfully

    @addEmpWithIDProviding
  Scenario: Add employee by providing a unique employee ID
     When user enters firstName and middleName and lastName and employeeID

    | firstName | middleName | lastName | employeeID |
    | Dexter    | David      | Morgan   | 34556763   |
    | Debora    | Maria      | Morgan   | 67876876   |

