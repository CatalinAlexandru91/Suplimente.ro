package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.LogInPage.LogInPage;
import pages.PurchasePage.PurchasePage;
import pages.RegisterPage.RegisterPage;

public class BaseTest {

    public RegisterPage registerPage = RegisterPage.getInstance();
    public LogInPage logInPage = LogInPage.getInstance();
    public PurchasePage purchasePage = PurchasePage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}