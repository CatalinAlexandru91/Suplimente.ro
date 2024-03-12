package pages.BottomMenuPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class BottomMenuPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(BottomMenuPage.class);
    public static BottomMenuPage instance;

    private BottomMenuPage() {
    }

    public static BottomMenuPage getInstance() {
        if (instance == null) {
            instance = new BottomMenuPage();
        }
        return instance;
    }

    private By aboutWebsite = By.xpath("//a[text()='Despre GetFIT / suplimente.ro']");
    private By shippingCosts = By.xpath("//a[text()='Costuri de livrare']");
    private By confidentiality = By.xpath("//a[text()='Confidentialitate']");
    private By termsAndConditions = By.xpath("//a[text()='Termeni si Conditii']");
    private By anpc = By.xpath("//a[text()='ANPC']");

    public void clickAboutWebsiteButton() {
        LOG.info("Click 'About website' button");
        driver.findElement(aboutWebsite).click();


    }

    public void clickShippingCostsButton() {
        LOG.info("Click 'Shipping costs' button");
        driver.findElement(shippingCosts).click();

    }

    public void clickConfidentialityButton() {
        LOG.info("Click 'Confidentiality' button");
        driver.findElement(confidentiality).click();
    }

    public void clickTermsAndConditionsButton() {
        LOG.info("Click 'Terms and conditions' button");
        driver.findElement(termsAndConditions).click();
    }

    public void clickANPCButton() {
        LOG.info("Click 'ANPC' button");
        driver.findElement(anpc).click();
    }
}