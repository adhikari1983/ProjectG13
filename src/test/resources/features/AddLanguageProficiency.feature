Feature:Adding Language Proficiency

 Background:
  When user enter valid admin credentials
  And user click the login button
  Then user should be successfully logged in
  When user clicks on PIM option and employee list option
  And user enters valid employee id
  And user clicks on search button
  And user is able to see employee information
    And user clicks on same valid employee id on the listed employee data table
  And user clicks on Qualifications button

  @languageProficiency
  Scenario:
    And user clicks on add language button
    And user selects the language and fluency and competency
    And user adds comments
    And User clicks on save button
    Then user is successfully add the language proficiency
  @editOrDeleteLanguage
    Scenario:
      When user clicks on language checkbox to edit or delete
      And user clicks on language delete button
      Then user is successfully edited or deleted the language




