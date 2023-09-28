package StepDefinitions;

import Pages.Locaters;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _08_EmailCanSend {
    Locaters pl = new Locaters();

    @When("Click to element contact us")
    public void clickToElementContactUs()  {
       pl.myClick(pl.contactUsButton); //pl.myClick(pl.contactUsButton);
    }

    @And("Select to element SubjectHeading")
    public void selectToElementSubjectHeading() throws InterruptedException {
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0, 200);");

        Thread.sleep(2000);
        pl.myClick(pl.SubjectHeading);
        Thread.sleep(2000);
        pl.myClick(pl.SubjectHeadingchoise);
    }

    @And("User sending the keys in email")
    public void userSendingTheKeysInEmail() {pl.mySendKeys(pl.eMail, "gokcent433@gmail.com");
    }

    @And("User sending the keys in referansno")
    public void userSendingTheKeysInReferansno()
    {pl.mySendKeys(pl.referansNo,"demo_04");
    }

    @And("Click to element Choose File")
    public void clickToElementChooseFile(){
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();

        js.executeScript("arguments[0].click();", pl.fileSelectButton );
        //  pl.myClick(pl.fileSelectButton);

    }

    @And("Upload File with RobotClass")
    public void uploadFileWithRobotClass() throws AWTException {
        Robot robot = new Robot();
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\deniz\\OneDrive\\Masaüstü\\Ahmet jpeg\\New Text Document (2).jpeg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        for (int i = 0; i < 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @And("User sending the keys in message")
    public void userSendingTheKeysInMessage() {
        pl.mySendKeys(pl.message, "Banka havalesi henüz yapıldı, ödeme dekontu ektedir."
                + "İsim= a. Soyisim= t.");

    }

    @And("Click to element send")
    public void clickToElementSend() {
        pl.myClick(pl.send);
    }

    @Then("Your message has been successfully")
    public void yourMessageHasBeenSuccessfully() {
        pl.verifyContainsText(pl.verifymessage, "successfully");
    }
}
