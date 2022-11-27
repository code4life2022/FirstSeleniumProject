package code4life.tests.day10;

import code4life.utilities.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderWithExcel {

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
    @Test(dataProvider ="credentialFromExcel")
    public void loginTestWithExcel(String user, String pass){
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        driver.findElement(By.id("login-button")).click();
    }
    @DataProvider
    public Object [][] credentialFromExcel() throws IOException {
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");


        return  util.return2DArray();


    }
}
