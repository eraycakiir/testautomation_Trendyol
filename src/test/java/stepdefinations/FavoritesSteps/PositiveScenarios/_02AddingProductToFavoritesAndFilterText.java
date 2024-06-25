package stepdefinations.FavoritesSteps.PositiveScenarios;

import com.google.common.collect.ImmutableMap;
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
import utils.ReusableMethods;
import java.util.List;
import java.util.Random;

public class _02AddingProductToFavoritesAndFilterText extends Driver {
    productPage productPageElement = new productPage();
    clockAndAccessoryPage clockAndAccessoryPageElement = new clockAndAccessoryPage();
    mainPage mainPageElements = new mainPage();
    myFavoritesPage myFavoritesPageElements = new myFavoritesPage();

    @Then("Click Categories And Control Enabled with and click category")
    public void clickCategoriesAndControlEnabledWithAndClickCategory(DataTable categoryTable) {
        Driver.Wait(3);
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
            ReusableMethods.scroll(Driver.getDriver(), randomScroll);
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
    public void filterTheThreeAddedProductsWithTextAndVerifyThatTheyAreTheCorrectProduct() {
        String[] brandTexts = new String[3];

        for (int i = 0; i < 3; i++) {
            brandTexts[i] = myFavoritesPageElements.brandList.get(i).getText();
            System.out.println(brandTexts[i]);
        }

        for (String brandText : brandTexts) {
            myFavoritesPageElements.clickSearchArea.click();
            myFavoritesPageElements.writeProductName.sendKeys(brandText);
            getDriver().executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
            Wait(4); // Arama sonuçlarının gelmesini beklemek için

            if (myFavoritesPageElements.writedProduct.getText().equals(brandText)) {
                System.out.println(brandText + " is filtered correctly.");
            } else {
                System.out.println("Error: " + brandText + " is not filtered correctly.");
            }

            myFavoritesPageElements.deleteTextButton.click();
        }
    }

}
