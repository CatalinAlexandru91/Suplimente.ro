package pages.MainMenuPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class MainMenuPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(MainMenuPage.class);
    public static MainMenuPage instance;

    private MainMenuPage() {
    }

    public static MainMenuPage getInstance() {
        if (instance == null) {
            instance = new MainMenuPage();
        }
        return instance;
    }

    private By promotionsButton = By.xpath("//span[@class='main-menu-text' and text()='PROMOTII']\n");
    private By selectProducer = By.xpath("//span[@class='sf-name' and text()='5% Nutrition Rich Piana (1)']\n");
    private By selectType = By.xpath("//span[@class='sf-name' and text()='Creatina monohidrata (1)']\n");
    private By formOfPresentation = By.xpath("//span[@class='sf-name' and text()='Pulbere (1)']\n");
    private By buyButton = By.xpath("//a[@onclick=\"addToCart('24106', '1');\"]");
    private By categoriesButton = By.xpath("//span[@class='main-menu-text' and text()='CATEGORII PRODUSE']\n");
    private By clickVitaminsOption = By.xpath("//a[text()='VITAMINE']\n");

    public void clickPromotionsButton() {
        LOG.info("Click 'Promotions' button");
        driver.findElement(promotionsButton).click();
    }

    public void clickselectProducerButton() {
        LOG.info("Click 'Select producer' button");
        driver.findElement(selectProducer).click();

    }

    public void clickSelectType() {
        LOG.info("Click 'Select type' button");
        driver.findElement(selectType).click();
    }

    public void clickFormOfPresentation() {
        LOG.info("Click 'Form of presentation' button");
        driver.findElement(formOfPresentation).click();


    }

    public void clickBuyButton() {
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton).click();

    }

    public void clickCategoriesOption() {
        LOG.info("CLick 'Categories' option");
        driver.findElement(categoriesButton).click();
    }

    public void clickVitaminsOption() {
        sleep(3000L);
        LOG.info("Click 'Vitamins' option");
        driver.findElement(clickVitaminsOption).click();
    }
}