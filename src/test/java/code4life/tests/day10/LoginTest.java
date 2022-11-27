package code4life.tests.day10;

import code4life.Base.TestBase;
import code4life.pages.LoginPage;
import code4life.utilities.BrowserUtils;
import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest  extends TestBase {




    @Test
    public void loginTest() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText(ConfigurationReader.getValue("user"));
        page.sendPasswordText(ConfigurationReader.getValue("pass"));
        page.clickLoginBtn();
        String actualText="PRODUCTS";
        String expectText = page.returnProductText();

        Assert.assertEquals(actualText, expectText);

        BrowserUtils.wait(2);


    }

}
