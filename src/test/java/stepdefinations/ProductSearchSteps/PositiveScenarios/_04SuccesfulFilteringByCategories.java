package stepdefinations.ProductSearchSteps.PositiveScenarios;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.categoryPage;
import utils.Driver;

import java.util.HashMap;
import java.util.Map;

import static stepdefinations.CartandPurchaseTransactions.PositiveScenarios._03findProductsFromCategoriesAndAddThemToTheCart.selectedCategory;

public class _04SuccesfulFilteringByCategories {
    static categoryPage categoryPageElements = new categoryPage();
    private static Map<String, By> categoryVerificationElements;


    static {
        categoryVerificationElements = new HashMap<>();
        categoryVerificationElements.put("Kadın", By.id(categoryPageElements.elbiseTextVerification.getText()));
        categoryVerificationElements.put("Erkek",By.id(categoryPageElements.takımElbiseTextVerification.getText()) );
        categoryVerificationElements.put("Anne & Çocuk",By.id(categoryPageElements.bebekTextVerification.getText()) );
        categoryVerificationElements.put("Ev & Mobilya", By.id(categoryPageElements.sofraTextVerification.getText()));
        categoryVerificationElements.put("Süpermarket",By.id(categoryPageElements.evTemizlikTextVerification.getText()));
        categoryVerificationElements.put("Kozmetik",By.id(categoryPageElements.makyajTextVerification.getText()) );
        categoryVerificationElements.put("Saat & Aksesuar",By.id(categoryPageElements.saatTextVerification.getText()));
        categoryVerificationElements.put("Elektronik",By.id(categoryPageElements.küçükEvAletleriTextVerification.getText()) );
        categoryVerificationElements.put("Spor & Outdoor",By.id(categoryPageElements.sporOutdorTextVerification.getText()));
        categoryVerificationElements.put("Kitap & Kırtasiye & Hobi",By.id(categoryPageElements.hobiTextVerification.getText()) );
    }
    @Then("the user should see a list of products within the selected category")
    public void theUserShouldSeeAListOfProductsWithinTheSelectedCategory() {
        // Seçilen kategorinin textini al
        String selectedCategoryText = selectedCategory.getText();

        // Doğrulama elementini al
        By verificationElementLocator = categoryVerificationElements.get(selectedCategoryText);
        WebElement verificationElement = Driver.getDriver().findElement(verificationElementLocator);

        // Doğrulama
        Assert.assertTrue("The category verification element is not displayed!", verificationElement.isDisplayed());
    }
}
