package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class Signuppage {

    private WebDriver driver;

    //Step 1 fields
    private By signupName = By.xpath("//input[@data-qa='signup-name']");
    private By signupEmail = By.xpath("//input[@data-qa='signup-email']");
    private By signupButton = By.xpath("//button[@data-qa='signup-button']");

    public Signuppage(WebDriver driver){
        this.driver = driver;
    }

    public void setSignupDetails(String name, String email){
        driver.findElement(signupName).sendKeys(name);
        driver.findElement(signupEmail).sendKeys(email);
        driver.findElement(signupButton).click();
    }

}
