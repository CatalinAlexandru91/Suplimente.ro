package pages.RegisterPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }


    private By logo = By.id("logo");
    private By searchBar = By.id("search");
    private By accountButton = By.xpath("//span[@class='top-menu-link' and text()='CONT']");
    private By continueButton = By.xpath("//a[text()='Continua']");
    private By inputFirstName = By.id("input-firstname");
    private By inputLastName = By.id("input-lastname");
    private By inputEmailAddress = By.id("input-email");
    private By inputPhoneNumber = By.id("input-telephone");
    private By inputPassword = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By subscribe = By.xpath("//input[@type='radio' and @value = '0']");
    private By termsAndConditions = By.xpath("//input[@type='checkbox' and @value='1']");
    private By confidentiality = By.xpath("//b[text()='Confidentialitate']");
    private By closeButton = By.xpath("//button[@aria-hidden='true']");
    private By continueButton2 = By.xpath("//input[@type='submit']");
    private By logOut = By.xpath("//a[@class='list-group-item' and text()='Ieșire din cont']");

    public boolean isLogoDisplayed() {
        LOG.info("Verify if logo image is displayed");
        return driver.findElement(logo).isDisplayed();

    }

    public boolean isSearchBarDisplayed() {
        LOG.info("Verify if search bar is displayed");
        return driver.findElement(searchBar).isDisplayed();

    }

    public void clickAccountButton() {
        LOG.info("Click 'Account' button");
        driver.findElement(accountButton).click();
    }

    public void clickContinueButton() {
        LOG.info("Click 'Continue' button");
        driver.findElement(continueButton).click();

    }

    public void insertFullName(String fName, String lName) {
        LOG.info("Inserting FirstName and LastName");
        driver.findElement(inputFirstName).sendKeys(fName);
        driver.findElement(inputLastName).sendKeys(lName);

    }

    public void insertEmailAddress(String emailaddress) {
        LOG.info("Insert email address");
        driver.findElement(inputEmailAddress).sendKeys(emailaddress);

    }

    public void insertPhoneNumber(String phonenumber) {
        LOG.info("Insert phone number");
        driver.findElement(inputPhoneNumber).sendKeys(phonenumber);
    }

    public void insertPassword(String password) {
        LOG.info("Insert password");
        driver.findElement(inputPassword).sendKeys("password");

    }

    public void confirmPassword(String password) {
        LOG.info("Confirm password");
        driver.findElement(confirmPassword).sendKeys("password");
    }

    public void doNotSubscribe() {
        LOG.info("Click 'No' option");
        driver.findElement(subscribe).click();

    }

    public void clickTermsAndConditionsBox() {
        LOG.info("Click 'Terms and conditions' box");
        driver.findElement(termsAndConditions).click();
    }

    public void clickConfidentialityLink() {
        LOG.info("Click 'Confidentiality' link");
        driver.findElement(confidentiality).click();

    }

    public void clickCloseButton() {
        LOG.info("Click 'Close' button");
        driver.findElement(closeButton).click();

    }

    public void clickContinueButton2() {
        LOG.info("Click second 'Continue' button");
        driver.findElement(continueButton2).click();

    }

    public void clickLogOutButton() {
        LOG.info("Click 'LogOut' button");
        driver.findElement(logOut).click();
    }
}