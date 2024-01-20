package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    public By sidemenu = By.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView");
    public By login = By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
    public By clickonuser = By.xpath("//android.view.ViewGroup[@content-desc=\"bob@example.com-autofill\"]/android.widget.TextView");
    public By LoginButton = MobileBy.AccessibilityId("Login button");
    public LoginPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void ClickOnLogin() {

        waitElementLoaded(sidemenu , 20);
        MobileElement Clickonsidemenu = (MobileElement) driver.findElement(sidemenu);
        Clickonsidemenu.click();
        waitElementLoaded(login , 20);
        MobileElement Clickonlogin = (MobileElement) driver.findElement(login);
        Clickonlogin.click();
        waitElementLoaded(clickonuser , 20);
        MobileElement Clickonuserlink = (MobileElement) driver.findElement(clickonuser);
        Clickonuserlink.click();
        MobileElement ClickonLoginButton = (MobileElement) driver.findElement(LoginButton);
        ClickonLoginButton.click();
    }

}
