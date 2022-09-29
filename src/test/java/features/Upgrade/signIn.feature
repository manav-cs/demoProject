Feature: Upgrade Sign In

  Background:
    Given the Upgrade user navigates to the homepage

  @UP @UP_signIn @regression @smoke
  Scenario: Ensure existing profile user can login in Upgrade
    And the Upgrade user creates a new profile
    And the Upgrade user signs out via the hamburger menu
    And the Upgrade user clicks on the "Sign in here" link from the top nav
    When the Upgrade user login to the account
    Then the user should see the Welcome Back Message along with hardcoded first name

  @UP @UP_signIn @regression @smoke
  Scenario: Ensure existing profile user can logout from Upgrade
    And the Upgrade user login to the account
    When the Upgrade user signs out via the hamburger menu
    Then the Upgrade user should successfully return to the homepage

  @UP @UP_signIn @regression @smoke
  Scenario: Ensure profile users are not able to sign in to their account with an invalid password using UP
    And the Upgrade user clicks on the "Sign in here" link from the top nav
    And the user enters a invalid email address in UP
    And the user enters an invalid password in UP
    When the user clicks on the "Sign In" button in UP
    Then the Upgrade user should see the "The email address or password are not correct" message