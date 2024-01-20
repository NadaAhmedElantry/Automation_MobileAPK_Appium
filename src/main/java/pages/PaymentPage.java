package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.security.PublicKey;

public class PaymentPage extends PageBase
{
    public By Fullname = MobileBy.AccessibilityId("Full Name* input field");
    public By AddrssLine1 = MobileBy.AccessibilityId("Address Line 1* input field");
    public By AddrssLine2 = MobileBy.AccessibilityId("Address Line 2 input field");
    public By City = MobileBy.AccessibilityId("City* input field");
    public By state = MobileBy.AccessibilityId("State/Region input field");
    public By Zipcode =MobileBy.AccessibilityId("Zip Code* input field");
    public By Country = MobileBy.AccessibilityId("Country* input field");
    public By payment = MobileBy.AccessibilityId("To Payment button");
    // Fill card details
    public By SecondFullname = By.xpath("//android.widget.EditText[@content-desc=\"Full Name* input field\"]");
    public By CardNum = MobileBy.AccessibilityId("Card Number* input field");
    public By ExpirationDate = MobileBy.AccessibilityId("Expiration Date* input field");
    public By SecurityCode = MobileBy.AccessibilityId("Security Code* input field");
    public By ReviewOrder = MobileBy.AccessibilityId("Review Order button");
    public By PlaceOrder = MobileBy.AccessibilityId("Place Order button");
    // Review and complete payment
    public By Checkout = By.xpath("//android.view.ViewGroup[@content-desc=\"checkout complete screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
    public By continueshopping = MobileBy.AccessibilityId("Continue Shopping button");
    public By homepage = By.xpath("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");



    public PaymentPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void Payment() {
        waitElementLoaded(Fullname ,40);
        MobileElement Addfullname = (MobileElement) driver.findElement(Fullname);
        Addfullname.sendKeys("Testing test");
        MobileElement AddAddressline1 = (MobileElement) driver.findElement(AddrssLine1);
        AddAddressline1.sendKeys("Address line 1");
        MobileElement AddAddressline2 = (MobileElement) driver.findElement(AddrssLine2);
        AddAddressline2.sendKeys("Address line 2");
        MobileElement Addcity = (MobileElement) driver.findElement(City);
        Addcity.sendKeys("Cairo");
        MobileElement Addstate = (MobileElement) driver.findElement(state);
        Addstate.sendKeys("Maadi");
        scrollDown();
        MobileElement AddZipcode = (MobileElement) driver.findElement(Zipcode);
        AddZipcode.sendKeys("24680");
        MobileElement Addcountry = (MobileElement) driver.findElement(Country);
        Addcountry.sendKeys("Egypt");
        MobileElement ClickPayment = (MobileElement) driver.findElement(payment);
        ClickPayment.click();
        // fill card details
        waitElementLoaded(CardNum ,40);
        MobileElement AddCardNum = (MobileElement) driver.findElement(CardNum);
        AddCardNum.sendKeys("325812657568789");
        MobileElement AddSecondfullname = (MobileElement) driver.findElement(SecondFullname);
        AddSecondfullname.sendKeys("Testing test1");
        MobileElement AddExpirationDate = (MobileElement) driver.findElement(ExpirationDate);
        AddExpirationDate.sendKeys("0325");
        MobileElement Addsecuritycode = (MobileElement) driver.findElement(SecurityCode);
        Addsecuritycode.sendKeys("123");
        MobileElement ClickReviewOrder = (MobileElement) driver.findElement(ReviewOrder);
        ClickReviewOrder.click();
        waitElementLoaded(PlaceOrder ,40);
        MobileElement clickPlaceOrder = (MobileElement) driver.findElement(PlaceOrder);
        clickPlaceOrder.click();
        waitElementLoaded(Checkout ,40);
        MobileElement CheckCheckout = (MobileElement) driver.findElement(Checkout);
        Assert.assertEquals(CheckCheckout.getText(),"Checkout Complete");
        MobileElement clickContinue = (MobileElement) driver.findElement(continueshopping);
        clickContinue.click();
        waitElementLoaded(homepage ,40);
        MobileElement Gotohomepage = (MobileElement) driver.findElement(homepage);
        Assert.assertEquals(Gotohomepage.getText(),"Products");
    }

}
