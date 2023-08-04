@smoke
Feature: FollowUs | Test functionality of social networks pages
    Scenario Outline: Test "<network>" link
        Given user at home page
        When user clicks the "<network>" network
        Then a new page should open to "<link>"
        Examples:
            | network  | link                                                  |
            | facebook | https://www.facebook.com/nopCommerce                  |
            | twitter  | https://twitter.com/nopCommerce                       |
            | rss      | https://demo.nopcommerce.com/new-online-store-is-open |
            | youtube  | https://www.youtube.com/user/nopCommerce              |