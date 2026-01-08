package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By cardName = By.cssSelector(".form-control");
    private By cardNumber = By.cssSelector(".form-control card-number");
    private By cvc = By.cssSelector(".form-control card-cvc");
    private By expMonth = By.cssSelector(".form-control card-expiry-month");
    private By expYear = By.cssSelector(".form-control card-expiry-year");
    private By paymentButton = By.cssSelector(".form-control.btn.btn-primary.submit-button");

    public PaymentPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void PaymentDetails(){
        driver.findElement(cardName).sendKeys("Alexis Yosh");
        driver.findElement(cardNumber).sendKeys("5165416351");
        driver.findElement(cvc).sendKeys("311");
        driver.findElement(expMonth).sendKeys("03");
        driver.findElement(expYear).sendKeys("2029");

        wait.until(ExpectedConditions.elementToBeClickable(paymentButton)).click();
    }
}
