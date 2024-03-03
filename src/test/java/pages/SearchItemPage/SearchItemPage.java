package pages.SearchItemPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SearchItemPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(SearchItemPage.class);
    public static SearchItemPage instance;

    private SearchItemPage() {
    }

    public static SearchItemPage getInstance() {
        if (instance == null) {
            instance = new SearchItemPage();
        }
        return instance;
    }

    private By searchItem = By.id("search");


    public void searchItem(String item){
    LOG.info("Search for item in search bar");
    driver.findElement(searchItem).sendKeys(item);

    }
}