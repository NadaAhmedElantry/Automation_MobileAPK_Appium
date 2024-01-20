package apptest.tests;

import apptest.tests.TestBase;
import org.testng.annotations.Test;
import pages.BeforeHomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
    BeforeHomePage beforeHomePage;
    LoginPage loginPage;


    @Test
    public void Login() {
        beforeHomePage = new BeforeHomePage(driver);
        loginPage = new LoginPage(driver);
        beforeHomePage.GoToApp();
        loginPage.ClickOnLogin();

    }
}
