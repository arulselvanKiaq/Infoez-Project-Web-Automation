Feature: search functionality

Scenario: verify the search fields

    When user launches the Application URL
    And user click the sigin button  
    And user click the customer credentials  
    And user click the login btn
    And user enters the shop name in search field
    And user enters the city name in search field
    And user click the search button
    Then see the related results