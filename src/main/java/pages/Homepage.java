package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By productsLink = By.xpath("//a[@href='/products']");
//    private By signupLink = By.xpath("//a[@href='login']");

    public Homepage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));   //wait 5 secs for something to be clickable/visible
    }


    public void scrollDown()throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scroll(0,800)");  //scroll down

        Thread.sleep(2000);
        jse.executeScript("window.scroll(0,-800)"); //scroll back up

    }

    public Productspage clickProductsLink(){
        wait.until(ExpectedConditions.elementToBeClickable(productsLink)).click();
        return new Productspage(driver);
    }


}

