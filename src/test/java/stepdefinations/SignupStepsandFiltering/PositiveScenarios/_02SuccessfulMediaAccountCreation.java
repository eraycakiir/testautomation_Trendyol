package stepdefinations.SignupStepsandFiltering.PositiveScenarios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.gmailAccount;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _02SuccessfulMediaAccountCreation {
    signUpPage signUpPageElements = new signUpPage();
    gmailAccount gmailAccountsElements = new gmailAccount();

    @When("the user clicks on the Google sign-up button")
    public void theUserClicksOnTheGoogleSignUpButton() throws InterruptedException {
        ReusableMethods.scroll(Driver.getDriver(), 1);
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.googleButton,5);
        signUpPageElements.googleButton.click();
    }

    @Then("the user should be redirected to the Google sign-up page")
    public void theUserShouldBeRedirectedToTheGoogleSignUpPage() {
        ReusableMethods.waitForSeconds(7);
        gmailAccountsElements.gmailAccounts.get(gmailAccountsElements.gmailAccounts.size() - 2).click();
    }

}
