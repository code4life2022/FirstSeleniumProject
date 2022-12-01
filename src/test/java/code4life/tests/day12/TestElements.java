package code4life.tests.day12;

import code4life.Base.ReportTestBase;
import code4life.pages.ElementsPage;
import code4life.utilities.Driver;
import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestElements extends ReportTestBase {

    ElementsPage e = new ElementsPage();


    public TestElements() throws IOException {
    }

    @Test
    public void verifyTextBoxLabel() throws IOException {
        ExtentTest test = extent.createTest("verify text box");
        e.clickElements();
        e.clickTextBox();
        e.sendFullName();
        e.clickSubmitBtn();
        String actual = "Name:Bill Gate";
        String expect = e.returnNameText();

        if (actual.equals(expect)){
            test.pass("Text box label successfully verified");
        } else {
            test.fail("Text Box label verification failed");
        }
        Assert.assertEquals(actual, expect);


    }

    @Test
    public void verifyTitle () throws IOException {
        ExtentTest test = extent.createTest("Verify Title");

        if (Driver.getDriver().getTitle().equals("ToolsQA")){
            test.pass("test input successfully passed!!!!");
        } else {
            test.fail("Title verification failed!!!!");

        }

        Assert.assertEquals("ToolsQA", Driver.getDriver().getTitle());
    }
}
