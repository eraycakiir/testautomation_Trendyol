Feature: Password Reset Functionality
  Scenario: Password Reset Functionality
    Given Go to the Main Page
    When Click to My Account Button
    When the user clicks on the "Forgot Password" link
    Then the user should be redirected to the password reset page
    When the user enters a valid email address
    And  the user clicks on the reset password button
    Then the user should receive a password reset email