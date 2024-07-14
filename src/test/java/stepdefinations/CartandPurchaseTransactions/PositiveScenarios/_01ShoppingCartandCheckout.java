package stepdefinations.CartandPurchaseTransactions.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.cartPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01ShoppingCartandCheckout {
    cartPage cartPageElement = new cartPage();
    @Then("the product should be added to the cart")
    public void theProductShouldBeAddedToTheCart() {
        ReusableMethods.waitForVisibility(Driver.getDriver(),cartPageElement.textLeftUpForCart,25);
        if(cartPageElement.textLeftUpForCart.isDisplayed()) {
            System.out.println("Product is added to the cart");
        }
    }

}
