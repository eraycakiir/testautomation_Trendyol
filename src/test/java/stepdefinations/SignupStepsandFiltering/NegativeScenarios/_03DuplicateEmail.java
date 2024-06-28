package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _03DuplicateEmail {
    signUpPage signUpPageElements = new signUpPage();
    @When("the user enters an email that is already registered")
    public void theUserEntersAnEmailThatIsAlreadyRegistered() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.signUpEmail,12);
        signUpPageElements.signUpEmail.click();
        signUpPageElements.signUpEmail.sendKeys("eraygs303@gmail.com");
        signUpPageElements.signUpPassword.click();
        signUpPageElements.signUpPassword.sendKeys("12345623.Random");
        signUpPageElements.womanButton.click();
        signUpPageElements.approvedButton.click();


    }

    @Then("the user should see an error message indicating the email is already in use")
    public void theUserShouldSeeAnErrorMessageIndicatingTheEmailIsAlreadyInUse() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.errorMessage,12);
        if(signUpPageElements.errorMessage.isDisplayed()){
            System.out.println("The error message is displayed as expected");
        }
    }
}
