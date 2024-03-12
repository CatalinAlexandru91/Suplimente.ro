package tests.DiscountTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class DiscountTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(DiscountTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;


    @Test
    public void discount() {

        LOG.info("Click discount items");
        discountPage.clickDiscountButton();

        LOG.info("Click select category");
        discountPage.selectCategory();

        LOG.info("Select form of presentation");
        discountPage.selectPresentation();

        LOG.info("Click 'Buy' button'");
        discountPage.clickBuyButton();

        LOG.info("Click 'Cart' icon");
        discountPage.clickCartIcon();

        LOG.info("Click 'Remove' button");
        discountPage.clickRemoveButton();

        sleep(3000L);
        LOG.info("Click 'Continue' button");
        discountPage.continueButton();



    }
}