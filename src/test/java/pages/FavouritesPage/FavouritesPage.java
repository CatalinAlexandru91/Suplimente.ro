package pages.FavouritesPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class FavouritesPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(FavouritesPage.class);
    public static FavouritesPage instance;

    private FavouritesPage() {
    }

    public static FavouritesPage getInstance() {
        if (instance == null) {
            instance = new FavouritesPage();
        }
        return instance;
    }

    private By accountButton = By.xpath("//span[@class='top-menu-link' and text()='CONT']");
    private By inputEmailAddress = By.id("input-email");
    private By inputPassword = By.id("input-password");
    private By clickLogInButton = By.xpath("//input[@value='Autentificare']");
    private By insertItemInSearchBar = By.xpath("//input[@placeholder=\"Cauta produs...\"]");
    private By searchButton = By.xpath("//div[@class=\"button-search\"]");
    private By clickItem = By.xpath("//a[contains(@href, 'universal-animal-pak-44packs')]");
    private By addToWishList = By.xpath("//a[contains(@onclick, \"addToWishList('22497')\")]");
    private By wishListButton = By.xpath("//span[contains(@class, 'top-menu-link') and contains(text(), 'Wish List')]\n");
    private By eliminateButton = By.xpath("//a[@href='https://www.suplimente.ro/cont-wishlist?remove=22497']");

    public void clickAccountButton() {
        LOG.info("Click 'Account' button");
        driver.findElement(accountButton).click();

    }

    public void insertEmailAddress(String emailaddress) {
        LOG.info("Insert email address");
        driver.findElement(inputEmailAddress).sendKeys(emailaddress);

    }

    public void insertPassword(String password) {
        LOG.info("Insert password");
        driver.findElement(inputPassword).sendKeys("password");
    }

    public void clickLogInButton() {
        LOG.info("Click 'Authentification' button");
        driver.findElement(clickLogInButton).click();

    }

    public void searchItem(String item) {
        LOG.info("Search for item in search bar");
        driver.findElement(insertItemInSearchBar).sendKeys(item);

    }

    public void clickSearchButton() {
        LOG.info("Click 'Search' button");
        driver.findElement(searchButton).click();

    }

    public void clickItem() {
        LOG.info("Click 'Item' icon");
        driver.findElement(clickItem).click();
    }

    public void addToWishList() {
        LOG.info("Click 'Add to wishlist' button");
        driver.findElement(addToWishList).click();
    }

    public void clickWishListButton() {
        LOG.info("Click 'Wish list' button");
        driver.findElement(wishListButton).click();

    }

    public void clickEliminateButton() {
        sleep(3000L);
        LOG.info("Click 'Eliminate' button");
        driver.findElement(eliminateButton).click();

    }
}