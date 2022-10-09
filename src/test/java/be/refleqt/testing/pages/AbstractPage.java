package be.refleqt.testing.pages;
import be.refleqt.testing.support.DriverManager;
import be.refleqt.testing.support.WaitFunctions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AbstractPage {
    protected final WebDriver driver;

    public AbstractPage() {
        this.driver = DriverManager.getWebDriver();
    }

    protected WaitFunctions waitFor(WebElement webElement) {
        return new WaitFunctions(driver, webElement);
    }
}