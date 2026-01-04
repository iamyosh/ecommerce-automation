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

    private By product1 = By.cssSelector("a.add-to-cart[data-product-id='2']");
    private By product2 = By.cssSelector("a.add-to-cart[data-product-id='3']");
    private By continueShoppingButton = By.cssSelector("button.close-modal");
    private By modal = By.className("modal-content");

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

    public void addProductsToCart(){
        //product 1
        driver.findElement(product1).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();    //popup window

        wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));

        //product 2
        driver.findElement(product2).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();    //popup window

        wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));
    }

    public void goToCart(){

    }
}
