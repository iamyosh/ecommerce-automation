package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;
import pages.Loginpage;
import pages.Productspage;

public class BaseTest {

    protected WebDriver driver;
    protected Homepage homepage;
    protected Productspage productspage;

    @BeforeMethod
    public void setDriver() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");

        homepage = new Homepage(driver);

        homepage.scrollDown();
        productspage = homepage.clickProductsLink();

    }
}
