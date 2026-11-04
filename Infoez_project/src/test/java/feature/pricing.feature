Feature: Subscription plan functionality

Scenario: verify the each subscription plans

    When user launches the Pricing Page Application URL
    And user click and subscribe the Free Plan and see the toasted message
    And user click and subscribe the starter Plan and see the toasted message
    And user click and subscribe the pro Plan and see the toasted message
    Then user click and subscribe the Enterprise Plan and see the toasted message