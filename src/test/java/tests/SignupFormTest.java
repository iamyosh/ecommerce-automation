package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Productspage;
import pages.SignupFormpage;
import pages.Signuppage;

public class SignupFormTest extends BaseTest{

    private SignupFormpage signupFormpage;
    private Signuppage signuppage;

    @Test
    public void OptionsTest(){

        // Products → Signup (navigation happens here)
        signuppage = productspage.goToSignup();
        signuppage.setSignupDetails("Yosh", "yofefj@gmail.com");

        // Move to full signup form page
        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();
    }
}
