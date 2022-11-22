package code4life.tests.day9;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
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

    @DataProvider(name = "provider")
    public Object [][] testDataProvider(){


        return new Object[][]{

                {"standard_user", "secret_sauce", },
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "Secret_sauce"},

                {"standard_user", "secret_sauce", },
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "Secret_sauce"}




        };




    }

    @Test(dataProvider = "provider")  //juma   ===>  Dyncorp
    public void testMultipleLogin(String username, String password){
    driver.findElement(By.id("user-name")).sendKeys(username);
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.id("login-button")).click();


    }


}
