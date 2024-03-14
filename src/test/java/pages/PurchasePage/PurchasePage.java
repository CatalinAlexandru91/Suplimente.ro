package pages.PurchasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class PurchasePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(PurchasePage.class);
    public static PurchasePage instance;

    private PurchasePage() {
    }

    public static PurchasePage getInstance() {
        if (instance == null) {
            instance = new PurchasePage();
        }
        return instance;
    }

    private By clickBuyButton = By.xpath("//a[@onclick=\"addToCart('22513', '1');\"]");
    private By clickBuyButton2 = By.xpath("//a[@onclick=\"addToCart('23915', '1');\"]");
    private By clickBuyButton3 = By.xpath("//a[@onclick=\"addToCart('23973', '1');\"]");
    private By clickCartIcon = By.id("cart");
    private By clickSeeCartButton = By.xpath("//a[@class=\"button\" and text()='Vezi Coșul']");
    private By finishOrderButton = By.xpath("//a[@class=\"btn btn-primary button\"]");
    private By samedayStandardBox = By.xpath("//input[@value=\"flat.flat\"]");
    private By samedayLockerBox = By.xpath("//input[@value=\"sameday.sameday\"]");
    private By paymentUponDelivery = By.xpath("//input[@value=\"cod\"]");
    private By paymentByCard = By.xpath("//input[@value=\"euplatesc\"]");
    private By clickOrderWithoutAccountOption = By.xpath("//input[@type=\"radio\"]");
    private By inputFirstName = By.id("input-payment-firstname");
    private By inputLastName = By.id("input-payment-lastname");
    private By inputEmail = By.id("input-payment-email");
    private By inputPhoneNumber = By.id("input-payment-telephone");
    private By inputAddress = By.xpath("//input[@name=\"payment_address_1\"]");
    private By selectCounty = By.xpath("//select[@id=\"input-payment-zone\"]/option[@value=\"2688\"]");
    private By selectCity = By.xpath("//select[@id=\"input-payment-city\"]/option[@value=\"Sectorul 2\"]");
    private By shippingAddressBox = By.xpath("//input[@name='shipping_address']");
    private By newsletterBox = By.id("newsletter");
    private By privacyBox = By.xpath("//input[@name=\"privacy\"]");
    private By termsAndConditionsBox = By.xpath("//input[@name=\"agree\"]");

    public void clickBuyButton() {
        LOG.info("CLick 'Buy' button");
        driver.findElement(clickBuyButton).click();

    }

    public void clickBuyButton2() {
        LOG.info("Click second 'Buy' button");
        driver.findElement(clickBuyButton2).click();


    }

    public void clickBuyButton3() {
        LOG.info("Click third 'Buy' button");
        driver.findElement(clickBuyButton3).click();

    }

    public void clickCartIcon() {

        sleep(3000L);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        LOG.info("Click 'Cart' icon");
        driver.findElement(clickCartIcon).click();
        driver.findElement(clickSeeCartButton).click();

    }

    public void clickFinishOrderButton() {
        LOG.info("Click 'Finish order' button");
        driver.findElement(finishOrderButton).click();
    }

    public void clicksamedayStandardBox() {
        sleep(3000L);
        LOG.info("Select 'Sameday standard' option");
        driver.findElement(samedayStandardBox).click();

    }

    public void clicksamedayLockerBox() {
        sleep(3000L);
        LOG.info("Select 'Sameday Locker option");
        driver.findElement(samedayLockerBox).click();

    }

    public void clickPaymentUponDeliveryBox() {
        LOG.info("Select 'Payment upon delivery' option");
        driver.findElement(paymentUponDelivery).click();

    }

    public void clickPaymentByCard() {
        LOG.info("Select 'Payment by card' option");
        driver.findElement(paymentByCard).click();

    }

    public void clickOrderWithoutAccountOption() {
        LOG.info("Click 'Order without account' option");
        driver.findElement(clickOrderWithoutAccountOption).click();
    }

    public void inputFirstName(String fName) {
        LOG.info("Insert first name in field");
        driver.findElement(inputFirstName).sendKeys(fName);
    }

    public void inputLastName(String lName) {
        LOG.info("Insert last name in field");
        driver.findElement(inputLastName).sendKeys(lName);

    }

    public void inputEmail(String email) {
        LOG.info("Insert email in field");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void inputPhoneNumber(String phonenumber) {
        LOG.info("Insert phone number in field");
        driver.findElement(inputPhoneNumber).sendKeys(phonenumber);
    }

    public void inputAddress(String address) {
        LOG.info("Insert address in field");
        driver.findElement(inputAddress).sendKeys(address);

    }

    public void selectCounty(String county) {
        LOG.info("Select county");
        driver.findElement(selectCounty).click();


    }

    public void selectCity(String city) {
        LOG.info("Select city");
        driver.findElement(selectCity).click();


    }

    public void shippingAddressBox() {
        LOG.info("Click 'Shipping address' box");
        driver.findElement(shippingAddressBox).click();


    }

    public void newsletterBox() {
        LOG.info("Click 'Newsletter' box");
        driver.findElement(newsletterBox).click();


    }

    public void privacyBox() {
        LOG.info("Click 'Privacy' box");
        driver.findElement(privacyBox).click();

    }

    public void termsAndConditionsBox() {
        LOG.info("Click 'Terms and conditions' box");
        driver.findElement(termsAndConditionsBox).click();
    }
}