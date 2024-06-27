package stepdefinations.SignupStepsandFiltering.NegativeScenarios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03DuplicateEmail {
    @When("the user enters an email that is already registered")
    public void theUserEntersAnEmailThatIsAlreadyRegistered() {
    }

    @Then("the user should see an error message indicating the email is already in use")
    public void theUserShouldSeeAnErrorMessageIndicatingTheEmailIsAlreadyInUse() {
    }
}
