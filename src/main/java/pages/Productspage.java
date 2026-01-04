package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Productspage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By signupLink = By.xpath("//a[@href='/login']");

    public Productspage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void scroll() throws InterruptedException{
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,9000)");

        Thread.sleep(2000);
        js.executeScript("window.scroll(0,-9000)");
    }

    public Signuppage goToSignup() {
        driver.findElement(signupLink).click();
        return new Signuppage(driver);
    }
}
