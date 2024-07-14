package stepdefinations.CartandPurchaseTransactions.NegativeScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01UnsuccessfulCheckoutWithAnEmptyCart {
    cartPage cartPageElements = new cartPage();

    @And("Delete Product from cart")
    public void deleteProductFromCart() {
        cartPageElements.deleteButton.click();
    }

    @Then("the user should see an error message indicating the cart is empty")
    public void theUserShouldSeeAnErrorMessageIndicatingTheCartIsEmpty() {
        ReusableMethods.waitForVisibility(Driver.getDriver(), cartPageElements.emptyTextViewMessage, 20);
        if (cartPageElements.emptyTextViewMessage.isDisplayed()) {
            System.out.println("The error message is displayed as expected");
        }
    }
}
