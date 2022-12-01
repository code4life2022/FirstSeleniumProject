package code4life.tests.day11;

import code4life.Base.TestBase;
import code4life.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestTitle extends TestBase {

    @Test
    public void verifyTitle() throws IOException {
        Assert.assertEquals("Swag Labs", Driver.getDriver().getTitle());
    }
}
