package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class ProductsTest extends BaseTest{

    private Signuppage signuppage;
    private SignupFormpage signupFormpage;
    private CartPage cartPage;
    private Productspage productspage;

    @Test
    public void testProductsPage() throws InterruptedException{

        //homepage -> signup
        signuppage = homepage.goToSignup();
        signuppage.setSignupDetails("Yosh", "fjfyy@gmail.com");

        //signup -> signup form
        signupFormpage = signuppage.goToSignupForm();
        signupFormpage.fillSignupForm();

        //signupForm -> products
        signupFormpage.backToProducts();

        productspage = new Productspage(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("/products"));

        productspage.scroll();
        productspage.addProductsToCart();

        //products -> cart
        cartPage = productspage.goToCart();
        // Simple cart assertion
        Assert.assertTrue(driver.getCurrentUrl().contains("/view_cart"));

    }

}
