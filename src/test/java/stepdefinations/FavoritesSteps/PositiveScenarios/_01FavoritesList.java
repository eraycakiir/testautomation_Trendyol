package stepdefinations.FavoritesSteps.PositiveScenarios;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.mainPage;
import pages.myFavoritesPage;
import utils.Driver;
import utils.ReusableMethods;

public class _01FavoritesList {
    myFavoritesPage myFavoritesPageElements = new myFavoritesPage();
    mainPage mainPageElements = new mainPage();
    @When("Click to My Favorites")
    public void clickToMyFavorites() {
        mainPageElements.myFavoritesButton.click();
        Driver.Wait(2);
    }

    @When("Learn the Number of Products in My Favorites List")
    public void learnTheNumberOfProductsInMyFavoritesList() throws InterruptedException {
        ReusableMethods.scrollAndCountProducts(Driver.getDriver(),myFavoritesPageElements.favoritesList);
    }

    @When("Click to Choose Product Button")
    public void clickToChooseProductButton() {
        myFavoritesPageElements.chooseProduct.click();
        Driver.Wait(2);
    }

    @And("Verification Quantity of Product")
    public void verificationQuantityOfProduct() {
        String text = myFavoritesPageElements.favoritesText.getText();
        int numberOfProducts = ReusableMethods.extractNumberFromText(text);
        if (ReusableMethods.productCount == numberOfProducts) {
            System.out.println("Test Basarili");
        }

    }
}
