Feature: Subscription plan functionality

Scenario: verify the each subscription plans

    When user launches the Pricing Page Application URL
    And user click and subscribe the Free Plan 
    And  user click and subscribe the starter Plan
    And user click and subscribe the pro Plan 
    And  user click and subscribe the Enterprise Plan 
    Then see the toasted message