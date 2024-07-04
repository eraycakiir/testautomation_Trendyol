package stepdefinations.LoginSteps.PositiveScenarios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.gmailAccount;
import pages.myAccountPage;
import pages.signUpPage;
import utils.Driver;
import utils.ReusableMethods;

public class _03SocialMediaLogin {
    signUpPage signUpPageElements = new signUpPage();
    myAccountPage myAccountPageElements = new myAccountPage();
    gmailAccount gmailAccountsElements = new gmailAccount();
    @When("the user clicks on the Google login button")
    public void theUserClicksOnTheGoogleLoginButton() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),signUpPageElements.googleButton,5);
        signUpPageElements.googleButton.click();
    }

    @Then("the user should be redirected to the Google login page")
    public void theUserShouldBeRedirectedToTheGoogleLoginPage() {
        ReusableMethods.waitForSeconds(7);
        gmailAccountsElements.gmailAccounts.get(gmailAccountsElements.gmailAccounts.size() - 2).click();
    }


    @Then("the user should be logged in successfully")
    public void theUserShouldBeLoggedInSuccessfully() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),myAccountPageElements.eMailTextForConfirm,10);
        if(myAccountPageElements.eMailTextForConfirm.isDisplayed()){
            System.out.println("Sign-in is successful");
        }


    }
}
