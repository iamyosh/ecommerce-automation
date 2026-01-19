package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest{
//    private WebDriver driver;
    private Signuppage signuppage;
    private SignupFormpage signupFormpage;
    private Productspage productspage;
    private CartPage cartPage;
    private PaymentPage paymentPage;

    @Test
    public void testCart() throws InterruptedException {
        //home -> signup
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "uduall@gmail.com");

        //signup -> signup form
        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();

        //signup form -> products
        productspage = signupFormpage.backToProducts();
        productspage.scroll();
        productspage.addProductsToCart();

        //products -> cart
        cartPage = productspage.goToCart();
        cartPage.clickCheckout();
        cartPage.scrollPage();

        //cart -> payment
        paymentPage = cartPage.goToPayment();

    }
}
