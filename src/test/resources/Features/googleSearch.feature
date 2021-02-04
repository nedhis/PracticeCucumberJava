
Feature: To test the Google search functionality

Scenario: Validate the google search is working

Given Browser is open 
And user is on the Google Search Page
When user enter the text in the search box 
And user clicks on Enter
Then user is navigated to the Search results.