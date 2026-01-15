package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By cardName = By.cssSelector(".form-control");
    private By cardNumber = By.cssSelector(".form-control.card-number");
    private By cvc = By.cssSelector(".form-control.card-cvc");
    private By expMonth = By.cssSelector(".form-control.card-expiry-month");
    private By expYear = By.cssSelector(".form-control.card-expiry-year");
    private By paymentButton = By.cssSelector(".form-control.btn.btn-primary.submit-button");
    private By downloadInvoiceButton = By.cssSelector(".btn.btn-default.check_out");
    private By continueButton = By.cssSelector(".btn.btn-primary");
    private By contactUsLink = By.xpath("//a[@href='/contact_us']");

    public PaymentPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void PaymentDetails() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cardName)).sendKeys("Alexis Yosh");

        WebElement cardNo = wait.until(ExpectedConditions.presenceOfElementLocated(cardNumber));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", cardNo);
        js.executeScript("arguments[0].value='5165416351';", cardNo);           //entering card no (js used here to avoid all ads tht appear)

        driver.findElement(cvc).sendKeys("311");
        driver.findElement(expMonth).sendKeys("03");
        driver.findElement(expYear).sendKeys("2029");

        wait.until(ExpectedConditions.elementToBeClickable(paymentButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }

        //download invoice
//        public void downloadInvoice(){
//            wait.until(ExpectedConditions.elementToBeClickable(downloadInvoiceButton)).click();
//        }

    public ContactUsPage goToContact(){
        driver.findElement(contactUsLink).click();
        return new ContactUsPage(driver);
    }

}
