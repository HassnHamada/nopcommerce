@smoke
Feature: Hovering | Teast Hovering and clicking an element in dropdown menu
    Scenario: Hovering on random element and clicking one of its children
        When user move mouse cursor over Computers, Electronics or Apparel
        And choose one of its children in the dropdown menu
        Then user should be in the selected page