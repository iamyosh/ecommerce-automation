package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Loginpage {
    private WebDriver driver;

    private By loginEmail = By.xpath("/input[@data-qa='login-email']");
    private By loginPassword = By.xpath("//input[@data-qa='login-password']");
    private By loginButton = By.xpath("//button[@data-qa='login-button']");


    public Loginpage(WebDriver driver){
        this.driver = driver;
    }

    public void setLogin(String email, String password){
        driver.findElement(loginEmail).sendKeys(email);
        driver.findElement(loginPassword).sendKeys(password);
        driver.findElement(loginButton).click();
    }


}
