Feature: Sign up page

  Scenario:Unsuccessful account creation with duplicate email
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the sign-up page
    When the user enters an email that is already registered
    And the user clicks on the sign-up button
    Then the user should see an error message indicating the email is already in use
