package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SignupTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(SignupTest.class);

    @Test
    public void signupTest() {
        Homepage homepage1 = new Homepage(driver);
        homepage1.clickProductsLink();

        Productspage productspage1 = new Productspage(driver);
        productspage1.goToSignup();

        Signuppage signuppage = new Signuppage(driver);
        signuppage.setSignupDetails("Yosh", "yykov@gmail.com");

        SignupFormpage signupFormpage = new SignupFormpage(driver);
        signupFormpage.fillSignupForm();

    }
}