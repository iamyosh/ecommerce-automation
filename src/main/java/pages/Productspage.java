package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Productspage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By product1 = By.cssSelector("a.add-to-cart[data-product-id='2']");
    private By product2 = By.cssSelector("a.add-to-cart[data-product-id='3']");
    private By continueShoppingButton = By.cssSelector("button.close-modal");
    private By modal = By.className("modal-content");
    private By cartLink = By.xpath("//a[@href='/view_cart']");

    public Productspage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void scroll(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scroll(0,800)");   //scroll down
        js.executeScript("window.scroll(0,-800)");  //scroll back up
    }

    public void addProductsToCart(){
        //product 1
        wait.until(ExpectedConditions.elementToBeClickable(product1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();    //popup window

        wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));     //make sure the popup is closed

        //product 2
        wait.until(ExpectedConditions.elementToBeClickable(product2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton)).click();    //popup window

        wait.until(ExpectedConditions.invisibilityOfElementLocated(modal));
    }

    public CartPage goToCart(){
        driver.findElement(cartLink).click();
        return new CartPage(driver);

    }
}
