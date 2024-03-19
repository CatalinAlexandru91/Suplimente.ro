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
    private By clickVitaminsOption = By.xpath("//a[text()='VITAMINE']");
    private By clickMultivitaminsOption = By.xpath("//span[@class='sf-name' and text()='Multivitamine (15)']\n");
    private By selectByProducer = By.xpath("//span[@class='sf-name' and text()='Universal Nutrition (2)']\n");
    private By buyButton2 = By.xpath("//a[@onclick=\"addToCart('22497', '1');\"]");
    private By categoriesButton2 = By.xpath("//span[@class='main-menu-text' and text()='CATEGORII PRODUSE']\n");
    private By clickMineralsOption = By.xpath("//a[text()='MINERALE']\n");
    private By clickMultimineralsOption = By.xpath("//span[@class='sf-name' and text()='Multiminerale (10)']\n");
    private By selectProducer2 = By.xpath("//span[@class=\"sf-name\" and contains(text(), \"Nutrend (2)\")]\n");
    private By buyButton3 = By.xpath("//a[@onclick=\"addToCart('24165', '1');\"]");
    private By generalHealthButton = By.xpath("//span[@class=\"main-menu-text\" and contains(text(), \"SANATATE GENERALA\")]\n");
    private By liverAid = By.xpath("//span[@class='sf-name' and text()='Hepatoprotectoare (21)']");
    private By selectProducer3 = By.xpath("//span[@class='sf-name' and text()='Scitec (1)']");
    private By buyButton4 = By.xpath("//a[@onclick=\"addToCart('22626', '1');\"]");
    private By antiOxidants = By.xpath("(//a[text()='Antioxidanti'])[2]");
    private By selectProducer4 = By.xpath("//span[@class=\"sf-name\" and contains(text(), \"Olimp Nutrition (1)\")]\n");
    private By buyButton5 = By.xpath("//a[@onclick=\"addToCart('23779', '1');\"]");
    private By sportsNutrition = By.xpath("//span[@class=\"main-menu-text\" and text()=\"NUTRITIE SPORTIVA\"]\n");
    private By creatineOption = By.xpath("//a[text()='Creatina']");
    private By selectProducer5 = By.xpath("//span[@class='sf-name' and text()='Dymatize (2)']");
    private By buyButton6 = By.xpath("//a[@onclick=\"addToCart('22577', '1');\"]/span[@class=\"button-cart-text\"][text()=\"Cumpără\"]\n");
    private By sportsNutrition2 = By.xpath("//span[@class=\"main-menu-text\" and text()=\"NUTRITIE SPORTIVA\"]\n");
    private By protein = By.xpath("//a[text()='Proteine']");
    private By selectProducer6 = By.xpath("//span[@class=\"sf-name\" and contains(text(), \"Optimum Nutrition (6)\")]\n");
    private By selectFlavour = By.xpath("//span[@class=\"sf-name\" and contains(text(), \"Strawberry (1)\")]\n");
    private By buyButton7 = By.xpath("//a[@onclick=\"addToCart('22603', '1');\"]");
    private By selectFlavour2 = By.xpath("//span[text()='Double Rich Chocolate']\n");
    private By buyButton8 = By.xpath("//span[@class='button-cart-text' and text()='Cumpără']");
    private By producersButton = By.xpath("//span[@class=\"main-menu-text\" and text()=\"PRODUCĂTORI\"]\n");
    private By universalNutrition = By.xpath("//a[text()='Universal Nutrition']");
    private By producersButton2 = By.xpath("//span[@class=\"main-menu-text\" and text()=\"PRODUCĂTORI\"]\n");
    private By closePopUp = By.xpath("//button[@data-e4-item-id='22603']");
    private By optimumNutrition = By.xpath("//a[text()='Optimum Nutrition']");

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
        sleep(2000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton).click();

    }

    public void clickCategoriesOption() {
        sleep(3000L);
        LOG.info("CLick 'Categories' option");
        driver.findElement(categoriesButton).click();
    }

    public void clickVitaminsOption() {
        sleep(3000L);
        LOG.info("Click 'Vitamins' option");
        driver.findElement(clickVitaminsOption).click();
    }

    public void clickMultivitaminsOption() {
        LOG.info("Click 'Multivitamins' option");
        driver.findElement(clickMultivitaminsOption).click();

    }

    public void clickByProducer() {
        LOG.info("Click 'Select by producer' option");
        driver.findElement(selectByProducer).click();

    }

    public void clickBuyButton2() {
        sleep(3000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton2).click();

    }

    public void clickCategoriesOption2() {
        LOG.info("CLick 'Categories' option");
        driver.findElement(categoriesButton2).click();

    }

    public void clickMineralsOption() {
        sleep(3000L);
        LOG.info("Click 'Minerals' option");
        driver.findElement(clickMineralsOption).click();

    }

    public void clickMultiMineralsOption() {
        LOG.info("Click 'Multiminerals' option");
        driver.findElement(clickMultimineralsOption).click();

    }

    public void clickselectProducerButton2() {
        LOG.info("Click 'Select producer' button");
        driver.findElement(selectProducer2).click();

    }

    public void clickBuyButton3() {
        sleep(2000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton3).click();

    }

    public void clickGeneralHealthButton() {
        sleep(3000L);
        LOG.info("Click 'General health' button");
        driver.findElement(generalHealthButton).click();

    }

    public void clickLiverAidOption() {
        sleep(3000L);
        LOG.info("Click 'Liver aid' option");
        driver.findElement(liverAid).click();

    }

    public void clickProducerButton3() {
        LOG.info("Click 'Select producer' button");
        driver.findElement(selectProducer3).click();

    }

    public void clickBuyButton4() {
        sleep(3000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton4).click();

    }

    public void clickAntioxidantsOption() {
        sleep(2000L);
        LOG.info("Click 'Antioxidants' option");
        driver.findElement(antiOxidants).click();

    }

    public void clickProducerButton4() {
        sleep(3000L);
        LOG.info("Click 'Select producer' button");
        driver.findElement(selectProducer4).click();

    }

    public void clickBuyButton5() {
        sleep(2000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton5).click();

    }

    public void clickSportsNutritionOption() {
        sleep(2000L);
        LOG.info("Click 'Sports nutrition' option");
        driver.findElement(sportsNutrition).click();

    }

    public void clickCreatineOption() {
        sleep(2000L);
        LOG.info("Click 'Creatine' option");
        driver.findElement(creatineOption).click();

    }

    public void clickProducerButton5() {
        sleep(7000L);
        LOG.info("Click 'Select producer' button");
        driver.findElement(selectProducer5).click();

    }

    public void clickBuyButton6() {
        sleep(3000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton6).click();
    }

    public void clickSportsNutritionOption2() {
        sleep(2000L);
        LOG.info("Click 'Sports nutrition' option");
        driver.findElement(sportsNutrition2).click();
    }

    public void clickProteinOption() {
        LOG.info("Click 'Protein' option");
        driver.findElement(protein).click();
    }

    public void clickProducerButton6() {
        sleep(2000L);
        LOG.info("Click 'Select producer' button");
        driver.findElement(selectProducer6).click();

    }

    public void selectFlavour() {
        LOG.info("Click 'Flavour' button");
        driver.findElement(selectFlavour).click();

    }

    public void clickBuyButton7() {
        sleep(3000L);
        LOG.info("Click 'Buy' button");
        driver.findElement(buyButton7).click();
    }

    public void selectFlavour2() {
        sleep(3000L);
        LOG.info("Select protein flavour");
        driver.findElement(selectFlavour2).click();
    }

    public void clickBuyButton8() {
        LOG.info("Click 'buy' button");
        driver.findElement(buyButton8).click();
    }


    public void clickProducersButton() {
        sleep(3000L);
        LOG.info("Click 'Producers' button");
        driver.findElement(producersButton).click();

    }

    public void clickUniversalNutrition() {
        sleep(2000L);
        LOG.info("Click 'Universal Nutrition' button");
        driver.findElement(universalNutrition).click();

    }

    public void clickProducersButton2() {
        sleep(2000L);
        LOG.info("Click 'Producers' button");
        driver.findElement(producersButton2).click();

    }

    public void clickClosePopUp() {
        sleep(3000L);
        LOG.info("Close popup");
        driver.findElement(closePopUp).click();

    }

    public void clickOptimumNutrition() {
        sleep(2000L);
        LOG.info("Click 'Optimum Nutrition' button");
        driver.findElement(optimumNutrition).click();

    }
}