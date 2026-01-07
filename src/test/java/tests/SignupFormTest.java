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
    private Productspage productspage;

    @Test
    public void OptionsTest(){

        // homepage → Signup (navigation happens here)
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "wlloo@gmail.com");

        // Move to full signup form page
        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();

        //signupform -> products
        productspage = signupFormpage.backToProducts();
    }
}
