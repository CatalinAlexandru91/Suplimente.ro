package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.MainMenuPage.MainMenuPage;
import pages.FavouritesPage.FavouritesPage;
import pages.LogInPage.LogInPage;
import pages.PaymentMethodPage.PaymentMethodPage;
import pages.MainMenuPage.MainMenuPage;
import pages.PurchasePage.PurchasePage;
import pages.RegisterPage.RegisterPage;
import pages.SearchItemPage.SearchItemPage;

public class BaseTest {

    public RegisterPage registerPage = RegisterPage.getInstance();
    public LogInPage logInPage = LogInPage.getInstance();
    public PurchasePage purchasePage = PurchasePage.getInstance();
    public SearchItemPage searchItemPage = SearchItemPage.getInstance();
    public PaymentMethodPage paymentMethodPage = PaymentMethodPage.getInstance();
    public FavouritesPage favouritesPage = FavouritesPage.getInstance();
    public MainMenuPage mainMenuPage = MainMenuPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}