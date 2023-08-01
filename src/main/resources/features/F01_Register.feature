@smoke
Feature: Resiter | user can resiter with his Data
    Scenario: User can register with valid Data
        Given user go to register page
        When user select gender type
        And user enter first name "automation" and last name "tester" Step 4 user enter date of birth
        And user enter email "test@example.com" field
        And user fills Password fields "P@ssw0rd" "P@ssw0rd" Step 7 user clicks on register button
        Then success message is displayed

    Scenario: User can register with invalid Data
        When Go to Register page
        And Fill all fields with invalid data
        And Click on register button
        Then Verify registration failure