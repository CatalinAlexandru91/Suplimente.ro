package tests.SearchItemTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;
import static pages.BasePage.sleep;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SearchItemTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(SearchItemTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    String item = "Animal Pak";


    @Test
    public void search() {
        driver.get(newUrl);

        LOG.info("Search for item in search bar");
        searchItemPage.searchItem(item);

        LOG.info("Click 'Search' button");
        searchItemPage.clickSearchButton();

        LOG.info("Click 'Buy' button");
        searchItemPage.clickBuyButton();

        sleep(3000L);
        LOG.info("Click 'Cart' icon");
        searchItemPage.clickCartIcon();

        LOG.info("Click 'Remove' button");
        searchItemPage.clickRemoveButton();

        sleep(3000L);
        LOG.info("Click 'Continue' button");
        searchItemPage.continueButton();

    }
}