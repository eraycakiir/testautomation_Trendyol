package stepdefinations;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import pages.categoryPage;
import pages.mainPage;
import pages.productPage;
import utils.Driver;

import java.util.Random;

public class findProductsFromCategoriesAndAddThemToTheCartStepDefinations {
    mainPage mainPageElements = new mainPage();
    categoryPage categoryPageElements = new categoryPage();
    productPage productPageElements = new productPage();
    @Then("Click to All Categories button")
    public void clickToAllCategoriesButton() {
        mainPageElements.categoriesButton.click();
        Driver.Wait(5);
    }
    @Then("Select Category {string}")
    public void selectCategory(String categoryName) {
        Driver.Wait(5);
        for (WebElement element : categoryPageElements.chooseByCategoryList)
        {
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
    public void selectTheProduct() {
        Driver.Wait(5);
        // Rastgele scroll yapma işlemi
        Dimension size = Driver.getDriver().manage().window().getSize();
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.80);
        int endY = (int) (size.height * 0.20);

        for (int i = 0; i < new Random().nextInt(5) + 1; i++) {
            new TouchAction(Driver.getDriver())
                    .press(PointOption.point(startX, startY))
                    .waitAction()
                    .moveTo(PointOption.point(startX, endY))
                    .release()
                    .perform();
            Driver.Wait(4); // Bekleme süresi
        }
        if (!productPageElements.allProductsList.isEmpty()) {
            int randomIndex = new Random().nextInt(productPageElements.allProductsList.size());
            productPageElements.allProductsList.get(randomIndex).click();
        } else {
            System.out.println("Ürün listesi boş.");
        }
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
