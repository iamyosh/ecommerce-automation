package tests;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.Loginpage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        Loginpage loginpage = new Loginpage(driver);
        loginpage.setLogin("test@example.com", "123456");
    }

    @AfterMethod
    public void takeScreenshot(){
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);

        try {
            Files.createDirectories(Paths.get("resources/screenshots"));
            Files.move(
                    screenshot.toPath(),
                    Paths.get("resources/screenshots/BUG-001-failed-login.png"),
                    StandardCopyOption.REPLACE_EXISTING
            );
        } catch (IOException exception) {
            exception.printStackTrace();
         }

    }
}
