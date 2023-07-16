Feature: Admin User Login for HRMS Application

  #Given  user is navigated to HRMS application login page

  @login
  Scenario: Admin user with valid credentials logs in successfully
    When user enter valid admin credentials
    And user click the login button
    Then user should be successfully logged in

