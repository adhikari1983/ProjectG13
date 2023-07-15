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

    @addEmpWithIDProviding
  Scenario: Add employee by providing a unique employee ID
     When user enters firstName and middleName and lastName and employeeID

    | firstName | middleName | lastName | employeeID |
    | Dexter    | David      | Morgan   | 54354345   |
    | Debora    | Maria      | Morgan   | 13123313   |

    @incompleteEmpInformation
  Scenario Outline: Add incomplete or invalid employee information
      When user enters "<firstname>" and "<lastname>" and verify "<error>"
      Examples:
        | firstname | lastname | error    |
        |           | Murphy   | Required |
        |Shawn      |          | Required |



