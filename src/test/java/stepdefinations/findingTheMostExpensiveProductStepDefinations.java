package stepdefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.mainPage;
import pages.productPage;
import pages.productSearchPage;
import utils.Driver;

public class findingTheMostExpensiveProductStepDefinations {
    mainPage mainPageElements = new mainPage();
    productSearchPage productSearchPageElements = new productSearchPage();
    productPage productPageElements = new productPage();
    @When("Click to product search text box")
    public void clickToProductSearchTextBox() {
        mainPageElements.productSearchTextBox.click();
    }

    @When("Writing product name")
    public void writingProductName() {
        mainPageElements.productSearchTextBox.sendKeys("Bilgisayar");
    }

    @When("Click to product")
    public void clickToProduct() {
        productSearchPageElements.firstElementForTheSearchedProduct.click();
    }

    @When("Click to SortBy button")
    public void clickToSortByButton() {
        productPageElements.sortByButton.click();
    }

    @And("Choose the SortBy Options {string}")
    public void chooseThe(String optionText) {
        System.out.println(optionText);
        for (WebElement element : productPageElements.sortByOptionsList)
        {
            if (element.getText().equals(optionText)) {
                element.click();
                break;
            }
        }
    }

}
