Feature: Admin User Login for HRMS Application


  @login
  Scenario: Admin user with valid credentials logs in successfully
    Given  user is navigated to HRMS application login page
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in

