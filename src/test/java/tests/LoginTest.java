package tests;

import org.testng.annotations.Test;
import pages.Loginpage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        Loginpage loginpage = new Loginpage(driver);
        loginpage.setLogin("test@example.com", "123456");
    }
}
