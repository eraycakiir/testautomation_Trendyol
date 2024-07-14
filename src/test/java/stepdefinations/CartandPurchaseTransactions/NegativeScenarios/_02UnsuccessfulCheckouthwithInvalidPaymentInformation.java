package stepdefinations.CartandPurchaseTransactions.NegativeScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import utils.Driver;
import utils.ReusableMethods;

public class _02UnsuccessfulCheckouthwithInvalidPaymentInformation {
    cartPage cartPageElement  = new cartPage();
    @Then("Confirm Cart")
    public void confirmCart() {
        cartPageElement.confirmCart.click();
        ReusableMethods.waitForSeconds(5);
    }
    @When("the user enters invalid payment information")
    public void theUserEntersInvalidPaymentInformation() throws InterruptedException {
        ReusableMethods.waitForSeconds(10);
        cartPageElement.payWithAnotherCard.click();
        cartPageElement.cardNumberArea.click();
        cartPageElement.cardNumberArea.sendKeys("0000000011111111");
        ReusableMethods.scroll(Driver.getDriver(),1);


    }
    @And("the user clicks on the Place Order button")
    public void theUserClicksOnThePlaceOrderButton() {
        cartPageElement.paymenSubmit.click();
        ReusableMethods.waitForSeconds(5);
        if(cartPageElement.paymenSubmit.isDisplayed()) {
            System.out.println("Payment failed due to invalid card information.");
        }
    }

}
