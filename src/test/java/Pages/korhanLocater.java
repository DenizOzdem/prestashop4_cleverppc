package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class korhanLocater extends Parent{

    public korhanLocater() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@title='Dresses'])[2]")
    public WebElement dresbtn;


    @FindBy (xpath = "(//a[@class='product-name'])[1]")
    public WebElement addToBtn;

    @FindBy(css = "[class='exclusive']")
    public WebElement addToCartBtn;

    @FindBy(css = "[title='Proceed to checkout']")
    public WebElement checkoutBtn;

    @FindBy (xpath = "(//a[@title='Proceed to checkout'])[2]")
    public WebElement checkoutBtn2;

    @FindBy(css = "[name='processAddress']")
    public WebElement checkoutBtn3;

    @FindBy(css = "input[type='checkbox']")
    public WebElement checkBoxBtn;

    @FindBy(name = "processCarrier")
    public WebElement checkoutBtn4;

    @FindBy(id = "paypal-standard-btn")
    public WebElement paypalBtn;

    @FindBy(css = "div[class='message']")
    public WebElement paypalErrorMsg;

    @FindBy(id = "ccBillForm")
    public WebElement creditCartBtn;

    @FindBy(xpath = "//body[text()='Invalid request (1).']")
    public WebElement creditCartErrorMsg;

    @FindBy(css = "[title='Pay by bank wire']")
    public WebElement bankCartBtn;

    @FindBy(css = "span[id='amount']")
    public WebElement total1;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement checkoutBtn5;

    @FindBy(css = "[class='price']")
    public WebElement total2;

    @FindBy(css = "[class='alert alert-success']")
    public WebElement message;

    @FindBy(css = "[title='Go to your order history page']")
    public WebElement orderHistory;
    @FindBy(xpath = "(//a[@class='color-myaccount'])[1]")
    public WebElement orderMessage;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")
    public WebElement signIn;
    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@id=\"passwd\"]")
    public WebElement passwordBox;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")
    public WebElement signInButton;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")
    public WebElement signOut;




//    public WebElement ElementGet(String element) {
//        switch (element) {
//            case "nameInput": return this.nameInput;
//            case "lastnameInput": return this.lastnameInput;
//            case "addressInput": return this.addressInput;
//            case "cityInput": return this.cityInput;
//            case "zipCode": return this.zipCode;
//            case "phone": return this.phone;
//            case "addressAlias": return this.addressAlias;
//            case "SingButton": return SingButton;
//            case "Email":return Email;
//            case "CreateAcc":return CreateAcc;
//            case "Firstname":return Firstname;
//            case "LastName":return LastName;
//            case "Password":return Password;
//            case "MrSelect":return MrSelect;
//        }
//
//        return null;
//    }

}
