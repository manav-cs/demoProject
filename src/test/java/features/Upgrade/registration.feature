Feature: Upgrade Registration

  Background:
    Given the Upgrade user navigates to the homepage

  @UP @UP_registration @regression @smoke
  Scenario: Ensure the user can register for a profile in Upgrade
     And the Upgrade user clicks on the "Sign in here" link from the top nav
     And the user clicks on "Create an Account" link in UP
     And the user fills out the Get Started form in UP and clicks Next
     When the user fills out the Home Address in UP and clicks Next
     Then the user should see the Choose Trade Option page

  @UP @UP_registration @regression @smoke
  Scenario: Ensure the profile user can sign in after registering in Upgrade
    Given the Upgrade user creates a new profile
    And the Upgrade user signs out via the hamburger menu
    And the Upgrade user clicks on the "Sign in here" link from the top nav
    And the CSE user can enter their credentials
    When the user clicks on the "Sign In" button in UP
    Then the user should see the Welcome Back Message
