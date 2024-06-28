package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.myAccountPage;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01IncorrectInformation {
    myAccountPage myAccountPageElements = new myAccountPage();
    signUpPage signUpPageElements = new signUpPage();
    @When("the user is on the sign-up page")
    public void theUserIsOnTheSignUpPage() {
        myAccountPageElements.signUpButton.click();
    }

    @When("the user leaves any required field enters incorrect information")
    public void theUserLeavesAnyRequiredFieldEntersIncorrectInformation() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.signUpEmail,12);
        signUpPageElements.signUpEmail.click();
        signUpPageElements.signUpEmail.sendKeys("random122345@gmail.com");
        signUpPageElements.signUpPassword.click();
        signUpPageElements.signUpPassword.sendKeys("12345623.Random");
        signUpPageElements.womanButton.click();
        signUpPageElements.approvedButton.click();



    }

    @And("the user clicks on the sign-up button")
    public void theUserClicksOnTheSignUpButton() {
        signUpPageElements.registerButton.click();

    }

    @Then("Write to verification code")
    public void writeToVerificationCode() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.verificationCodeArea,12);
        signUpPageElements.verificationCodeArea.click();
        signUpPageElements.verificationCodeArea.sendKeys("123456");
        signUpPageElements.continueButton.click();

    }

    @And("the user should see an error message for wrong verification code")
    public void theUserShouldSeeAnErrorMessageForWrongVerificationCode() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.errorMessage,12);
        if(signUpPageElements.errorMessage.isDisplayed()){
            System.out.println("The error message is displayed as expected");
        }
    }
}
