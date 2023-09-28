package Pages;

import Utilities.GWD;
import bsh.This;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ahmetLocators extends Parent {

    public ahmetLocators() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(xpath = "(//div[@id='contact-link'])//a")
    public WebElement contactUsButton;

    @FindBy(xpath = "//div[@class='selector']/select")
    public WebElement SubjectHeading;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='id_order']")
    public WebElement referansNo;

    @FindBy(xpath = "//div[@class='uploader']/span[@class='action']")
    public WebElement fileSelectButton;

    @FindBy(xpath = "//div[@id='uniform-fileUpload']//input")
    public WebElement dekont;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement message;


    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement send;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement verifymessage;

}
