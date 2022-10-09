package be.refleqt.testing.steps;

import be.refleqt.testing.pages.AbstractPage;
import be.refleqt.testing.pages.ProductListPage;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;


public class ProductListSteps extends AbstractPage {

    @Then("I successfully land on the product list page")
    public void iLandedOnFilteredSearchPLP(){
        assertThat(new ProductListPage().successfullyLandedOnPLP()).isEqualTo(true);
    }
}