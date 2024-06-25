Feature: Social media login

  Scenario: Social media login
    Given Go to the Main Page
    When Click to My Account Button
    When the user clicks on the Google login button
    Then the user should be redirected to the Google login page
    When the user enters valid Google credentials
    Then the user should be logged in successfully