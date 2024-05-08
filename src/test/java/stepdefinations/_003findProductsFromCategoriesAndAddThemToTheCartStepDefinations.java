package stepdefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.cartPage;
import pages.categoryPage;
import pages.mainPage;
import pages.productPage;
import utils.Driver;
import utils.HelperFunctions;

import java.util.Random;


public class _003findProductsFromCategoriesAndAddThemToTheCartStepDefinations {
    mainPage mainPageElements = new mainPage();
    categoryPage categoryPageElements = new categoryPage();
    productPage productPageElements = new productPage();
    cartPage cartPageElements = new cartPage();
    HelperFunctions helperFunctions = new HelperFunctions();

    @Then("Click to All Categories button")
    public void clickToAllCategoriesButton() {
        mainPageElements.categoriesButton.click();
        Driver.Wait(5);
    }
    @Then("Select Category")
    public void selectCategory() {
        Driver.Wait(5);
        Random random = new Random();
        int randomChooseCategory = random.nextInt(9);
        WebElement selectedRandomChooseCategory = categoryPageElements.chooseByCategoryList.get(randomChooseCategory);
        selectedRandomChooseCategory.click();
    }


    @Then("Select Sub Category for Text List")
    public void selectSubCategoryForTextList() {
        Driver.Wait(2);
        categoryPageElements.selectSubCategoryListForTextFirst.click();
        Random random = new Random();
        int randomChooseSubCategoryTextList;
        do {
            randomChooseSubCategoryTextList = random.nextInt(categoryPageElements.selectSubCategoryListForText.size());
        } while (randomChooseSubCategoryTextList < 9);

        WebElement selectedRandomChooseSubCategory = categoryPageElements.selectSubCategoryListForText.get(randomChooseSubCategoryTextList);
        selectedRandomChooseSubCategory.click();

    }
    @Then("Select Sub Category for Image List")
    public void selectSubCategoryForImageList() {

        Driver.Wait(2);
        Random random = new Random();
        int randomChooseSubCategoryImageList = random.nextInt(categoryPageElements.selectSubCategoryListForImage.size());
        WebElement selectedRandomChooseSubCategory = categoryPageElements.selectSubCategoryListForImage.get(randomChooseSubCategoryImageList);
        selectedRandomChooseSubCategory.click();

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
