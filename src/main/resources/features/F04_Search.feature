@test
@smoke
Feature: 04_Search | users could search for a certain product
    Scenario Outline: user could search using product name.
        When user enter "<keyword>" in search field
        Then products with "<keyword>" should appear
        Examples:
            | keyword |
            | book    |
            | laptop  |
            | nike    |
    Scenario Outline: user could search using product sku.
        When user enter "<sku>" in search field
        Then product with "<sku>" should appear
        Examples:
            | sku       |
            | SCI_FAITH |
            | APPLE_CAM |
            | SF_PRO_11 |