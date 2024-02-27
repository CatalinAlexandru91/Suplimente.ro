package tests.LogInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.getBaseUrl;

public class LogInTest extends BaseTest {

    public static final Logger LOG = LoggerFactory.getLogger(LogInTest.class);
    private String newUrl = getBaseUrl() + "cont-login";

    String emailaddress = "suplimente1@gmail.com";

    @Test
    public void logIn() {



    }

}


