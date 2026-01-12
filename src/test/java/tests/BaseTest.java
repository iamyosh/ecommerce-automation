package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;
import pages.Loginpage;
import pages.Productspage;
import pages.Signuppage;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected WebDriver driver;
    protected Homepage homepage;
    protected Signuppage signuppage;

    @BeforeMethod
    public void setDriver() throws InterruptedException {
        String downloadPath = System.getProperty("user.dir") + "/resources/downloads";

        ChromeOptions options = new ChromeOptions();

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", downloadPath);
        prefs.put("download.prompt_for_download", false);
        prefs.put("safebrowsing.enabled", true);

        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.get("https://automationexercise.com/");
        homepage = new Homepage(driver);

        homepage.scrollDown();
        signuppage = homepage.goToSignup();

        //BaseTest only load the initial URL.(that's why the products test etc... are repeated)
        // Beyond that, each test navigates in each test page
    }
}