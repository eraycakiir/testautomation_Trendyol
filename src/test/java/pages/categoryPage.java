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

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\"]")
    public List <WebElement> selectSubCategoryListForText;
    @AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id=\"trendyol.com:id/layoutCollapsibleBannerHeader\"])[1]")
    public  WebElement selectSubCategoryListForTextFirst;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\"]")
    public List  <WebElement> selectSubCategoryListForImage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\" and @text=\"Elbise\"]\n")
    public WebElement dressTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\" and @text=\"Takım Elbise\"]\n")
    public WebElement suitTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Bebek\"]\n")
    public WebElement babyTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Sofra & Mutfak\"]\n")
    public WebElement kitchenTablewareTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Ev & Temizlik\"]\n")
    public WebElement homeCleaningTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Makyaj\"]\n")
    public WebElement makeupTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/titleCollapsibleBannerItem\" and @text=\"Saat\"]\n")
    public WebElement watchTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Küçük Ev Aletleri\"]\n")
    public WebElement smallHomeAppliancesTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Spor & Outdoor\"]\n")
    public WebElement sportsOutdoorTextVerification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewTitle\" and @text=\"Hobi\"]\n")
    public WebElement hobbyTextVerification;

}
