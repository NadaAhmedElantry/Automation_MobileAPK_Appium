package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.security.PublicKey;

public class PaymentPage extends PageBase
{
    public By Fullname = By.id("Full Name* input field");
    public By AddrssLine1 = By.id("Address Line 1* input field");
    public By AddrssLine2 = By.id("Address Line 2 input field");
    public By City = By.id("City* input field");
    public By state = By.id("State/Region input field");
    public By Zipcode = By.id("State/Region input field");
    public By Country = By.id("Country* input field");
    public By payment = By.id("To Payment button");
    // Fill card details
    public By FullName2 = By.id("Full Name* input field");
    public By CardNum = By.id("Card Number* input field");
    public By ExpirationDate = By.id("Expiration Date* input field");
    public By SecurityCode = By.id("Security Code* input field");
    public By ReviewOrder = By.id("Review Order button");
    public By PlaceOrder = By.id("Place Order button");
    // Review and complete payment
    public By Checkout = By.xpath("//android.view.ViewGroup[@content-desc=\"checkout complete screen\"]/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]");
    public By continueshopping = By.id("Continue Shopping button");
    public By homepage = By.id("//android.view.ViewGroup[@content-desc=\"container header\"]/android.widget.TextView");



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
        Addcity.sendKeys("Maadi");
        scrollDown();
        MobileElement AddZipcode = (MobileElement) driver.findElement(Zipcode);
        AddZipcode.sendKeys("24680");
        MobileElement Addcountry = (MobileElement) driver.findElement(Country);
        Addcountry.sendKeys("Egypt");
        MobileElement ClickPayment = (MobileElement) driver.findElement(payment);
        ClickPayment.click();
        // fill card details
        waitElementLoaded(FullName2 ,40);
        MobileElement Addfullname2 = (MobileElement) driver.findElement(FullName2);
        Addfullname2.sendKeys("Testing test1");
        MobileElement AddCardNum = (MobileElement) driver.findElement(CardNum);
        AddCardNum.sendKeys("325812657568789");
        MobileElement AddExpirationDate = (MobileElement) driver.findElement(ExpirationDate);
        AddCardNum.sendKeys("0325");
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
