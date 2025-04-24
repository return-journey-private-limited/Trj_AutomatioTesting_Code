Feature: TRJ Partner Website - Login Functionality

  As a registered partner
  I want to log in to the TRJ Partner website
  So that I can access my dashboard and manage bookings

  Background:
    Given I am on the TRJ Partner login page

  @ValidLogin
  Scenario: Successful login with valid credentials
    When I enter valid email "partner@example.com" and password "Password123"
    And I click the "Log In" button
    And I enter the valid OTP "123456"
    And I click the "Verify" button
    Then I should be redirected to the dashboard
    And I should see the dashboard logo

  @InvalidLogin
  Scenario: Login with invalid credentials
    When I enter invalid email "wrong@example.com" and password "WrongPass"
    And I click the "Log In" button
    Then I should see an error message "Invalid email or password"

  @InvalidOTP
  Scenario: Login with valid credentials but invalid OTP
    When I enter valid email "partner@example.com" and password "Password123"
    And I click the "Log In" button
    And I enter an invalid OTP "654321"
    And I click the "Verify" button
    Then I should see an error message "Invalid OTP"

  @BlankCredentials
  Scenario: Attempt login with blank credentials
    When I leave the email and password fields blank
    And I click the "Log In" button
    Then I should see validation messages:
      | Email    | "Email is required"    |
      | Password | "Password is required" |

  @Logout
  Scenario: Logout from the dashboard
    Given I am logged in with valid credentials
    When I click on the "Logout" button
    Then I should be redirected to the login page
