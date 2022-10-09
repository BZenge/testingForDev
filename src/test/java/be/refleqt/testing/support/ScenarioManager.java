package be.refleqt.testing.support;

import io.cucumber.java.Scenario;

import java.util.Collection;

public class ScenarioManager {
    private static Scenario scenario;

    public static Scenario getScenario() {
        return scenario;
    }

    public static void setScenario(Scenario scenario) {
        ScenarioManager.scenario = scenario;
    }

    public static Collection<String> getTagNames(){
        Scenario scenarioToTest = ScenarioManager.getScenario();
        return scenarioToTest.getSourceTagNames();
    }
}
