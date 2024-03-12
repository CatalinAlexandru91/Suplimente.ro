package pages.CustomerServicePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class CustomerServicePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(CustomerServicePage.class);
    public static CustomerServicePage instance;

    private CustomerServicePage() {
    }

    public static CustomerServicePage getInstance() {
        if (instance == null) {
            instance = new CustomerServicePage();
        }
        return instance;
    }

    private By contact = By.xpath("//a[text()='Contact']");
    private By returnItems = By.xpath("//a[text()='Returnări']");
    private By firstname = By.id("input-firstname");
    private By lastname = By.id("input-lastname");
    private By inputEmail = By.id("input-email");
    private By inputPhoneNumber = By.id("input-telephone");
    private By orderNumber = By.id("input-order-id");
    private By dateOfOrder = By.id("input-date-ordered");
    private By productName = By.id("input-product");
    private By productCode = By.id("input-model");
    private By inputQuantity = By.id("input-quantity");
    private By selectMotive = By.xpath("//input[@type=\"radio\" and @name=\"return_reason_id\" and @value=\"1\"]\n");
    private By openedOrNot = By.xpath("//input[@type=\"radio\" and @name=\"opened\" and @value=\"1\"]\n");
    private By insertComment = By.id("input-comment");
    private By termsAndConditions = By.xpath("//input[@type=\"checkbox\" and @name=\"agree\" and @value=\"1\"]");
    private By backButton = By.xpath("//a[text()='Inapoi']");

    public void clickContactButton() {
        LOG.info("Click 'Contact' button");
        driver.findElement(contact).click();

    }

    public void clickReturnItemsButton() {
        LOG.info("Click 'Return items' button");
        driver.findElement(returnItems).click();

    }

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(firstname).sendKeys(fName);
        driver.findElement(lastname).sendKeys(lName);
    }

    public void insertEmail(String email) {
        LOG.info("Insert email");
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void insertPhoneNUmber(String phone) {
        LOG.info("Insert phone number");
        driver.findElement(inputPhoneNumber).sendKeys(phone);
    }

    public void insertOrderNUmber(String order) {
        LOG.info("Insert order number");
        driver.findElement(orderNumber).sendKeys(order);
    }

    public void insertDateOfOrder(String date) {
        LOG.info("Insert date of order");
        driver.findElement(dateOfOrder).sendKeys(date);
    }

    public void insertProductName(String product) {
        LOG.info("Insert product name");
        driver.findElement(productName).sendKeys(product);

    }

    public void insertProductCode(String code) {
        LOG.info("Insert product code");
        driver.findElement(productCode).sendKeys(code);
    }

    public void insertQuantity(String quantity) {
        LOG.info("Insert quantity");
        driver.findElement(productCode).sendKeys(quantity);
    }

    public void selectMotive() {
        LOG.info("Selecting motive for returning item");
        driver.findElement(selectMotive).click();

    }

    public void selectYesOrNo() {
        LOG.info("Selecting if the item is opened or not");
        driver.findElement(openedOrNot).click();
    }

    public void insertComment(String comment) {
        LOG.info("Insert comment");
        driver.findElement(insertComment).sendKeys(comment);


    }

    public void clickTermsAndConditionsBox() {
        LOG.info("Click 'Terms and conditions' box'");
        driver.findElement(termsAndConditions).click();

    }

    public void clickBackButton() {
        LOG.info("Click 'Back' button'");
        driver.findElement(backButton).click();
    }
}