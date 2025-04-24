Feature: TRJ Partner Website - Forgot Password Functionality
  
  As a registered partner
  I want to reset my password
  So that I can regain access to my account

  Background: 
    Given I am on the TRJ Partner login page

  @ValidReset
  Scenario: Successful password reset with valid email and OTP
    When I click on the "Forgot Password" link
    And I enter the valid email "partner@example.com"
    And I click the "Get OTP" button
    And I enter the valid OTP "123456"
    And I click the "Verify" button
    Then I should see a confirmation message "Password reset successful"
    And I should be redirected to the login page

  @InvalidEmail
  Scenario: Reset attempt with invalid email
    When I click on the "Forgot Password" link
    And I enter an invalid email "invalid@example.com"
