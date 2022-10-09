package be.refleqt.testing.steps;

import be.refleqt.testing.pages.AbstractPage;
import be.refleqt.testing.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps extends AbstractPage {

    @Then("I successfully received the added to cart pop up")
    public void iSuccessfullyReceivedAddedToCartPopup() {
        assertThat(new CartPage().successfullyReceivedCartPopUp()).isEqualTo(true);
    }

    @Then("I successfully land on the cart page")
    public void iSuccessfullyLandOnCartPage(){
        assertThat(new CartPage().successfullyLandOnCartPage()).isEqualTo(true);
    }

    @When("I click on proceed to checkout button")
    public void iProceedToCheckout(){
        new CartPage().proceedToCheckout();
    }


}