package stepdefinations;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.mainPage;
import utils.Driver;

import java.util.List;

public class _009categoriesEnabledControl extends Driver {
    mainPage mainPageElements = new mainPage();
    @And("Click Categories And Control Enabled")
    public void clickCategoriesAndControlEnabled() {
        Driver.Wait(10);
        int visibleElements = 5;

        for (int index = 3; index <= visibleElements; index++) {
            // XPath ile görünür olan index'inci elemanı bul
            String xpath = String.format("(//androidx.appcompat.widget.LinearLayoutCompat[@resource-id='trendyol.com:id/linearLayoutButton'])[%d]", index);
            WebElement element = getDriver().findElement(By.xpath(xpath));

            // Elemente tıkla
            element.click();

            // Enabled kontrolü yap
            boolean isEnabled = element.isEnabled();
            System.out.println("Element " + index + " enabled: " + isEnabled);

            // Son elemana tıkladıktan sonra görünür eleman sayısını güncelle
            if (index == visibleElements) {
                // Listeyi tekrar sorgula ve yeni görünür eleman sayısını belirle
                List<WebElement> elements = getDriver().findElements(By.xpath("//androidx.appcompat.widget.LinearLayoutCompat[@resource-id='trendyol.com:id/linearLayoutButton']"));
                visibleElements = elements.size();

                // İndeksi resetle
                index = 1;
            }
        }
    }
}
