Feature: search functionality

Scenario: verify the search fields

    When user launches the Application URL 
    And user enters the shop name "Aroma cafe" in search field without login
    And user enters the city name "Bengaluru" in search field without login
    And user click the search button in explore page
    Then see the related results in explore page