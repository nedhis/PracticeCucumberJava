
Feature: To test the login functionality

  Scenario Outline: Validate login is successful with valid credentials#changed to scenario outline for parameterization
    Given Browser opened
    And User is on login page
    When User enters the <Username> and <Password>
    And User clicks on Enter
    Then User is navigated to the next page
    
    
    
    Examples:
    |Username|Password|
    |nidhi|12345|
    |Raghav|12345|
    
