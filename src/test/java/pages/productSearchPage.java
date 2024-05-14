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
    public WebElement  firstElementForTheSearchedProduct;
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id=\"trendyol.com:id/filterView\"]/android.view.ViewGroup\n")
    public WebElement  filterButton;
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"trendyol.com:id/textViewFilterTitle\"]")
    public List <WebElement> selectFilterOption;
    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id=\"trendyol.com:id/btnApplyFilter\"]\n")
    public WebElement applyFilterButton;


}
