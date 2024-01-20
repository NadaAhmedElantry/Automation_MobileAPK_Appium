package apptest.tests;

import apptest.tests.TestBase;
import org.testng.annotations.Test;
import pages.BeforeHomePage;
import pages.AdditemToCartPage;

public class AddToCartTest extends TestBase {
    BeforeHomePage beforeHomePage;
    AdditemToCartPage additemToCartPage;

    @Test
    public void Addtocart() {
        beforeHomePage = new BeforeHomePage(driver);
        additemToCartPage = new AdditemToCartPage(driver);
        beforeHomePage.GoToApp();
        additemToCartPage.AdditemToCart();
    }
}
