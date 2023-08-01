Feature: Hovering | Teast Hovering and clicking an element in dropdown menu
    Scenario: Hovering on `Electronics` and clicking `Camera & Photo`
        Given User visits the home page
        And Move mouse cursor to `Electronics` in navigation bar
        And Move down to `Camera & Photo`
        And Click
        Then User should be in `Camera & Photo` page