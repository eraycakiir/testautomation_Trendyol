Feature: Sign-Up Page

  Scenario: Successful account creation with valid information
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the sign-up page
    When the user enters all required fields with valid information
    And the user clicks on the sign-up button
    When Go to the Gmail Account for verification code
    When enter verification code
    Then the user should see a my account page

