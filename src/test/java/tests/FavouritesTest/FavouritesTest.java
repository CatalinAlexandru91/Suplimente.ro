package tests.FavouritesTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class FavouritesTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(FavouritesTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    String emailaddress = "alex.tarachiu91@gmail.com";
    String password = "Suplimente123";
    String item = "Animal Pak";

    @Test
    public void favourites() {
        driver.get(newUrl);

        LOG.info("Click 'Account' button");
        favouritesPage.clickAccountButton();

        LOG.info("Click 'Email' field");
        favouritesPage.insertEmailAddress(emailaddress);

        LOG.info("Insert password");
        favouritesPage.insertPassword(password);

        LOG.info("Click 'Authentification' button");
        favouritesPage.clickLogInButton();

        LOG.info("Search for item in search bar");
        favouritesPage.searchItem(item);

        LOG.info("Click 'Search' button");
        favouritesPage.clickSearchButton();

        LOG.info("Click 'Item' icon");
        favouritesPage.clickItem();

        LOG.info("Click 'Add to wishlist' button");
        favouritesPage.addToWishList();

        LOG.info("Click 'Wish list' button");
        favouritesPage.clickWishListButton();

        LOG.info("Click 'Eliminate' button");
        favouritesPage.clickEliminateButton();


    }
}

