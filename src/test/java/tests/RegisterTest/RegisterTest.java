package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.sleep;

public class RegisterTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);
    private Object sleep;

    String firstName = "Ion";
    String lastName = "Popescu";
    String emailaddress = "proteina5@gmail.com";
    String phonenumber = "0733333333";
    String password = "proteinexyz";


    @Test
    public void registerAccount() {

        LOG.info("Verify if logo is displayed");
        Assert.assertTrue(registerPage.isLogoDisplayed(), "Logo is not displayed");

        LOG.info("Verify if search bar is displayed");
        Assert.assertTrue(registerPage.isSearchBarDisplayed(), "Search bar is not displayed");

        LOG.info("Click 'Account' button");
        registerPage.clickAccountButton();

        LOG.info("Click 'Continue' button");
        registerPage.clickContinueButton();

        LOG.info("Typing full name");
        registerPage.insertFullName(firstName, lastName);

        LOG.info("Insert email address");
        registerPage.insertEmailAddress(emailaddress);

        LOG.info("Insert phone number");
        registerPage.insertPhoneNumber(phonenumber);

        LOG.info("Insert password");
        registerPage.insertPassword(password);

        LOG.info("Confirm password");
        registerPage.confirmPassword(password);

        LOG.info("Click 'No' option");
        registerPage.doNotSubscribe();

        LOG.info("CLick 'Terms and conditions' box");
        registerPage.clickTermsAndConditionsBox();

        LOG.info("Click 'Confidentiality' link");
        registerPage.clickConfidentialityLink();

        sleep(3000L);
        LOG.info("Click 'Close' button");
        registerPage.clickCloseButton();

        LOG.info("Click second 'Continue' button");
        registerPage.clickContinueButton2();

        sleep(3000L);
        LOG.info("Click 'LogOut'' button");
        registerPage.clickLogOutButton();


    }
}

