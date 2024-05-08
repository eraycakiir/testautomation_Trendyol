package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class categoryPage {
    public categoryPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\"]")
    public List <WebElement> chooseByCategoryList;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id=\"trendyol.com:id/imageCollapsibleBannerItem\"])")
    public List <WebElement> selectSubCategoryList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\"]")
    public List <WebElement> selectSubCategoryListForText;
    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id=\"trendyol.com:id/layoutCollapsibleBannerHeader\"])[1]")
    public  WebElement selectSubCategoryListForTextFirst;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\"]")
    public List  <WebElement> selectSubCategoryListForImage;
}
