package apptest.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.util.TimeUtils;

import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;

public class TestBase {
    public AppiumDriver driver;

    @BeforeClass
    public void SetUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        // kindly insert emulator you use in value
     //   dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        dc.setCapability(MobileCapabilityType.UDID, "PB23215622303");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
    //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void finishTestCase() {
        driver.terminateApp("//android.widget.TextView[@content-desc=\"My Demo App\"]");
    }
}
