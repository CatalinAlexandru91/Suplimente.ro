package tests.PurchaseTest;

import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.BasePage;
import tests.BaseTest;
import static pages.BasePage.sleep;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class PurchaseTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(PurchaseTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    String firstName = "Ion";
    String lastname = "Popescu";
    String email = "ionpopescu@gmail.com";
    String phonenumber = "0722222222";
    String address = "Calea Mosilor Nr. 272";
    String county = "Bucuresti";

    @Test
    public void purchase() {
        driver.get(newUrl);

        LOG.info("Click 'Buy' button");
        purchasePage.clickBuyButton();

        LOG.info("Click second 'Buy' button");
        purchasePage.clickBuyButton2();

        LOG.info("Click third 'Buy' button");
        purchasePage.clickBuyButton3();

        sleep(3000L);
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        LOG.info("Click 'Cart' icon");
        purchasePage.clickCartIcon();

        LOG.info("Click 'Finish order' button");
        purchasePage.clickFinishOrderButton();

        LOG.info("Click 'Order without account' option");
        purchasePage.clickOrderWithoutAccountOption();

        LOG.info("Insert first name in field");
        purchasePage.inputFirstName(firstName);

        LOG.info("Insert last name in field");
        purchasePage.inputLastName(lastname);

        LOG.info("Insert email in field");
        purchasePage.inputEmail(email);

        LOG.info("Insert phone number in field");
        purchasePage.inputPhoneNumber(phonenumber);

        LOG.info("Insert address in field");
        purchasePage.inputAddress(address);

        LOG.info("Select county");
        purchasePage.selectCounty(county);














    }

}

