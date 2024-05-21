package stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;
import java.util.List;

public class _009categoriesEnabledControl extends Driver {
    @And("Click Categories And Control Enabled with:")
    public void clickCategoriesAndControlEnabled(DataTable categoryTable) {
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
                } else {
                    System.out.println("Category: " + category + " is not clickable.");
                }
            } catch (Exception e) {
                System.out.println("Failed to interact with category: " + category + ". Error: " + e.getMessage());
            }
        }
    }
}