package tests.BottomMenuTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.*;

public class BottomMenuTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(BottomMenuTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    @Test
    public void bottommenu() {
        driver.get(newUrl);

        LOG.info("Click 'About website' button");
        bottomMenuPage.clickAboutWebsiteButton();

        LOG.info("Click 'Shipping costs' button");
        bottomMenuPage.clickShippingCostsButton();

        LOG.info("Click 'Confidentiality' button");
        bottomMenuPage.clickConfidentialityButton();

        LOG.info("Click 'Terms and conditions' button");
        bottomMenuPage.clickTermsAndConditionsButton();

        LOG.info("Click 'ANPC' button");
        bottomMenuPage.clickANPCButton();



    }
}