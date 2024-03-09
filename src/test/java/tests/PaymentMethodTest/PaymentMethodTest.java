package tests.PaymentMethodTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class PaymentMethodTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(PaymentMethodTest.class);
    private String newUrl = getBaseUrl();
    private Object sleep;


    @Test
    public void payment() {
        driver.get(newUrl);

        LOG.info("Click 'Buy' button");
        purchasePage.clickBuyButton();

        LOG.info("Click second 'Buy' button");
        purchasePage.clickBuyButton2();

        LOG.info("Click third 'Buy' button");
        purchasePage.clickBuyButton3();

        LOG.info("Click 'Cart' icon");
        purchasePage.clickCartIcon();

        LOG.info("Click 'Finish order' button");
        purchasePage.clickFinishOrderButton();

        LOG.info("Select 'Sameday standard' option");
        paymentMethodPage.clicksamedayStandardBox();

        LOG.info("Select 'Sameday Locker option");
        paymentMethodPage.clicksamedayLockerBox();

        LOG.info("Select 'Payment upon delivery' option");
        paymentMethodPage.clickPaymentUponDeliveryBox();

        LOG.info("Select 'Payment upon delivery' option");
        paymentMethodPage.clickPaymentByCard();

        LOG.info("Click 'Lockers map' button");
        paymentMethodPage.clickLockersMap();

//        LOG.info("Click 'Drop point' option");
//        paymentMethodPage.clickDropPoint();

        LOG.info("Click 'Coupon' button");
        paymentMethodPage.clickCouponButton();













    }
}