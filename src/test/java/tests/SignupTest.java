package tests;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SignupTest extends BaseTest {

    private SignupFormpage signupFormpage;
    private Signuppage signuppage;

    private static final Logger log = LoggerFactory.getLogger(SignupTest.class);

    @Test
    public void signupTest() {

        // Navigate from home → Signup
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "fjfyy@gmail.com");

        signupFormpage = signuppage.goToSignupForm();

    }
}