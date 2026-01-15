package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.*;

public class ContactUsTest extends BaseTest{
    protected WebDriver driver;
    private Signuppage signuppage;
    private SignupFormpage signupFormpage;
    private Productspage productspage;
    private CartPage cartPage;
    private PaymentPage paymentPage;
    private ContactUsPage contactUsPage;

    @Test
    public void setContact()throws InterruptedException{
        //home -> signup
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "ududddd@gmail.com");

        //signup -> signup form
        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();

        //signup form -> products
        productspage = signupFormpage.backToProducts();
        productspage.scroll();
        productspage.addProductsToCart();;

        //products -> cart
        cartPage = productspage.goToCart();
        cartPage.clickCheckout();
        cartPage.scrollPage();

        //cart -> payment
        paymentPage = cartPage.goToPayment();
        paymentPage.PaymentDetails();

        //payment -> contact
        contactUsPage = paymentPage.goToContact();
        contactUsPage.EnterDetails();
    }
}
