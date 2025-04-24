Feature: TRJ Partner Website - Logout Functionality

  As a logged-in partner
  I want to log out from the TRJ Partner website
  So that I can securely end my session

  Background:
    Given I am logged in with valid credentials

  @ValidLogout
  Scenario: Successful logout from the dashboard
    When I click on the profile icon
    And I click the "Logout" button
    Then I should be redirected to the login page

  @RedirectAfterLogout
  Scenario: Verify that accessing the dashboard after logout redirects to the login page
    Given I am logged out
    When I try to access the dashboard URL directly
    Then I should be redirected to the login page

  @SessionInvalidation
  Scenario: Verify session invalidation after logout
    Given I am logged out
    When I attempt to perform an action requiring authentication
    Then
