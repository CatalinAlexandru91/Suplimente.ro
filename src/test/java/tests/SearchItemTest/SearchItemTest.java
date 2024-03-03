package tests.SearchItemTest;

import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.BasePage;
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
    public void searchitem() {
        driver.get(newUrl);

        LOG.info("Search for item in search bar");
        searchItemPage.searchItem(item);




    }
}