@SmokeFeature
Feature: feature to Test login functionality
@Smoketest
Scenario: Check login function is succesful using valid crendentials
    Given User  is on login page
    When user enters username and passwod
    And press on login button
    Then user will able to navigate to Home page
