package stepdefinations.CartandPurchaseTransactions.PositiveScenarios;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.cartPage;
import pages.categoryPage;
import pages.mainPage;
import pages.productPage;
import utils.Driver;
import utils.ReusableMethods;

import java.util.Random;


public class _03findProductsFromCategoriesAndAddThemToTheCart {
    mainPage mainPageElements = new mainPage();
    categoryPage categoryPageElements = new categoryPage();
    productPage productPageElements = new productPage();
    cartPage cartPageElements = new cartPage();
    ReusableMethods helperFunctions = new ReusableMethods();
    public  static   WebElement selectedCategory;

    @Then("Click to All Categories button")
    public void clickToAllCategoriesButton() {
        mainPageElements.categoriesButton.click();
        Driver.Wait(5);
    }

    @Then("Select Category")
    public void selectCategory() {
        Driver.Wait(5);
        selectedCategory = ReusableMethods.selectRandomElement(categoryPageElements.chooseByCategoryList.subList(0, 9));
        selectedCategory.click();
    }

    @Then("Select Sub Category for Text List")
    public void selectSubCategoryForTextList() {
        Driver.Wait(2);
        categoryPageElements.selectSubCategoryListForTextFirst.click();
        WebElement selectedSubCategory;
        do {
            selectedSubCategory = ReusableMethods.selectRandomElement(categoryPageElements.selectSubCategoryListForText);
        } while (categoryPageElements.selectSubCategoryListForText.indexOf(selectedSubCategory) < 9);
        selectedSubCategory.click();
    }

    @Then("Select Sub Category for Image List")
    public void selectSubCategoryForImageList() {
        Driver.Wait(2);
        WebElement selectedSubCategory = ReusableMethods.selectRandomElement(categoryPageElements.selectSubCategoryListForImage);
        selectedSubCategory.click();
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
        productPageElements.addToCart.click();
        if(productPageElements.addToCart.isEnabled()){
            productPageElements.addToCart.click();
        }

    }

    @Then("Go to Cart")
    public void goToCart() {
        productPageElements.goToCart.click();
    }

    @Then("Check that the price is correct when the number of products increases")
    public void checkThatThePriceIsCorrectWhenTheNumberOfProductsIncreases() {
        String firstPriceText = cartPageElements.normalPrice.getText();
        double firstPrice = helperFunctions.extractPrice(firstPriceText);

        cartPageElements.addButton.click();

        String secondPriceText = cartPageElements.normalPrice.getText();
        double secondPrice = helperFunctions.extractPrice(secondPriceText);
        if (secondPrice == firstPrice * 2) {
            System.out.println("Price is correct");
        }
        cartPageElements.subTractButton.click();
        String thirdPriceText = cartPageElements.normalPrice.getText();
        double thirdPrice = helperFunctions.extractPrice(thirdPriceText);
        if (thirdPrice == firstPrice) {
            System.out.println("Price is correct");
        }
    }

    @And("Click to Trash Button for delete all products in Cart")
    public void clickToTrashButtonForDeleteAllProductsInCart() {
        cartPageElements.deleteButton.click();
        Driver.Wait(2);
        cartPageElements.deleteButtonAction.click();
    }

}
