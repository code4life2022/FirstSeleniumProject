package code4life.tests.day11;

import code4life.Base.TestBase;
import code4life.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyPasswordText  extends TestBase {

    @Test
    public void verifyPasswordLabel() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText("user");
        page.sendPasswordText("user");
        page.clickLoginBtn();
        String actual = "Password for all users:";
        String expect = page.returnPasswordText();
        Assert.assertEquals(expect, actual);


    }
}
