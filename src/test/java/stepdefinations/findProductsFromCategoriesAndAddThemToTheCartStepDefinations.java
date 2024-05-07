package stepdefinations;


import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.categoryPage;
import pages.mainPage;
import pages.productPage;
import utils.Driver;
import utils.HelperFunctions;

import java.time.Duration;
import java.util.Random;

import static utils.Driver.getDriver;


public class findProductsFromCategoriesAndAddThemToTheCartStepDefinations {
    mainPage mainPageElements = new mainPage();
    categoryPage categoryPageElements = new categoryPage();
    productPage productPageElements = new productPage();
    HelperFunctions helperFunctions = new HelperFunctions();

    @Then("Click to All Categories button")
    public void clickToAllCategoriesButton() {
        mainPageElements.categoriesButton.click();
        Driver.Wait(5);
    }

    @Then("Select Category {string}")
    public void selectCategory(String categoryName) {
        Driver.Wait(5);
        for (WebElement element : categoryPageElements.chooseByCategoryList) {
            if (element.getText().equals(categoryName)) {
                element.click();
                break;
            }
        }

    }

    @Then("Select Sub Category {int}")
    public void selectSubCategory(int index) {
        Driver.Wait(5);
        int currentIndex = 0;
        for (WebElement element : categoryPageElements.selectSubCategoryList) {
            if (currentIndex == index) {
                element.click();
                break;
            }
            currentIndex++;
        }
        if (currentIndex != index) {
            System.out.println("Invalid index: " + index);
        }
    }

    @Then("Select the Product")
    public void selectTheProduct() throws InterruptedException {
        Driver.Wait(5);
        Random rand = new Random();
        int randomScroll = rand.nextInt(25 - 1 + 1) + 1;
        helperFunctions.scroll(Driver.getDriver(), randomScroll);

        Driver.Wait(4);
        int randomProduct = rand.nextInt(productPageElements.allProductsList.size());
        System.out.println(randomProduct);
        productPageElements.allProductsList.get(randomProduct).click();

    }

    @Then("Add To Cart")
    public void addToCart() {
        System.out.println("hey");
    }

    @Then("Go to Cart")
    public void goToCart() {
        System.out.println("hey");
    }

    @Then("Check that the price is correct when the number of products increases")
    public void checkThatThePriceIsCorrectWhenTheNumberOfProductsIncreases() {
        System.out.println("hey");
    }

    @And("Click to Trash Button for delete all products in Cart")
    public void clickToTrashButtonForDeleteAllProductsInCart() {
        System.out.println("hey");
    }


}
