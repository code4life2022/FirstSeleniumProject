package code4life.Base;

import code4life.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class TestBase {

    @BeforeMethod
    public void setup() throws IOException {


        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("terminating the browser");

        Driver.closeDriver();
    }

}
