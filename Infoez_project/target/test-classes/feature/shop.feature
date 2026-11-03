Feature: search functionality

Scenario: verify the search fields

    When user launches the login Page Application URL
    And user enters the shop name in search field
    And user enters the city name in search field
    And user click the search button
    Then see the related results