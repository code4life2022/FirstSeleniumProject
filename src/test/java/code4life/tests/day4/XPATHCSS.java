package code4life.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPATHCSS {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        //implicit  = universal wait because it applies to all elements
        WebElement password = driver.findElement(By.id("password"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        //explicit specifically applies to a sigle or your favorite element


        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys("standard-user");

        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys("secret_sauce");

        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
        driver.quit();






    }
}
