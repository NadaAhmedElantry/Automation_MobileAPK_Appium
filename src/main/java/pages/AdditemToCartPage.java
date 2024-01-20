package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdditemToCartPage extends PageBase
{
    public By SelectItem = By.xpath("//android.view.ViewGroup[@content-desc=\"store item\"])[1]/android.view.ViewGroup[1]/android.widget.ImageView");
    public By Addtocart = By.id("Add To Cart button");
    public By CartItem = By.xpath("//android.view.ViewGroup[@content-desc=\"cart badge\"]/android.widget.ImageView");
    public By proceedtocheckout = By.id("Proceed To Checkout button");

    public void AdditemToCart()
    {
        waitElementLoaded(SelectItem,50);
        MobileElement Selectitem1 = (MobileElement) driver.findElement(SelectItem);
        Selectitem1.click();
        MobileElement Additemtocart = (MobileElement) driver.findElement(Addtocart);
        Additemtocart.click();
        MobileElement Clickcartitem = (MobileElement) driver.findElement(CartItem);
        Clickcartitem.click();
        waitElementLoaded(proceedtocheckout,50);
        MobileElement checkout = (MobileElement) driver.findElement(proceedtocheckout);
        checkout.click();

    }

    public AdditemToCartPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }

}
