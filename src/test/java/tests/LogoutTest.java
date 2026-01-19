package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class LogoutTest extends BaseTest{
    private Signuppage signuppage;
    private SignupFormpage signupFormpage;
    private Productspage productspage;
    private CartPage cartPage;
    private PaymentPage paymentPage;
    private ContactUsPage contactUsPage;
    private LogoutPage logoutPage;
    private WebDriverWait wait;

    @Test
    public void setContact()throws InterruptedException {
        //home -> signup
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "qqrrtxww@gmail.com");

        //signup -> signup form
        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();

        //signup form -> products
        productspage = signupFormpage.backToProducts();
        productspage.scroll();
        productspage.addProductsToCart();
        ;

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

        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent()).accept();  //will click ok on alert

        //make sure that we're still on contact us pg url
        Assert.assertTrue(driver.getCurrentUrl().contains("contact_us"));

        contactUsPage.backHome();
        contactUsPage.subscription();

        //contact us -> logout
        logoutPage = contactUsPage.gotoLogout();
        logoutPage.logBack();
    }
}
