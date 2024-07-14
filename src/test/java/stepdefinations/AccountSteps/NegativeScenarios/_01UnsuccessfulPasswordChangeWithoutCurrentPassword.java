package stepdefinations.AccountSteps.NegativeScenarios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.changePasswordPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01UnsuccessfulPasswordChangeWithoutCurrentPassword {
    changePasswordPage  changePasswordPageElement = new changePasswordPage();
    @When("the user attempts to change their password without entering the current password")
    public void theUserAttemptsToChangeTheirPasswordWithoutEnteringTheCurrentPassword() {

        changePasswordPageElement.newPassword.click();
        changePasswordPageElement.newPassword.sendKeys("NewPassword.123");
        changePasswordPageElement.newPasswordAgain.click();
        changePasswordPageElement.newPasswordAgain.sendKeys("NewPassword.123");

    }

    @Then("the user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),changePasswordPageElement.enterCurrentPasswordError,13);
        if(changePasswordPageElement.enterCurrentPasswordError.isDisplayed()){
            System.out.println("The error message is displayed as expected");
        }
    }
}
