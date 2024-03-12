package pages.DiscountPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class DiscountPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(DiscountPage.class);
    public static DiscountPage instance;

    private DiscountPage() {
    }

    public static DiscountPage getInstance() {
        if (instance == null) {
            instance = new DiscountPage();
        }
        return instance;
    }

    private By discountItems = By.xpath("//a[@style='width:100%;height:100%;display:block']/span[@style='width:100%;height:100%;display:block']");
    private By selectCategory = By.xpath("//span[@class='sf-name' and text()='ARTICULATII SI PIELE (25)']\n");
    private By selectPresentation = By.xpath("//span[@class='sf-name' and text()='Capsule (3)']\n");
    private By buyButton = By.xpath("//a[@onclick=\"addToCart('23740', '1');\"]");
    private By clickCartIcon = By.id("cart");
    private By clickSeeCartButton = By.xpath("//a[@class=\"button\" and text()='Vezi Coșul']");
    private By removeButton = By.xpath("//button[@class=\"btn btn-danger\"]");
    private By continueButton = By.xpath("//a[text()='Continua']");

    public void clickDiscountButton() {
        LOG.info("Click discount items");
        driver.findElement(discountItems).click();
    }

    public void selectCategory() {
        LOG.info("Click select category");
        driver.findElement(selectCategory).click();

    }

    public void selectPresentation() {
        sleep(3000L);
        LOG.info("Select form of presentation");
        driver.findElement(selectPresentation).click();
    }

    public void clickBuyButton() {
        sleep(3000L);
        LOG.info("Click 'Buy' button'");
        driver.findElement(buyButton).click();

    }

    public void clickCartIcon() {
        sleep(3000L);
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
