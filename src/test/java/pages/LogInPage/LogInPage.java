package pages.LogInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class LogInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance;

    private LogInPage() {
    }

    public static LogInPage getInstance() {
        if (instance == null) {
            instance = new LogInPage();
        }
        return instance;
    }


    private By accountButton = By.xpath("//span[@class='top-menu-link' and text()='CONT']");
    private By inputEmailAddress = By.id("input-email");
    private By inputPassword = By.id("input-password");
    private By clickLogInButton = By.xpath("//input[@type='submit']");

    public void clickAccountButton() {
        LOG.info("Click 'Account' button");
        driver.findElement(accountButton).click();

    }

    public void insertEmailAddress(String emailaddress) {
        LOG.info("Insert email address");
        driver.findElement(inputEmailAddress).sendKeys(emailaddress);


    }

    public void insertPassword(String password) {
        LOG.info("Insert password");
        driver.findElement(inputPassword).sendKeys("password");
    }

    public void clickLogInButton() {
        LOG.info("Click 'Authentification' button");
        driver.findElement(clickLogInButton).click();
    }
}