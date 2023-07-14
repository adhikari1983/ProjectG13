Feature: Admin terminating employee in HRMS application


  @terminate
  Scenario: Admin Terminates Employee successfully
  Given Admin user log in to the system using valid credentials.


    When user accesses the list of employees in the system.


    And select a specified employee from the list.


    And navigate to the employee's job page.


    And select the option to terminate the employment of the specified employee.


    Then specified employee is terminated
