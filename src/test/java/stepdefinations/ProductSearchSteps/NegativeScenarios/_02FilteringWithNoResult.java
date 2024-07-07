package stepdefinations.ProductSearchSteps.NegativeScenarios;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.productSearchPage;
import utils.Driver;
import utils.ReusableMethods;

public class _02FilteringWithNoResult {
    productSearchPage productSearchPageElement = new productSearchPage();
    @When("the user applies filters that yield no results")
    public void theUserAppliesFiltersThatYieldNoResults() throws InterruptedException {
        productSearchPageElement.price.click();
        ReusableMethods.waitForSeconds(2);
        productSearchPageElement.minPrice.click();
        productSearchPageElement.minPrice.sendKeys("5000000");
        productSearchPageElement.maxPrice.click();
        productSearchPageElement.maxPrice.sendKeys("8000000");
        ReusableMethods.scroll(Driver.getDriver(),1);
        productSearchPageElement.applyFilterButton.click();
        ReusableMethods.waitForSeconds(3);


    }

    @Then("the user should see a message indicating no products found")
    public void theUserShouldSeeAMessageIndicatingNoProductsFound() {
        ReusableMethods.waitForSeconds(3);
       if(productSearchPageElement.noResult.isDisplayed()){
           System.out.println("The message is displayed as expected");
       }

    }
}
