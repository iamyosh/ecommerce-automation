package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.jar.JarEntry;

public class LogoutPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By loginEmail = By.xpath("//input[@data-qa='login-email']");
    private By loginPassword = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.cssSelector("button[data-qa='login-button']");

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void logBack(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmail)).sendKeys("qqrrtxww@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginPassword)).sendKeys("12345");

        WebElement loginBtn = wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", loginBtn);
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }
}
