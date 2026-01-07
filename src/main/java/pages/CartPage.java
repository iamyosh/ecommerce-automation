package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By proceedToCheckoutButton = By.cssSelector(".btn.btn-default.check_out");
    private By comment = By.cssSelector("textarea.form-control");
    private By placeOrder = By.cssSelector(".btn.btn-default.check_out");

    public CartPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickCheckout(){
        WebElement checkOut = driver.findElement(proceedToCheckoutButton);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0], scrollIntoView(true)", checkOut);
        jse.executeScript("arguments[0], click()", checkOut);
    }

    public void scrollPage()throws InterruptedException{
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scroll(0,900)");  //scroll down

        driver.findElement(comment).sendKeys("I would like the T-shirt in black color. Thank you");

        WebElement order = driver.findElement(placeOrder);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0], scrollIntoView(true)", order);
        js.executeScript("arguments[0], click()", order);
    }

    public

}
