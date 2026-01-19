package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    private By homeButton = By.cssSelector(".btn.btn-success");

    private By subscribeEmail = By.id("susbscribe_email");
    private By subscribeButton = By.id("subscribe");
    private By scrollUpButton = By.id("scrollUp");
    private By logoutLink = By.xpath("//a[@href='/logout']");


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
    public void backHome(){
        wait.until(ExpectedConditions.elementToBeClickable(homeButton)).click();
    }

    public void subscription(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(subscribeEmail)).sendKeys("helloalexis@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(subscribeButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(scrollUpButton)).click();
    }

    public LogoutPage gotoLogout(){
        wait.until(ExpectedConditions.elementToBeClickable(logoutLink)).click();
        return new LogoutPage(driver);
    }
}
