Feature: Sign up page

  Scenario:Unsuccessful account creation with weak password
    Given Go to the Main Page
    When Click to My Account Button
    When the user is on the sign-up page
    When the user enters a weak password
    And the user clicks on the sign-up button
    Then the user should see an error message