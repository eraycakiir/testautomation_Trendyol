package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class mainPage {
    public mainPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"trendyol.com:id/navigation_bar_item_icon_view\"])[5]\n")
    public WebElement myAccountBox;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Ara\"]\n")
    public WebElement productSearchTextBox;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Favorilerim\"]\n")
    public WebElement myFavoritesButton;
    @AndroidFindBy(xpath = "(//androidx.appcompat.widget.LinearLayoutCompat[@resource-id=\"trendyol.com:id/linearLayoutButton\"])[1]\n")
    public WebElement categoriesButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Fırsat Ürünleri\"]\n")
    public WebElement opportunityProductsButton;
    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@resource-id=\"trendyol.com:id/homeSectionLinearLayout\"])")
    public WebElement categoriesList;
  


}
