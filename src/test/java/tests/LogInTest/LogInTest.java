package tests.LogInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.*;

public class LogInTest extends BaseTest {
    public static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);
    private String newUrl = getBaseUrl(); {
    }
}

//    String emailaddress = "alex.tarachiu91@gmail.com";
//    String password = "Suplimente123";
//
//    @Test
//    public void logIn() {
//        driver.get(newUrl);


//        LOG.info("Click 'Account' button");
//        logInPage.clickAccountButton();
//
//        LOG.info("Click 'Email' field");
//        logInPage.insertEmailAddress(emailaddress);
//
//        LOG.info("Insert password");
//        logInPage.insertPassword(password);
//
//        LOG.info("Click 'Authentification' button");
//        logInPage.clickLogInButton();




//    }

//}


