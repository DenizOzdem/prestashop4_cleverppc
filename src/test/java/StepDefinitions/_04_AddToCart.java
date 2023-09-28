package StepDefinitions;


import Pages.Locaters;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import static Utilities.GWD.getDriver;


public class _04_AddToCart {


    Locaters pl = new Locaters();

    @And("navigate to summer dresses")
    public void navigateToSummerDresses() {


        Actions actions = new Actions(getDriver());
        Action act = actions.moveToElement(pl.WomenMenu).build();
        act.perform();
        pl.myClick(pl.SummerDresses);
    }

    @When("user selects a random dress and click add to cart button")
    public void userSelectsARandomDressAnpllickAddToCartButton() {

        Actions actions = new Actions(getDriver());
        Action act = actions.moveToElement(pl.RndDress).build();
        act.perform();
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", pl.AddToCrt );
    }


    @And("product should be successfully added to the cart")
    public void productShouldBeSuccessfullyAddedToTheCart() {

        pl.verifyContainsText(pl.successMessage, "successfully");
    }

}

