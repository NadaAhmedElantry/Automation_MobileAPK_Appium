package apptest.tests.BusinessPayment;

import apptest.tests.TestBase;
import org.testng.annotations.Test;
import pages.BeforeHomePage;
import pages.LoginPage;
import pages.AdditemToCartPage;
import pages.PaymentPage;

public class PaymentTest extends TestBase {
    BeforeHomePage beforeHomePage;
    PaymentPage paymentPage;
    AdditemToCartPage additemToCartPage;

    @Test
    public void Payment() {
        beforeHomePage = new BeforeHomePage(driver);
        paymentPage = new PaymentPage(driver);
        additemToCartPage = new AdditemToCartPage(driver);
        additemToCartPage.AdditemToCart();
        beforeHomePage.GoToApp();
        paymentPage.Payment();
    }
}
