@smoke
Feature: Resiter | user can resiter with his Data
    Scenario: User can register with valid Data
        Given user go to register page
        When user select gender type
        And user enter first name "automation" and last name "tester"
        And user enter date of birth
        And user enter email "test@example.com" field
        And user fills Password fields "P@ssw0rd" "P@ssw0rd"
        And user clicks on register button
        Then success message is displayed
