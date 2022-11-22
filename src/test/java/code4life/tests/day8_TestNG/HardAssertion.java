package code4life.tests.day8_TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertion {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("terminating the browser");

        driver.quit();
    }

    @Test
    public void verifyTitle(){
        System.out.println("Beginning of the test case ");
        String actualTitle = "Swag Labs";
        String expectedTitle = driver.getTitle();

        ///Assert.assertEquals(5, 9);//hard assertion

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(2,2);
        System.out.println("End of the test case ");

        softAssert.assertAll();

    }


}
