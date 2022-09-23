Feature: Login Action
  Scenario:Login with valid credentials
    Given User is on Home Page
    When  Add Swagbag to cart and then checkout
    And   Enter billing information
   Then  Back to home page
