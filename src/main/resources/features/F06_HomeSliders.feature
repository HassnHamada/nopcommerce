@test
@smoke
Feature: HomeSliders | Test sliders navigating you to the right page
    Scenario: User may click the first slider 
        Given user at home page
        When user clicks the "first" slider
        Then user should be navigated to "https://demo.nopcommerce.com/nokia-lumia-1020"
    Scenario: User may click the second slider 
        Given user at home page
        When user clicks the "second" slider
        Then user should be navigated to "https://demo.nopcommerce.com/iphone-6"