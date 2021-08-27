@activity2_4
Feature: Data driven test without Example

Scenario: Testing with Data from Scenario
    Given User is on Admin Login page
    When User enters "admin" and "password" into page
    Then Read the page title and confirmation message of admin login
    And Close the Browser of Admin login page