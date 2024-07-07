package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;
import java.util.List;

public class productSearchPage {
    public productSearchPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver(), Duration.ofSeconds(25)), this);
    }

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"trendyol.com:id/recyclerViewSearchAutoComplete\"]/android.view.ViewGroup[1]\n")
    public WebElement firstElementForTheSearchedProduct;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"trendyol.com:id/filterView\"]/android.view.ViewGroup\n")
    public WebElement filterButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFilterTitle\"]")
    public List<WebElement> selectFilterOption;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/btnApplyFilter\"]\n")
    public WebElement applyFilterButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFilterTitle\" and @text=\"Marka \"]\n")

    public WebElement brandButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='trendyol.com:id/textViewFilterValue' ]\n")
    public List<WebElement> brandList;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFilterTexts\"]\n")
    public WebElement brandName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFilterTitle\" and @text=\"Fiyat \"]\n")
    public WebElement price;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='trendyol.com:id/editTextMinPrice' and @text='En Az']")
    public WebElement minPrice;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='trendyol.com:id/editTextMaxPrice' and @text='En Çok']")
    public WebElement maxPrice;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textView_state_layout_info_title\"]\n")
    public WebElement noResult;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Ara\"]\n")
    public WebElement brandNameInSearchBox;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewRelatedResults\"]\n")
    public WebElement relatedResults;


}









