package apptest.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
//import java.util.concurrent.TimeUnit;

public class TestBase {
    public AppiumDriver driver;

    @BeforeClass
    public void SetUp() throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        //Nada Elantry POS
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.UDID, "PB23215622303");
        // emulator emulator-5554
        //    dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @AfterClass
    public void finshTestCase() {

        driver.terminateApp("com.saucelabs.mydemoapp.rn");
        driver.quit();
    }

}
