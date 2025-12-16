package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.Productspage;

public class ProductsTest extends BaseTest{

    @Test
    public void testProductsScrolling()throws InterruptedException{
        Homepage homepage1 = new Homepage(driver);
        homepage1.clickProductsLink();

        Assert.assertTrue(driver.getTitle().contains("Products"));

        productspage.scroll();


    }


}
