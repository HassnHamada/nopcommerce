Feature: Login | user can login with his data
    Scenario: User can login with valid Data
        When Go to login page
        And Fill all fields with valid data
        And Click on login button
        Then Verify login success

    Scenario: User can login with invalid Data
        When Go to login page
        And Fill login fields with invalid data
        And Click on login button
        Then Verify login failure

    Scenario: User can login with empty fields
        When Go to login page
        And Don't fill login fields
        And Click on login button
        Then Verify login failure