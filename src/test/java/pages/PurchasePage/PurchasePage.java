package pages.PurchasePage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class PurchasePage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(PurchasePage.class);
    public static PurchasePage instance;

    private PurchasePage() {
    }

    public static PurchasePage getInstance() {
        if (instance == null) {
            instance = new PurchasePage();
        }
        return instance;
    }

    private By clickBuyButton = By.xpath("//a[@onclick=\"addToCart('22513', '1');\"]");
    private By clickBuyButton2 = By.xpath("//a[@onclick=\"addToCart('23915', '1');\"]");
    private By clickBuyButton3 = By.xpath("//a[@onclick=\"addToCart('23973', '1');\"]");
    private By clickCartIcon = By.id("cart");
    private By clickSeeCartButton = By.xpath("//a[@class=\"button\" and text()='Vezi Coșul']");

    public void clickBuyButton() {
        LOG.info("CLick 'Buy' button");
        driver.findElement(clickBuyButton).click();

    }

    public void clickBuyButton2() {
        LOG.info("Click second 'Buy' button");
        driver.findElement(clickBuyButton2).click();


    }

    public void clickBuyButton3() {
        LOG.info("Click third 'Buy' button");
        driver.findElement(clickBuyButton3).click();

    }


    public void clickCartIcon() {
        LOG.info("Click 'Cart' icon");
        driver.findElement(clickCartIcon).click();
        driver.findElement(clickSeeCartButton).click();


    }


}
