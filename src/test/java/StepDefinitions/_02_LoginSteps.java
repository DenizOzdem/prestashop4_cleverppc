package StepDefinitions;

import Pages.Locaters;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class _02_LoginSteps {
    Locaters pl = new Locaters();
    @When("Send keys email as {string} password as {string}")
    public void sendKeysEmailAsPasswordAs(String useremail, String userpassword) {
        pl.mySendKeys(pl.userEmail, useremail);
        pl.mySendKeys(pl.userPassword, userpassword);
        pl.myClick(pl.userSignInBtn);
    }

    @Then("Fail message should be displayed")
    public void failMessageShouldBeDisplayed() {
        pl.verifyContainsText(pl.failMsg,"failed");
    }

    @Then("Password required message should be displayed")
    public void passwordRequiredMessageShouldBeDisplayed() {

        pl.verifyContainsText(pl.passwordRequiredMsg,"Password is required");
    }

    @Then("Email required message should be displayed")
    public void emailRequiredMessageShouldBeDisplayed() {
        pl.verifyContainsText(pl.emailRequiredMsg,"email address required");
    }

    @Then("Welcome message should be displayed")
    public void welcomeMessageShouldBeDisplayed() {

        pl.verifyContainsText(pl.welcomeMsg, "Welcome");
    }


}
