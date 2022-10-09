package be.refleqt.testing.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class WaitFunctions {

    private final WebDriverWait wait;

    private WebElement webElement;
    private Duration waitTimeout = Duration.ofSeconds(60);

    private static final Logger LOG = LoggerFactory.getLogger(WaitFunctions.class);

    public WaitFunctions(WebDriver driver, WebElement webElement) {
        this.wait = new WebDriverWait(driver, waitTimeout);
        setAndCheckWebElement(webElement);
    }

    public WebElement toBeDisplayed() {
        LOG.info("Waiting {} second for element [{}] to be displayed.", this.waitTimeout.getSeconds(), this.webElement);
        untilCondition(driver -> this.webElement.isDisplayed());
        return webElement;
    }

    public <E> E untilCondition(ExpectedCondition<E> expectedCondition) {
        return wait.until(expectedCondition);
    }

    private void setAndCheckWebElement(WebElement webElement) {
        if (webElement != null) {
            this.webElement = webElement;
        } else {
            LOG.error("Web element is null");
            throw new IllegalArgumentException("Web element is null.");
        }
    }
}
