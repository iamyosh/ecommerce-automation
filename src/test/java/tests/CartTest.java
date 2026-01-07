package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Productspage;
import pages.SignupFormpage;
import pages.Signuppage;

public class CartTest extends BaseTest{
    private WebDriver driver;
    private Signuppage signuppage;
    private SignupFormpage signupFormpage;
    private Productspage productspage;

    @Test
    public void testCart(){
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "fjf@gmail.com");

        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();

        productspage = signupFormpage.backToProducts();
        productspage.scroll();
        productspage.addProductsToCart();;
        productspage.goToCart();
    }
}
