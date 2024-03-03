package pages.SearchItemPage;

import org.openqa.selenium.By;
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

    private By insertItemInSearchBar = By.xpath("//input[@placeholder=\"Cauta produs...\"]");
    private By searchButton = By.xpath("//div[@class=\"button-search\"]");
    private By buyButton = By.xpath("//a[@onclick=\"addToCart('22497', '1');\"]");
    private By clickCartIcon = By.id("cart");
    private By clickSeeCartButton = By.xpath("//a[@class=\"button\" and text()='Vezi Coșul']");
    private By removeButton = By.xpath("//button[@class=\"btn btn-danger\"]");
    private By continueButton = By.xpath("//a[text()='Continua']");


    public void searchItem(String item) {
        LOG.info("Search for item in search bar");
        driver.findElement(insertItemInSearchBar).sendKeys(item);

    }

    public void clickSearchButton() {
        LOG.info("Click 'Search' button");
        driver.findElement(searchButton).click();

    }

    public void clickBuyButton() {
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton).click();
    }

    public void clickCartIcon() {
        LOG.info("Click 'Cart' icon");
        driver.findElement(clickCartIcon).click();
        driver.findElement(clickSeeCartButton).click();

    }

    public void clickRemoveButton() {
        LOG.info("Click 'Remove' button");
        driver.findElement(removeButton).click();


    }

    public void continueButton() {
        LOG.info("Click 'Continue' button");
        driver.findElement(continueButton).click();


    }
}