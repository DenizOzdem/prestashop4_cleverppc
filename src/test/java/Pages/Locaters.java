package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Locaters extends Parent{
    public Locaters() {
        PageFactory.initElements(GWD.getDriver(), this);

    }

    @FindBy(css = "[title='Sitemap']")
    public WebElement siteMap;

    @FindBy(css = "div[class='block myaccount-column'] [title='My addresses']")
    public WebElement adresses;

    @FindBy(css = "[title='Add an address']")
    public WebElement adresEkleButonu;

    @FindBy(css = "[id='company']")
    public WebElement company;

    @FindBy(css = "[id='address1']")
    public WebElement adress1;

    @FindBy(css = "[id='address2']")
    public WebElement adress2;

    @FindBy(css = "[id='city']")
    public WebElement city;

    @FindBy(css = "[id='uniform-id_state']")
    public WebElement state;

    @FindBy(css = "div[id='uniform-id_state'] [id='id_state'] [value='1']")
    public WebElement stateSecim;

    @FindBy(css = "[id='postcode']")
    public WebElement postcode;

    @FindBy(css = "[id='phone']")
    public WebElement homePhone;

    @FindBy(css = "[id='phone_mobile']")
    public WebElement mobilPhone;

    @FindBy(css = "[id='other']")
    public WebElement informaiton;

    @FindBy(css = "[id='submitAddress']")
    public WebElement saveButonu;

    @FindBy(css = "div[class='addresses'] [class='dark']")
    public WebElement adreslerinListesiYazisi;

    @FindBy(xpath="//a[@class='login']")
    public WebElement signIn;

    @FindBy(xpath="//input[@id='email_create']")
    public WebElement createAccount;

    @FindBy(xpath="//button[@id='SubmitCreate']")
    public WebElement createAccountBtn;

    @FindBy(xpath="//input[@id='customer_firstname']")
    public WebElement firstName;

    @FindBy(xpath="//input[@id='customer_lastname']")
    public WebElement lastName;

    @FindBy(xpath="//button[@id='submitAccount']")
    public WebElement registerBtn;

    @FindBy(xpath="//p[@class='alert alert-success']")
    public WebElement successMsg;

    @FindBy(xpath="//input[@id='email']")
    public WebElement userEmail;

    @FindBy(xpath="//input[@id='passwd']")
    public WebElement userPassword;

    @FindBy(xpath="//button[@id='SubmitLogin']")
    public WebElement userSignInBtn;

    @FindBy(xpath="//div[@class='alert alert-danger']//li")
    public WebElement passwordRequiredMsg;

    @FindBy(xpath="//li[text()='An email address required.']")
    public WebElement emailRequiredMsg;

    @FindBy(xpath="//div[@class='alert alert-danger']//li")
    public WebElement failMsg;

    @FindBy(xpath="//p[@class='info-account']")
    public WebElement welcomeMsg;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement WomenMenu;

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[3]/a")
    public WebElement SummerDresses;

    @FindBy(xpath ="//*[@id='product_list']/li[1]")
    public WebElement RndDress;

    @FindBy(xpath="//*[@id='product_list']/li[1]/div/div[2]/div[2]/a[1]/span")
    public WebElement AddToCrt;

    @FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/span[2]")
    public WebElement successMessage;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")
    public WebElement dresses;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
    public WebElement card;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/h1/span")
    public WebElement productAmount;

    @FindBy(xpath = "//small[@class='cart_ref']")
    public List<WebElement> inCardProuducts;

    @FindBy(xpath = "//a[@title='Add to cart']")
    public List<WebElement> AllProuducts;

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
    public WebElement message1;

    @FindBy(css = "[title='Go to your order history page']")
    public WebElement orderHistory;

    @FindBy(xpath = "(//a[@class='color-myaccount'])[1]")
    public WebElement orderMessage;

    @FindBy(xpath = "(//a[text()='Dresses'])[2]")
    public WebElement dressesBtn;

    @FindBy(xpath = "//div[@id='center_column']/h1")
    public WebElement ustList;

    @FindBy(xpath = "(//div[@class='product-count'])[2]")
    public WebElement altList;

    @FindBy(xpath = "//span[@class=' label-success']")
    public List<WebElement> urunSayi;

    @FindBy(xpath = "(//div[@id='contact-link'])//a")
    public WebElement contactUsButton;

    @FindBy(css = "div[class='form-group selector1'] [id='uniform-id_contact']")
    public WebElement SubjectHeading;

    @FindBy(css = "div[id='uniform-id_contact'] [id='id_contact'] [value='2']")
    public WebElement SubjectHeadingchoise;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='id_order']")
    public WebElement referansNo;

    @FindBy(xpath = "//div[@class='uploader']/span[@class='action']")
    public WebElement fileSelectButton;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement message;


    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement send;

    @FindBy(xpath = "//p[@class='alert alert-success']")
    public WebElement verifymessage;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement password;

    @FindBy(css = "[class='icon-remove right']")
    public WebElement deleteBtn;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "signIn": return this.signIn;
            case "createAccount": return this.createAccount;
            case "createAccountBtn": return this.createAccountBtn;
            case "firstName": return this.firstName;
            case "lastName": return this.lastName;
            case "email": return this.eMail;
            case "registerBtn": return this.registerBtn;
            case "successMsg": return this.successMsg;
            case "userEmail": return this.userEmail;
            case "userPassword": return this.userPassword;
            case "userSignInBtn": return this.userSignInBtn;
            case "passwordRequiredMsg": return this.passwordRequiredMsg;
            case "emailRequiredMsg": return this.emailRequiredMsg;
            case "failMsg": return this.failMsg;
            case "welcomeMsg": return this.welcomeMsg;
            case "password": return this.password;

        }

        return null;
    }

}
