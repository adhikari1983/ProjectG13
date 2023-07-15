Feature: adding language
  Background:
    Given user enter valid admin credentials
    And user click the login button

  @addLanguage
  Scenario:
  #Given "Admin" user is logged in
    When user clicks on Admin button
    When user navigates to Qualifications and clicks on language button
    And User clicks on add button
    And user enters the language name and clicks on save
    Then user is successfully add the language