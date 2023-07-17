Feature: admin user adds different memberships under qualifications
  @membership
  Scenario:

    #Given user is navigated to HRMS application
    When Admin enters valid admin username and password
    And  clicks on login button
    Then Admin user is logged in
    Then Admin clicks on Admin option
    When Admin navigates to Qualifications
    And Admin selects Memberships
    Then Admin user can add any Memberships