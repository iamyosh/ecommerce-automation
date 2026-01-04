package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrderProductsPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By product1 = By.cssSelector("a.add-to-cart[data-product-id='2']");
    private By product2 = By.cssSelector("a.add-to-cart[data-product-id='3']");
    private By continueShoppingButton = By.cssSelector("button.close-modal");


    public OrderProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public void addToCart(){
        driver.findElement(product1).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton));    //popup window
        continueButton.click();

        driver.findElement(product2).click();
        continueButton = wait.until(ExpectedConditions.elementToBeClickable(continueShoppingButton));    //popup window
        continueButton.click();
    }

    public
}
