package stepdefinations.LoginSteps.PositiveScenarios;

import io.appium.java_client.android.Activity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.gmailAccount;
import pages.loginPage;
import pages.updatePasswordPage;
import utils.Driver;
import utils.ReusableMethods;

import static utils.Driver.driver;

public class _02PasswordReset {
    loginPage loginPageElements = new loginPage();
    gmailAccount gmailAccountElements = new gmailAccount();
    updatePasswordPage updatePasswordPageElements = new updatePasswordPage();
    @When("the user clicks on the Forgot Password link")
    public void theUserClicksOnTheLink() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),loginPageElements.forgotPasswordButton,10);
        loginPageElements.forgotPasswordButton.click();
    }


    @When("the user enters a valid email address")
    public void theUserEntersAValidEmailAddress() {
        ReusableMethods.waitForSeconds(3);
        ReusableMethods.waitForVisibility(Driver.getDriver(),loginPageElements.ePostaTextBox,10);
        updatePasswordPageElements.eMailTextBox.click();
        updatePasswordPageElements.eMailTextBox.sendKeys("eraytest09@gmail.com");
    }

    @And("the user clicks on the reset password button")
    public void theUserClicksOnTheResetPasswordButton() {
        loginPageElements.buttonRenewPassword.click();
    }

    @Then("the user should receive a password reset email")
    public void theUserShouldReceiveAPasswordResetEmail() throws InterruptedException {
        driver.startActivity(new Activity("com.google.android.gm", "com.google.android.gm.ConversationListActivityGmail"));
        ReusableMethods.waitForSeconds(30);
        gmailAccountElements.lastMail.click();
        ReusableMethods.waitForSeconds(6);
        ReusableMethods.scroll(Driver.getDriver(), 1);
        gmailAccountElements.updatePassword.click();
        ReusableMethods.waitForVisibility(Driver.getDriver(),updatePasswordPageElements.newPasswordTextBox,14);
        updatePasswordPageElements.newPasswordTextBox.click();
        updatePasswordPageElements.newPasswordTextBox.sendKeys("Test123456");
        updatePasswordPageElements.againNewPaswordTextBox.sendKeys("Test123456");
        updatePasswordPageElements.saveButton.click();


    }
}
