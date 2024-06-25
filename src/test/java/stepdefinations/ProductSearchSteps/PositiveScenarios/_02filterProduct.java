package stepdefinations.ProductSearchSteps.PositiveScenarios;

import io.cucumber.java.en.Then;
import pages.mainPage;
import pages.productSearchPage;
import utils.Driver;
import utils.ReusableMethods;

public class _02filterProduct {

    mainPage mainPageElements = new mainPage();
    productSearchPage productSearchPageElements = new productSearchPage();


    @Then("Click to Opportunity Products Button")
    public void clickToOpportunityProductsButton() {
        mainPageElements.opportunityProductsButton.click();
    }

    @Then("Click to Filters Button")
    public void clickToFiltersButton() {
        productSearchPageElements.filterButton.click();
    }

    @Then("Select Filter")
    public void selectFilter() throws InterruptedException {
        ReusableMethods.scrollToTextAndClick(Driver.getDriver(), productSearchPageElements.selectFilterOption, "Renk ");
    }

    @Then("Click to Apply Filter Button")
    public void clickToApplyFilterButton() {
        productSearchPageElements.applyFilterButton.click();
    }

    @Then("Click to Apply Filter Button Again")
    public void clickToApplyFilterButtonAgain() {
        productSearchPageElements.applyFilterButton.click();

    }
}
