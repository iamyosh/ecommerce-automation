package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;
import pages.Loginpage;
import pages.Productspage;
import pages.Signuppage;

public class BaseTest {

    protected WebDriver driver;
    protected Homepage homepage;
    protected Signuppage signuppage;

    @BeforeMethod
    public void setDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");

        homepage = new Homepage(driver);

        homepage.scrollDown();
        signuppage = homepage.goToSignup();

        //BaseTest only load the initial URL.(that's why the products test etc... are repeated)
        // Beyond that, each test navigates in each test page
    }
}