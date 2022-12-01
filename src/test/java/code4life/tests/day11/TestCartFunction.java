package code4life.tests.day11;

import code4life.Base.TestBase;
import code4life.pages.CartPage;
import code4life.pages.LoginPage;
import code4life.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCartFunction extends TestBase {

    @Test
    public void verifyCartFunctionality() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText(ConfigurationReader.getValue("user"));
        page.sendPasswordText(ConfigurationReader.getValue("pass"));
        page.clickLoginBtn();
        CartPage cart = new CartPage();
        cart.clickBackPack();
        cart.clickBike();
        cart.clickTShirt();
        cart.clickCart();
        int actualSize = 3;
        int expectSize = cart.returnCartItemsNumber();
        Assert.assertEquals(actualSize, expectSize);
    }
}
