package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.clockAndAccessoryPage;
import pages.mainPage;
import pages.myFavoritesPage;
import pages.productPage;
import utils.Driver;
import utils.HelperFunctions;

import java.util.List;
import java.util.Random;

public class _010AddingProductToFavoritesAndFilterText extends Driver {
    productPage productPageElement = new productPage();
    clockAndAccessoryPage clockAndAccessoryPageElement = new clockAndAccessoryPage();
    mainPage mainPageElements = new mainPage();
    myFavoritesPage myFavoritesPageElements = new myFavoritesPage();

    @Then("Click Categories And Control Enabled with and click category")
    public void clickCategoriesAndControlEnabledWithAndClickCategory(DataTable categoryTable) {
        Driver.Wait(5);
        List<String> categories = categoryTable.asList(String.class);
        for (String category : categories) {
            try {
                WebElement tab = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//android.widget.TextView[@resource-id='trendyol.com:id/textViewHomepageTab' and @text='" + category + "']")
                ));
                if (tab.isDisplayed() && tab.isEnabled()) {
                    tab.click();
                    System.out.println("Category: " + category + " is clicked and is enabled.");

                    // Burada belirli bir kategoriye ulaştığınızda döngüyü durdurun
                    if ("Saat & Aksesuar".equals(category)) {
                        System.out.println("Reached the target category 'Saat & Aksesuar', stopping the loop.");
                        break;
                    }
                } else {
                    System.out.println("Category: " + category + " is not clickable.");
                }
            } catch (Exception e) {
                System.out.println("Failed to interact with category: " + category + ". Error: " + e.getMessage());
            }
        }
    }

    @Then("Click on the Influencers' Choices Button")
    public void clickOnTheInfluencersChoicesButton() {
        clockAndAccessoryPageElement.choicesOfInfluncerButton.click();
    }

    @Then("Add Three Random Products to Favorites")
    public void addThreeRandomProductsToFavorites() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Driver.Wait(5);
            Random rand = new Random();
            int randomScroll = rand.nextInt(25 - 1 + 1) + 1; // 1 ile 25 arasında rastgele bir sayı üretir
            HelperFunctions.scroll(Driver.getDriver(), randomScroll);
            Driver.Wait(4);
            int randomProduct = rand.nextInt(productPageElement.addFavoriteList.size()); // Ürün listesinde rastgele bir ürün seçer
            System.out.println(randomProduct);
            productPageElement.addFavoriteList.get(randomProduct).click(); // Rastgele seçilen ürünü favorilere ekler
        }

    }

    @Then("Click to Favorites Button")
    public void clickToFavoritesButton() {
        mainPageElements.myFavoritesButton.click();
    }

    @And("Filter the Three added products with text and verify that they are the correct product.")
    public void filterTheThreeAddedProductsWithTextAndVerifyThatTheyAreTheCorrectProduct()
    {
        String[] brandTexts = new String[3];
        for (int i = 0; i < 3; i++) {
            brandTexts[i] = myFavoritesPageElements.brandList.get(i).getText();
            System.out.println(brandTexts[i]);
        }
        String firstBrandText = brandTexts[0];
        String secondBrandText = brandTexts[1];
        String thirdBrandText = brandTexts[2];

        myFavoritesPageElements.textSearch.click();
        myFavoritesPageElements.textSearch.sendKeys(firstBrandText);
        myFavoritesPageElements.textFilteredProduct.click();

        if(myFavoritesPageElements.textSearch.getText().equals(firstBrandText)){
            System.out.println("The first product is filtered correctly.");
        }
        myFavoritesPageElements.deleteTextButton.click();
        myFavoritesPageElements.textSearch.click();
        myFavoritesPageElements.textSearch.sendKeys(secondBrandText);
        myFavoritesPageElements.textFilteredProduct.click();
        if(myFavoritesPageElements.textSearch.getText().equals(secondBrandText)){
            System.out.println("The second product is filtered correctly.");
        }
        myFavoritesPageElements.deleteTextButton.click();
        myFavoritesPageElements.textSearch.click();
        myFavoritesPageElements.textSearch.sendKeys(thirdBrandText);
        myFavoritesPageElements.textFilteredProduct.click();
        if(myFavoritesPageElements.textSearch.getText().equals(thirdBrandText)){
            System.out.println("The third product is filtered correctly.");
        }
        myFavoritesPageElements.deleteTextButton.click();
    }
}
