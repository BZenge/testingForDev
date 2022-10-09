package be.refleqt.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage extends AbstractPage {

    @FindBy(css = ".category-name")
    private WebElement filteredSearch;

    @FindBy(css = ".icon-th-list")
    private WebElement list;

    @FindBy(css = "a[title='Add to cart']")
    private List<WebElement> addToCartList;

    public ProductListPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean successfullyLandedOnPLP() {
        return waitFor(filteredSearch).toBeDisplayed().isDisplayed();
    }

    public void changeProductView() {
        list.click();
    }

    public void clickOnAddToCartButton() {
        addToCartList.get(0).click();
    }
}