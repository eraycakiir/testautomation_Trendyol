package stepdefinations.CartandPurchaseTransactions.NegativeScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01UnsuccessfulCheckoutWithAnEmptyCart {
    @And("Delete Product from cart")
    public void deleteProductFromCart() {
    }

    @When("the user attempts to place an order")
    public void theUserAttemptsToPlaceAnOrder() {
    }

    @Then("the user should see an error message indicating the cart is empty")
    public void theUserShouldSeeAnErrorMessageIndicatingTheCartIsEmpty() {
    }
}
