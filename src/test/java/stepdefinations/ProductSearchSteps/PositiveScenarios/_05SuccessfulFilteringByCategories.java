package stepdefinations.ProductSearchSteps.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.productSearchPage;
import utils.ReusableMethods;

import java.util.Random;

public class _05SuccessfulFilteringByCategories {
    productSearchPage productSearchPageElements = new productSearchPage();
    public String selectedBrandText;

    @When("the user selects a brand filter")
    public void theUserSelectsABrandFilter() {
        productSearchPageElements.brandButton.click();
        ReusableMethods.waitForSeconds(4);
        Random rand = new Random();
        // brandList listesinden rastgele bir eleman seç
        int randomIndex = rand.nextInt(productSearchPageElements.brandList.size());
        WebElement selectedElement = productSearchPageElements.brandList.get(randomIndex);
        selectedBrandText = selectedElement.getText();
        selectedElement.click();
        productSearchPageElements.applyFilterButton.click();

    }

    @Then("the user should see a list of products matching the selected brand")
    public void theUserShouldSeeAListOfProductsMatchingTheSelectedBrand() {
        ReusableMethods.waitForSeconds(3);
        Assert.assertEquals(selectedBrandText,productSearchPageElements.brandName.getText());

    }

    @And("the user clicks on the search button")
    public void theUserClicksOnTheSearchButton() {
        productSearchPageElements.applyFilterButton.click();
        ReusableMethods.waitForSeconds(3);
    }


    @And("Check the  filter results")
    public void checkTheFilterResults() {
      // ReusableMethods.getFirstWordFromElement(productSearchPageElements.brandNameInSearchBox);
       Assert.assertEquals(selectedBrandText, ReusableMethods.getFirstWordFromElement(productSearchPageElements.brandNameInSearchBox));
    }
}
