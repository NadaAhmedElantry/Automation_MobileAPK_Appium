package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class PageBase {
    AppiumDriver driver;

    public PageBase(AppiumDriver androidDriver)
    {
        driver = androidDriver;
    }

    protected List<MobileElement> waitElementLoaded(By mobileBy, int sec)
    {
        List<MobileElement> elements;
        long startTime = System.currentTimeMillis();
        do {
            elements = driver.findElements(mobileBy);
            if (elements.size() > 0)
                break;
        } while (System.currentTimeMillis() < startTime + sec * 1000);
        return elements;
    }

    public void waitOperation() {
        try
        {
            Thread.sleep(3000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

   public void scrollDown()
   {
       Dimension dimension = driver.manage().window().getSize();
       int scrollStart = (int) (dimension.getHeight() * 0.8);
       int scrollEnd = (int) (dimension.getHeight() * 0.4);

       AndroidTouchAction actions = new AndroidTouchAction(driver)
               .press(PointOption.point(0,scrollStart))
               .waitAction(waitOptions(Duration.ofSeconds(3)))
               .moveTo(PointOption.point(0,scrollEnd))
               .release()
               .perform();
   }

}
