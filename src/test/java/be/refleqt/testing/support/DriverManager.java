package be.refleqt.testing.support;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {
    private static final Object DEFAULT_DOWNLOAD_DIRECTORY = System.getProperty("user.dir") + "/src/test/resources/files/";

    private static WebDriver driver;

    public static void createWebdriver() {
        prepareWebDriver();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    public static void quitWebDriver() {
        driver.quit();
    }

    private static void prepareWebDriver() {
        driver = new ChromeDriver();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", DEFAULT_DOWNLOAD_DIRECTORY);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        if ("true".equals(System.getProperty("headless", "false"))) {
            options.addArguments("--headless");
        }
        driver.manage().window().setSize(new Dimension(1920, 1080));
    }
}
