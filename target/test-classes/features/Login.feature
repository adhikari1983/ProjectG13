Feature: Admin User Login for HRMS Application

  #Given  user is navigated to HRMS application login page

  @login
  Scenario: Admin user with valid credentials logs in successfully
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in

    @invalidUserLogin
    Scenario Outline: Invalid User Login
      When user enters "<username>" and "<password>" and verify the "<error>"
      Then user clicks on login button
      And error message is displayed
      Then user can correct the input and attempt to log in again
      Examples:
      | username | password    | error                    |
      | admin    | wwwwwwww    | Invalid credentials      |
      | wwwwwwww | Hum@nhrm123 | Invalid credentials      |
      |          | Hum@nhrm123 | Username cannot be empty |
      | admin    |             | Password cannot be empty |
      |          |             | Username cannot be empty |
      | djhfgdjh | sdjhgfdjhfg | Invalid credentials      |


