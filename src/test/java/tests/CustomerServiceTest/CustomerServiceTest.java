package tests.CustomerServiceTest;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.*;

public class CustomerServiceTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(CustomerServiceTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    String firstName = "Ion";
    String lastName = "Popescu";
    String email = "suplimente@yahoo.com";
    String phone = "0241613225";
    String order = "777";
    String date = "2024-02-01";
    String product = "Animal Pak";
    String code = "#123";
    String quantity = "3";
    String comment = "No comment";

    @Test
    public void customerservice() {
        driver.get(newUrl);

        LOG.info("Click 'Contact' button");
        customerServicePage.clickContactButton();

        LOG.info("Click 'Return items' button");
        customerServicePage.clickReturnItemsButton();

        LOG.info("Typing full name");
        customerServicePage.insertFullName(firstName, lastName);

        LOG.info("Type in email ");
        customerServicePage.insertEmail(email);

        LOG.info("Type in phone number");
        customerServicePage.insertPhoneNUmber(phone);

        LOG.info("Insert date of order");
        customerServicePage.insertDateOfOrder(date);

        LOG.info("Insert product name");
        customerServicePage.insertProductName(product);

        LOG.info("Insert product code");
        customerServicePage.insertProductCode(code);

        LOG.info("Insert quantity");
        customerServicePage.insertQuantity(quantity);

        LOG.info("Selecting motive for returning item");
        customerServicePage.selectMotive();

        LOG.info("Selecting if the item is opened or not");
        customerServicePage.selectYesOrNo();

        LOG.info("Insert comment");
        customerServicePage.insertComment(comment);

        LOG.info("Click 'Terms and conditions' box'");
        customerServicePage.clickTermsAndConditionsBox();

        LOG.info("Click 'Back' button'");
        customerServicePage.clickBackButton();

    }

}



