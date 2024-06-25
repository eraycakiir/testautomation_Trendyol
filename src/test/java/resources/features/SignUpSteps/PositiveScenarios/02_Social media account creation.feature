Feature: Sign-up Page
Scenario: Social media account creation
  Scenario: Successful account creation with valid information
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the sign-up page
    When the user clicks on the Google sign-up button
    Then the user should be redirected to the Google sign-up page
    When the user enters valid Google credentials
    Then the user should be signed up successfully