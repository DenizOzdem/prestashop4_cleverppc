package StepDefinitions;

import Pages.Locaters;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.apache.commons.lang3.RandomStringUtils;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_RegisterSteps {
    Locaters pl = new Locaters();
    String randomEmail;

    @Given("Navigate to Cleverppc")
    public void navigateToCleverppc() {
        GWD.getDriver().get("https://cleverppc.com/prestashop4/");
    }

    @When("Click to sign in")
    public void clickToSignIn() {
        pl.myClick(pl.signIn);
    }

    @And("Sendkeys email")
    public void sendkeysEmail(DataTable dt) {
        List<String> email = dt.asList(String.class);

        for (int i = 0; i < email.size(); i++) {
            randomEmail = RandomStringUtils.randomAlphabetic(5).concat("@gmail.com");
            pl.mySendKeys(pl.createAccount, randomEmail);
        }

    }

    @And("Click to create an account button")
    public void clickToCreateAnAccountButton(DataTable dt) {
        List<String> createAccountBtn = dt.asList(String.class);

        for (int i = 0; i < createAccountBtn.size(); i++) {
            WebElement linkWebElement = pl.getWebElement(createAccountBtn.get(i));
            pl.myClick(linkWebElement);
        }
    }

    @And("Send keys in denizLocators")
    public void sendKeysInDenizLocators(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement e = pl.getWebElement(items.get(i).get(0));
            String bilgi = items.get(i).get(1);
            pl.mySendKeys(e, bilgi);
        }
    }

    @And("Sendkeys Registeremail")
    public void sendkeysRegisteremail(DataTable dt) {
        List<String> email = dt.asList(String.class);

        for (int i = 0; i < email.size(); i++) {
            pl.mySendKeys(pl.eMail,randomEmail);
        }
    }

    @And("Click to register button")
    public void clickToRegisterButton(DataTable dt) {
        List<String> registerBtn = dt.asList(String.class);

        for (int i = 0; i < registerBtn.size(); i++) {
            WebElement linkWebElement = pl.getWebElement(registerBtn.get(i));
            pl.myClick(linkWebElement);
        }
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        pl.verifyContainsText(pl.successMsg, "has been created");
    }

}
