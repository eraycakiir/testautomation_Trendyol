Feature: Sign-Up Page

  Scenario: Successful account creation with valid information
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the sign-up page
    When the user enters all required fields with valid information
    And the user clicks on the sign-up button
    Then the user should see a success message and be redirected to the home page

