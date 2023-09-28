package StepDefinitions;

import Pages.Locaters;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class _07_OrderAndPayment {

    Locaters pl = new Locaters();

    @When("User clicks on cart or Checkout button")
    public void userClicksOnCartOrCheckoutButton() {
        pl.myClick(pl.dresbtn);
        pl.myClick(pl.addToBtn);
        pl.myClick(pl.addToCartBtn);
        pl.myClick(pl.checkoutBtn);

    }

    @Then("User then selects an address")
    public void userThenSelectsAnAddress() {

        pl.myClick(pl.checkoutBtn2);
        pl.myClick(pl.checkoutBtn3);
    }

    @And("User ticks the post method and terms of service")
    public void userTicksThePostMethodAndTermsOfService() {

        pl.checkBoxBtn.sendKeys(Keys.SPACE);
    }

    @Then("User select proceeds with the payment process")
    public void userSelectProceedsWithThePaymentProcess() {

        pl.myClick(pl.checkoutBtn4);
    }

    @And("Payment via Paypal is selected and a warning message should appear")
    public void paymentViaPaypalIsSelectedAndAWarningMessageShouldAppear() {

        pl.myClick(pl.paypalBtn);
        Assert.assertTrue(pl.paypalErrorMsg.getText().contains("Please try again"));
        GWD.getDriver().navigate().back();
    }

    @Then("User then navigate back and clicks on Pay by Credit Card and the warning message should appear.")
    public void userThenNavigateBackAndClicksOnPayByCreditCardAndTheWarningMessageShouldAppear() {

        pl.myClick(pl.creditCartBtn);
        Assert.assertTrue(pl.creditCartErrorMsg.getText().contains("Invalid request"));
        GWD.getDriver().navigate().back();
    }

    @And("User navigate back and clicks on Bank payment")
    public void userNavigateBackAndClicksOnBankPayment() {

        pl.myClick(pl.bankCartBtn);
    }

    @Then("User sees that the total price equals the shipping price and taxes")
    public void userSeesThatTheTotalPriceEqualsTheShippingPriceAndTaxes() {

        double productsPrice = Double.parseDouble(pl.total1.getText().replaceAll("[^0-9.]", ""));

        pl.myClick(pl.checkoutBtn5);
        double productsPrice2 = Double.parseDouble(pl.total2.getText().replaceAll("[^0-9.]", ""));
        Assert.assertTrue(productsPrice == productsPrice2);
    }

    @And("The order number is recorded")
    public void orderNumberIsRecorded() {

        Assert.assertTrue(pl.message1.getText().contains("complete"));
        pl.myClick(pl.orderHistory);
        System.out.println("Your bank order number= " + pl.orderMessage.getText());

    }
}
