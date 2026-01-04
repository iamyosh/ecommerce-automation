package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class SignupFormpage {
    private WebDriver driver;
    private WebDriverWait wait;

    //Step 2 fields
    private By titleMr = By.id("id_gender1");
//  private By titleMrs = By.id("id_gender2");

    private By password = By.id("password");
    private By day = By.id("days");
    private By month = By.id("months");
    private By year = By.id("years");

    private By firstName = By.id("first_name");
    private By lastName = By.id("last_name");
    private By company = By.id("company");
    private By address = By.id("address1");

    private By country = By.id("country");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zip = By.id("zipcode");
    private By mobile = By.id("mobile_number");

    private By createAccountButton = By.xpath("//button[@data-qa='create-account']");
    private By continueButton = By.xpath("//a[@data-qa='continue-button']");

    public SignupFormpage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    //Enter the data
    public void fillSignupForm(){
        driver.findElement(titleMr).click();
        driver.findElement(password).sendKeys("12345");

        new Select(driver.findElement(day)).selectByValue("28");
        new Select(driver.findElement(month)).selectByVisibleText("March");
        new Select(driver.findElement(year)).selectByValue("2003");

        driver.findElement(firstName).sendKeys("Yosh");
        driver.findElement(lastName).sendKeys("Yaakov");
        driver.findElement(company).sendKeys("None");
        driver.findElement(address).sendKeys("West Road");

        new Select(driver.findElement(country)).selectByVisibleText("India");

        driver.findElement(state).sendKeys("Western Province");
        driver.findElement(city).sendKeys("Colombo");
        driver.findElement(zip).sendKeys("12131");
        driver.findElement(mobile).sendKeys("0778921621");

        driver.findElement(createAccountButton).click();
        driver.findElement(continueButton).click();     //back to homepage
    }


}
