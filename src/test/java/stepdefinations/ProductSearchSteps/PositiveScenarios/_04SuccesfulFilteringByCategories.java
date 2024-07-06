package stepdefinations.ProductSearchSteps.PositiveScenarios;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.categoryPage;
import utils.ReusableMethods;

import java.util.Map;

import static stepdefinations.CartandPurchaseTransactions.PositiveScenarios._03findProductsFromCategoriesAndAddThemToTheCart.selectedCategory;

public class _04SuccesfulFilteringByCategories {
    static categoryPage categoryPageElements = new categoryPage();
    private static Map<String, By> categoryVerificationElements;

    /**
     * Verifies that the user sees a list of products within the selected category.
     */
    @Then("the user should see a list of products within the selected category")
    public void theUserShouldSeeAListOfProductsWithinTheSelectedCategory() {
        String selectedCategoryText = selectedCategory.getText();

        System.out.println("Selected category: " + selectedCategoryText);
        ReusableMethods.waitForSeconds(15);

        // Retrieve the verification element based on the selected category
        WebElement verificationElement = null;

        switch (selectedCategoryText) {
            case "Kadın":
                verificationElement = categoryPageElements.dressTextVerification;
                break;
            case "Erkek":
                verificationElement = categoryPageElements.suitTextVerification;
                break;
            case "Anne & Çocuk":
                verificationElement = categoryPageElements.babyTextVerification;
                break;
            case "Ev & Mobilya":
                verificationElement = categoryPageElements.kitchenTablewareTextVerification;
                break;
            case "Süpermarket":
                verificationElement = categoryPageElements.homeCleaningTextVerification;
                break;
            case "Kozmetik":
                verificationElement = categoryPageElements.makeupTextVerification;
                break;
            case "Saat & Aksesuar":
                verificationElement = categoryPageElements.watchTextVerification;
                break;
            case "Elektronik":
                verificationElement = categoryPageElements.smallHomeAppliancesTextVerification;
                break;
            case "Spor & Outdoor":
                verificationElement = categoryPageElements.sportsOutdoorTextVerification;
                break;
            case "Kitap & Kırtasiye & Hobi":
                verificationElement = categoryPageElements.hobbyTextVerification;
                break;
            default:
                throw new AssertionError("Unknown category: " + selectedCategoryText);
        }

        // Verification
        Assert.assertTrue("The category verification element is not displayed for category: " + selectedCategoryText, verificationElement.isDisplayed());
    }
}
