package tests.MainMenuTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.*;

public class MainMenuTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(MainMenuTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    @Test
    public void mainmenu() {
        driver.get(newUrl);


        LOG.info("Click 'Promotions' button");
        mainMenuPage.clickPromotionsButton();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickselectProducerButton();

        LOG.info("Click 'Select type' button");
        mainMenuPage.clickSelectType();

        LOG.info("Click 'Form of presentation' button");
        mainMenuPage.clickPromotionsButton();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton();

        LOG.info("Click 'Categories' option");
        mainMenuPage.clickCategoriesOption();

        LOG.info("Click 'Vitamins' option");
        mainMenuPage.clickVitaminsOption();







    }
}