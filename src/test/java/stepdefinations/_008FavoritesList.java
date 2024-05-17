package stepdefinations;

import io.cucumber.java.en.When;
import pages.mainPage;
import pages.myFavoritesPage;
import utils.Driver;
import utils.HelperFunctions;

public class _008FavoritesList {
    myFavoritesPage myFavoritesPageElements = new myFavoritesPage();
    mainPage mainPageElements = new mainPage();
    @When("Click to My Favorites")
    public void clickToMyFavorites() {
        mainPageElements.myFavoritesButton.click();
        Driver.Wait(2);
    }

    @When("Learn the Number of Products in My Favorites List")
    public void learnTheNumberOfProductsInMyFavoritesList() throws InterruptedException {
        HelperFunctions.scrollAndCountProducts(Driver.getDriver(),myFavoritesPageElements.favoritesList);
    }
}
