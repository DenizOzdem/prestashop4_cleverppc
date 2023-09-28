package StepDefinitions;

import Pages.Locaters;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class _05_ControlList {
    Locaters pl = new Locaters();

    @When("User Clicks on the dresses category")
    public void userClicksOnTheDressesCategory() {

        pl.myClick(pl.dressesBtn);

    }

    @Then("Validating the number at the top of the list")
    public void validatingTheNumberAtTheTopOfTheList() {
        Assert.assertTrue(pl.ustList.getText().contains("5"));
    }


    @And("Validating the number at the buttom of the list")
    public void validatingTheNumberAtTheButtomOfTheList() {
        Assert.assertTrue(pl.altList.getText().contains("5"));
    }

    @Then("Check the number by counting list products")
    public void checkTheNumberByCountingListProducts() {
        Assert.assertTrue(pl.urunSayi.size()==5);
    }
}
