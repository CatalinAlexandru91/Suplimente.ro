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


    }

}

