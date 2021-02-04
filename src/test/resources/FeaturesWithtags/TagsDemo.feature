Feature: To test the login feature

  @regression
  Scenario: Validate login is successful with valid credentials#changed to scenario outline for parameterization
    Given Browser opened
    And User is on login page
    When User enters the Username and Password
    And User clicks on Enter
    Then User is navigated to the next page

  @Smoke
  Scenario: Sample 2
    Given Check the Tags
    When Chekc the Tags
    And Chekc the Tags
    Then Chekc the Tags
