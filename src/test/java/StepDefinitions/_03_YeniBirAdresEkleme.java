package StepDefinitions;


import Pages.Locaters;
import Utilities.GWD;
import io.cucumber.java.en.*;


    public class _03_YeniBirAdresEkleme {

        Locaters pl = new Locaters();

        @When("Click the sitemap button. Then click on the addresses button. Add a new address to the page that opens.")
        public void clickTheSitemapButtonThenClickOnTheAddressesButtonAddANewAddressToThePageThatOpens() throws InterruptedException {

            pl.myClick(pl.siteMap);
            pl.myClick(pl.adresses);
            pl.myClick(pl.adresEkleButonu);
            pl.mySendKeys(pl.company, "TechnoStudy");
            pl.mySendKeys(pl.adress1, "den mh./den sk./no:35/kat:35/daire:64");
            pl.mySendKeys(pl.adress2,"den mh./den sk./no:36/kat:36/daire:66");
            pl.mySendKeys(pl.city,"deneme");
            pl.myClick(pl.state);
            Thread.sleep(1000);
            pl.myClick(pl.stateSecim);
            pl.mySendKeys(pl.postcode,"35000");
            pl.mySendKeys(pl.homePhone,"05333333333");
            pl.mySendKeys(pl.mobilPhone,"05444444444");
            pl.mySendKeys(pl.informaiton,"test aşaması");
            pl.myClick(pl.saveButonu);

        }
        @Then("The user should successfully add a new address.")
        public void theUserShouldSuccessfullyAddANewAddress() {

            pl.verifyContainsText(pl.adreslerinListesiYazisi,"Your addresses are listed below.");

            GWD.quiteDriver();

        }
    }