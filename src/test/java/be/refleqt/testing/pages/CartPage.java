package be.refleqt.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends AbstractPage{

    @FindBy(css="a[title='Proceed to checkout']")
    private WebElement addedToCart;

    public CartPage(){
        PageFactory.initElements(driver, this);
    }

    public boolean successfullyReceivedCartPopUp(){
        return waitFor(addedToCart).toBeDisplayed().isDisplayed();
    }
}