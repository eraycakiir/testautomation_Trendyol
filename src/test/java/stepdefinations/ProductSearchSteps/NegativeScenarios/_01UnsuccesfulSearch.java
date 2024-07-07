package stepdefinations.ProductSearchSteps.NegativeScenarios;

import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.mainPage;
import pages.productSearchPage;
import utils.ReusableMethods;

import java.util.NoSuchElementException;

import static utils.Driver.driver;

public class _01UnsuccesfulSearch {
    mainPage mainPageElements = new mainPage();
    productSearchPage productSearchPageElements = new productSearchPage();

    @When("the user enters invalid or nonsensical keywords into the search bar")
    public void theUserEntersInvalidOrNonsensicalKeywordsIntoTheSearchBar() {
        mainPageElements.productSearchTextBox.click();
        mainPageElements.productSearchTextBox.sendKeys("randksldanlsd21w.");
        ReusableMethods.waitForSeconds(4);
        try {
            if (productSearchPageElements.relatedResults.isDisplayed()) {
                System.out.println("Test failed: Element is displayed.");
            } else {
                System.out.println("Test passed: Element is not displayed.");
            }
        } catch (NoSuchElementException e) {
            System.out.println("Test passed: NoSuchElementException caught, element not found.");
        }
    }
}
