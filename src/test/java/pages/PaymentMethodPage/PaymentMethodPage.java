//package pages.PaymentMethodPage;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import pages.BasePage;
//
//public class PaymentMethodPage extends BasePage {
//    public static final Logger LOG = LoggerFactory.getLogger(PaymentMethodPage.class);
//    public static PaymentMethodPage instance;
//
//    private PaymentMethodPage() {
//    }
//
//    public static PaymentMethodPage getInstance() {
//        if (instance == null) {
//            instance = new PaymentMethodPage();
//        }
//        return instance;
//    }
//
//    private By clickBuyButton = By.xpath("//a[@onclick=\"addToCart('22513', '1');\"]");
//    private By clickBuyButton2 = By.xpath("//a[@onclick=\"addToCart('23915', '1');\"]");
//    private By clickBuyButton3 = By.xpath("//a[@onclick=\"addToCart('23973', '1');\"]");
//    private By clickCartIcon = By.id("cart");
//    private By clickSeeCartButton = By.xpath("//a[@class=\"button\" and text()='Vezi Coșul']");
//    private By finishOrderButton = By.xpath("//a[@class=\"btn btn-primary button\"]");
//    private By samedayStandardBox = By.xpath("//input[@value=\"flat.flat\"]");
//    private By samedayLockerBox = By.xpath("//input[@value=\"sameday.sameday\"]");
//    private By paymentUponDelivery = By.xpath("//input[@value=\"cod\"]");
//    private By paymentByCard = By.xpath("//input[@value=\"euplatesc\"]");
//    private By lockersMap = By.xpath("//span[@id='samedayShowModal']");
//    //    private By selectDropPoint = By.xpath("//div[@class='locker-plugin-list-item-address' and text()='Cal. Mosilor, Nr. 101']");
//    private By clickCouponButton = By.xpath("//input[@value=\"Utilizeaza Cupon\"]");
//
//
//    public void clickBuyButton() {
//        LOG.info("CLick 'Buy' button");
//        driver.findElement(clickBuyButton).click();
//
//    }
//
//    public void clickBuyButton2() {
//        LOG.info("Click second 'Buy' button");
//        driver.findElement(clickBuyButton2).click();
//
//
//    }
//
//    public void clickBuyButton3() {
//        LOG.info("Click third 'Buy' button");
//        driver.findElement(clickBuyButton3).click();
//
//    }
//
//    public void clickCartIcon() {
//
//        sleep(3000L);
//        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
//        LOG.info("Click 'Cart' icon");
//        driver.findElement(clickCartIcon).click();
//        driver.findElement(clickSeeCartButton).click();
//
//    }
//
//    public void clickFinishOrderButton() {
//        LOG.info("Click 'Finish order' button");
//        driver.findElement(finishOrderButton).click();
//
//    }
//
//    public void clicksamedayStandardBox() {
//        sleep(3000L);
//        LOG.info("Select 'Sameday standard' option");
//        driver.findElement(samedayStandardBox).click();
//
//    }
//
//    public void clicksamedayLockerBox() {
//        sleep(3000L);
//        LOG.info("Select 'Sameday Locker option");
//        driver.findElement(samedayLockerBox).click();
//
//    }
//
//    public void clickPaymentUponDeliveryBox() {
//        LOG.info("Select 'Payment upon delivery' option");
//        driver.findElement(paymentUponDelivery).click();
//
//
//    }
//
//    public void clickPaymentByCard() {
//        LOG.info("Select 'Payment by card' option");
//        driver.findElement(paymentByCard).click();
//
//    }
//
//    public void clickLockersMap() {
//        LOG.info("Click 'Lockers map' button");
//        driver.findElement(lockersMap).click();
//
//
//    }
//
////    public void clickDropPoint() {
////        sleep(3000L);
////        LOG.info("Click 'Drop point' option");
////        driver.findElement(selectDropPoint).click();
//
//
//    public void clickCouponButton() {
//        LOG.info("Click 'Coupon' button");
//        driver.findElement(clickCouponButton).click();
//
//    }
//}