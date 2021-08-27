@activity2_5
Feature: Data driven test with Example

Scenario Outline: Testing with Data from Scenario
    Given User is on Admin Login page
    When User enters "<Usernames>" and "<Passwords>" into page
    Then Read the page title and confirmation message of admin login
    And Close the Browser of Admin login page
    
Examples:
    | Usernames | Passwords |
    | admin     | password  |
    | adminUser | Password  |