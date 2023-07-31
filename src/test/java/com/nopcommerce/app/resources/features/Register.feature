@smoke
Feature: Resiter | user can resiter with his Data
    Scenario: user can register with valid Data
        When Go to Register page
        And Fill all data
        And Click on register button
        Then Verify success registration

    Scenario: user can register with invalid Data
        When Go to Register page
        And Fill all fields with invalid data
        And Click on register button
        Then Verify registration failure