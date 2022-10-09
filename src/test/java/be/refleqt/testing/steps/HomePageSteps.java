package be.refleqt.testing.steps;

import be.refleqt.testing.pages.AbstractPage;
import be.refleqt.testing.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps extends AbstractPage {

    @Given("I navigate to url")
    public void iNavigateToUrl() {
        new HomePage().navigateToHomePage("http://automationpractice.com/index.php");
    }

    @When("I click on category dresses")
    public void iClickOnCategory(){
        new HomePage().clickOnCategory();
    }
}