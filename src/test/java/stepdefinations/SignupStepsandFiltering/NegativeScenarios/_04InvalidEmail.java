package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.cucumber.java.en.When;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _04InvalidEmail {
    signUpPage signUpPageElements = new signUpPage();

    @When("the user enters an invalid email format for sign in page")
    public void theUserEntersAnInvalidEmailFormatForSignInPage() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.signUpEmail,12);
        signUpPageElements.signUpEmail.click();
        signUpPageElements.signUpEmail.sendKeys("eraygs303gmail.com");
        signUpPageElements.signUpPassword.click();
        signUpPageElements.signUpPassword.sendKeys("12345623.Random");
        signUpPageElements.womanButton.click();
        signUpPageElements.approvedButton.click();
    }
}
