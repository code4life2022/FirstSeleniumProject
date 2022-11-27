package code4life.tests.day10;

import code4life.Base.TestBase;
import code4life.pages.LoginPage;
import code4life.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCredentialsError  extends TestBase {


    @Test
    public void testWrongPassAndUserNameError() throws IOException {
        LoginPage page = new LoginPage();
        page.sendUserNameText("user");
        page.sendPasswordText("user");
        page.clickLoginBtn();
        
        String actual = "Epic sadface: Username and password do not match any user in this service";
        System.out.println("actual = " + actual);
        String expect = page.returnLoginErrorText();
        System.out.println("expect = " + expect);

        Assert.assertEquals(actual, expect);

        BrowserUtils.wait(2);

     
        
        

    }
}
