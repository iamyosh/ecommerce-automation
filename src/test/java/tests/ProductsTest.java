package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Productspage;
import pages.Signuppage;

public class ProductsTest extends BaseTest{

    private Signuppage signuppage;

    @Test
    public void testProductsScrolling()throws InterruptedException{

        Assert.assertTrue(driver.getTitle().contains("Products"));

        productspage.scroll();
        signuppage = productspage.goToSignup();

    }


}
