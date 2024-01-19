package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BeforeHomePage extends PageBase{
    // open Application in mobile
    public By MobileApp=By.xpath("//android.widget.TextView[@content-desc=\"My Demo App\"]");

    public BeforeHomePage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void GoToApp()
    {
        waitElementLoaded(MobileApp,50);
        MobileElement App = (MobileElement) driver.findElement(MobileApp);
        App.click();
    }

}
