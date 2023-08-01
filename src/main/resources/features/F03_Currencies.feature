@test
@smoke
Feature: F03_Currencies | users could change the displayed currency
    Scenario: users change currency to Euro
        When users change currency to "Euro"
        Then the displayed currency logo should be "€"
    Scenario: users change currency to US Dollar
        When users change currency to "US Dollar"
        Then the displayed currency logo should be "$"