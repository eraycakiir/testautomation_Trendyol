package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class myFavoritesPage {
    public myFavoritesPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFavoriteItemDescription\"]")
    public List<WebElement> favoritesList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFavoriteItemBrand\"]")
    public List<WebElement> brandList;

    @AndroidFindBy(xpath = "//androidx.cardview.widget.CardView[@content-desc=\"Düzenle\"]\n")
    public WebElement chooseProduct;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/edittext_search_view\"]\n")
    public WebElement clickSearchArea;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/editTextSearch\"]\n")
    public WebElement writeProductName;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"trendyol.com:id/edittext_search_view\"]\n")
    public WebElement writedProduct;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textLeftUp\"]\n")
    public WebElement favoritesText;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageview_action_end\"]\n")
    public WebElement deleteTextButton;
}
