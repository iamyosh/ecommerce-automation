package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ContactUsPage {
    protected WebDriver driver;
    private WebDriverWait wait;
    private By nameField = By.cssSelector("input[placeholder='Name']");
    private By emailField = By.cssSelector("input[placeholder='Email']");
    private By subjectField = By.cssSelector("input[placeholder='Subject']");
    private By messageField = By.cssSelector("textarea[placeholder='Your Message Here']");
    private By submitButton = By.cssSelector(".btn.btn-primary.pull-left.submit_form");

    public ContactUsPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void EnterDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).sendKeys("Alexis Yosh");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).sendKeys("helloo@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(subjectField)).sendKeys("Hi!");
        wait.until(ExpectedConditions.visibilityOfElementLocated(messageField)).sendKeys("Would like to get in touch. Thank you.");
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();

    }
}
