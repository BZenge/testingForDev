package be.refleqt.testing.steps;

import be.refleqt.testing.pages.AbstractPage;
import be.refleqt.testing.support.ScenarioManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static be.refleqt.testing.support.DriverManager.createWebdriver;
import static be.refleqt.testing.support.DriverManager.quitWebDriver;

public class CommonSteps extends AbstractPage {

    @Before
    public void beforeScenario(Scenario scenario) {
        ScenarioManager.setScenario(scenario);
        createWebdriver();
    }

    @After
    public void afterScenario() {
        quitWebDriver();
    }
}
