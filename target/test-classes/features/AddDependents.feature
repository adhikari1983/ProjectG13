Feature: Adding the dependents on employee profile

  Background:
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in
    When user clicks on PIM option and employee list option
    And user enters valid employee id
    And user clicks on search button
    Then user is able to see employee information
    And user clicks on same valid employee id on the listed employee data table
    And user clicks on Dependents button


  @smoke @regression @addDependent
  Scenario: Search employee by id and add dependents
    And user clicks on Add button of that page
    When user add name and relationship and pleaseSpecify and dateOfBirth
      | name       | relationship | pleaseSpecify | dateOfBirth |
      | April Full | Child        |               | 1985-01-01  |
    And user clicks on the save button of that page
    Then user is able to see Successfully Saved message display

  @smoke @regression @forOther
  Scenario Outline: Search employee by id and add dependents with specified Other relationship specified
    And user clicks on Add button of that page
    When user enters "<name>" and "<relationship>" and "<pleaseSpecify>" and "<dateOfBirth>" for the inputs
    And user clicks on the save button of that page
    Then user is able to see Successfully Saved message display
    Examples:
      | name       | relationship | pleaseSpecify | dateOfBirth |
      | Abc Biden  | Other        | Step          | 1987-01-01  |


  @smoke @regression @deleteDependent
  Scenario: Delete employee dependents
    When user clicks on the checkbox to select the dependent
    And user clicks on the delete button
    Then user is able to see Successfully Deleted  message display
