package be.refleqt.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage extends AbstractPage {

    @FindBy(css = ".category-name")
    private WebElement filteredSearch;

    public ProductListPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean successfullyLandedOnPLP() {
        return waitFor(filteredSearch).toBeDisplayed().isDisplayed();
    }
}