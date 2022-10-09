package be.refleqt.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage {

    @FindBy(css = "#block_top_menu > ul:nth-child(2) > li:nth-of-type(2) .sf-with-ul")
    private WebElement categoryDress;

    @FindBy(css = "#block_top_menu li:nth-of-type(3) [title='T-shirts']")
    private WebElement categoryTshirts;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToHomePage(String url) {
        driver.navigate().to(url);
    }

    public void clickOnCategory(String catType) {
        if (catType.toLowerCase().contains("dresses")) {
            categoryDress.click();
        } else if (catType.toLowerCase().contains("tshirt")) {
            categoryTshirts.click();
        }
    }
}