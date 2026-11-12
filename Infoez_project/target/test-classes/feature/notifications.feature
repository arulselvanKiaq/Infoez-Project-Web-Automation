Feature: Notifications functionality

Scenario: verify the notifications
    When user launches the notification Page Application URL
    And user click the sigin using customer credentials
    And user click the customer profile
    And user click the notifications
    Then user click the mark all read button
    