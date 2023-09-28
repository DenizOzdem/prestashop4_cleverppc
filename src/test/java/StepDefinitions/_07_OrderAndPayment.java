package StepDefinitions;

import Pages.korhanLocater;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class _07_OrderAndPayment {

    korhanLocater k=new korhanLocater();

//    @Given("Navigate to Cleverppc")
//    public void navigateToCleverppc() {
//        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
//    }
//
//
//    @When("Click to sign in and enter valid email and password and click sign in")
//    public void clickToSignInAndEnterValidEmailAndPasswordAndClickSignIn() {
//        k.myClick(k.signIn);
//        k.mySendKeys(k.emailBox, "k@gmail.com");
//        k.mySendKeys(k.passwordBox, "2430177");
//        k.myClick(k.signInButton);
//    }
//
//
//    @Then("User should login successfully")
//    public void userShouldLoginSuccessfully() {
//        k.verifyContainsText(k.signOut, "out");
//    }


    @When("User clicks on cart or Checkout button")
    public void userClicksOnCartOrCheckoutButton() {
        k.myClick(k.dresbtn);
        k.myClick(k.addToBtn);
        k.myClick(k.addToCartBtn);
        k.myClick(k.checkoutBtn);

    }

    @Then("User then selects an address")
    public void userThenSelectsAnAddress() {

        k.myClick(k.checkoutBtn2);
        k.myClick(k.checkoutBtn3);
    }

    @And("User ticks the post method and terms of service")
    public void userTicksThePostMethodAndTermsOfService() {

        k.checkBoxBtn.sendKeys(Keys.SPACE);
    }

    @Then("User select proceeds with the payment process")
    public void userSelectProceedsWithThePaymentProcess() {

        k.myClick(k.checkoutBtn4);
    }

    @And("Payment via Paypal is selected and a warning message should appear")
    public void paymentViaPaypalIsSelectedAndAWarningMessageShouldAppear() {

        k.myClick(k.paypalBtn);
        Assert.assertTrue(k.paypalErrorMsg.getText().contains("tekrar deneyin"));
        GWD.getDriver().navigate().back();
    }

    @Then("User then navigate back and clicks on Pay by Credit Card and the warning message should appear.")
    public void userThenNavigateBackAndClicksOnPayByCreditCardAndTheWarningMessageShouldAppear() {

        k.myClick(k.creditCartBtn);
        Assert.assertTrue(k.creditCartErrorMsg.getText().contains("Invalid request"));
        GWD.getDriver().navigate().back();
    }

    @And("User navigate back and clicks on Bank payment")
    public void userNavigateBackAndClicksOnBankPayment() {

        k.myClick(k.bankCartBtn);
    }

    @Then("User sees that the total price equals the shipping price and taxes")
    public void userSeesThatTheTotalPriceEqualsTheShippingPriceAndTaxes() {

        double productsPrice = Double.parseDouble(k.total1.getText().replaceAll("[^0-9.]", ""));

        k.myClick(k.checkoutBtn5);
        double productsPrice2 = Double.parseDouble(k.total2.getText().replaceAll("[^0-9.]", ""));
        Assert.assertTrue(productsPrice == productsPrice2);
    }

    @And("The order number is recorded")
    public void orderNumberIsRecorded() {

        Assert.assertTrue(k.message.getText().contains("complete"));
        k.myClick(k.orderHistory);
        System.out.println("Your bank order number= " + k.orderMessage.getText());

    }
}
