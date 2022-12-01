package code4life.tests.day11;

import code4life.Base.TestBase;
import code4life.pages.About;
import code4life.pages.LoginPage;
import code4life.utilities.BrowserUtils;
import code4life.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FreeTrialVerification  extends TestBase {


    @Test
    public void verifyFreeTrialBtn() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText(ConfigurationReader.getValue("user"));
        page.sendPasswordText(ConfigurationReader.getValue("pass"));
        page.clickLoginBtn();
        About abt = new About();
        abt.clickMainMenu();

        BrowserUtils.wait(3);
        abt.clickAboutBtn();
        abt.clickTryItFreeBtn();
        String actual ="Start your free trial today. No credit card required.";
        String expect = abt.returnFreeTrialText();
        Assert.assertEquals(actual, expect);

    }


}
