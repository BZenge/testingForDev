package be.refleqt.testing.steps;

import be.refleqt.testing.pages.AbstractPage;
import be.refleqt.testing.pages.ProductListPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;


public class ProductListSteps extends AbstractPage {

    @Then("I successfully land on the product list page")
    public void iLandedOnFilteredSearchPLP() {
        assertThat(new ProductListPage().successfullyLandedOnPLP()).isEqualTo(true);
    }

    @When("I change the product view")
    public void iChangeProductView(){
        new ProductListPage().changeProductView();
    }

    @When("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductListPage().clickOnAddToCartButton();
    }
}