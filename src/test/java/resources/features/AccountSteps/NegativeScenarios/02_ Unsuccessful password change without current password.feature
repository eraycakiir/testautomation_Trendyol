Feature:Unsuccessful password change without current password
  Scenario:Unsuccessful password change without current password
    Given Go to the Main Page
    When Click to My Account Button
    When Click to My Account Settings
    When Click to Change Password
    When the user attempts to change their password without entering the current password
    When Click to Change Password Button
    Then the user should see an error message
