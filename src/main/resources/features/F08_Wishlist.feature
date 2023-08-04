@smoke
Feature: Wishlist | Test wishlist functionalities
    Scenario: Adding a product to wishlist
        Given user at home page
        When user clicks on the heart symbol near any product Ex "HTC One M8 Android L 5.0 Lollipop"
        Then a notification should appear
        When user go to check for product in wishlist
        Then "HTC One M8 Android L 5.0 Lollipop" should be present