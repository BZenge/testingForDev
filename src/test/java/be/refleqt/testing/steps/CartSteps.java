package be.refleqt.testing.steps;

import be.refleqt.testing.pages.AbstractPage;
import be.refleqt.testing.pages.CartPage;
import io.cucumber.java.en.Then;

import static org.assertj.core.api.Assertions.assertThat;

public class CartSteps extends AbstractPage {

    @Then("I successfully received the added to cart pop up")
    public void iSuccessfullyReceivedAddedToCartPopup() {
        assertThat(new CartPage().successfullyReceivedCartPopUp()).isEqualTo(true);
    }
}