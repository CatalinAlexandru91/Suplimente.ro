package tests.MainMenuTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;
import static pages.BasePage.*;

public class MainMenuTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(MainMenuTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;

    @Test
    public void mainmenu() {
        driver.get(newUrl);


        LOG.info("Click 'Promotions' button");
        mainMenuPage.clickPromotionsButton();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickselectProducerButton();

        LOG.info("Click 'Select type' button");
        mainMenuPage.clickSelectType();

        LOG.info("Click 'Form of presentation' button");
        mainMenuPage.clickFormOfPresentation();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton();

        LOG.info("Click 'Categories' option");
        mainMenuPage.clickCategoriesOption();

        LOG.info("Click 'Vitamins' option");
        mainMenuPage.clickVitaminsOption();

        LOG.info("Click 'Multivitamins' option");
        mainMenuPage.clickMultivitaminsOption();

        LOG.info("Click 'Select by producer' option");
        mainMenuPage.clickByProducer();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton2();

        LOG.info("Click 'Categories' option");
        mainMenuPage.clickCategoriesOption2();

        LOG.info("Click 'Minerals' option");
        mainMenuPage.clickMineralsOption();

        LOG.info("Click 'Multiminerals' option");
        mainMenuPage.clickMultiMineralsOption();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickselectProducerButton2();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton3();

        LOG.info("Click 'General health' button");
        mainMenuPage.clickGeneralHealthButton();

        LOG.info("Click 'Liver aid' option");
        mainMenuPage.clickLiverAidOption();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickProducerButton3();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton4();

        LOG.info("Click 'Antioxidants' option");
        mainMenuPage.clickAntioxidantsOption();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickProducerButton4();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton5();

        LOG.info("Click 'Sports nutrition' option");
        mainMenuPage.clickSportsNutritionOption();

        LOG.info("Click 'Creatine' option");
        mainMenuPage.clickCreatineOption();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickProducerButton5();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton6();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton5();

        LOG.info("Click 'Sports nutrition' option");
        mainMenuPage.clickSportsNutritionOption2();

        LOG.info("Click 'Protein' option");
        mainMenuPage.clickProteinOption();

        LOG.info("Click 'Select producer' button");
        mainMenuPage.clickProducerButton6();

        LOG.info("Click 'Flavour' button");
        mainMenuPage.selectFlavour();

        LOG.info("Click 'Buy' button");
        mainMenuPage.clickBuyButton7();

        LOG.info("Select protein flavour");
        mainMenuPage.selectFlavour2();

        LOG.info("Click 'buy' button");
        mainMenuPage.clickBuyButton8();

        LOG.info("Click 'Producers' button");
        mainMenuPage.clickProducersButton();

        LOG.info("Click 'Universal Nutrition' button");
        mainMenuPage.clickUniversalNutrition();

        LOG.info("Click 'Producers' button");
        mainMenuPage.clickProducersButton2();

        LOG.info("Close popup");
        mainMenuPage.clickClosePopUp();

        LOG.info("Click 'Optimum Nutrition' button");
        mainMenuPage.clickOptimumNutrition();






    }
}