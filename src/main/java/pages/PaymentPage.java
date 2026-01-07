package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }
}
