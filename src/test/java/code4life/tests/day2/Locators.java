package code4life.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");


        WebElement  usernameField  = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.name("login-button"));
        loginBtn.click();
        WebElement bikeLink = driver.findElement(By.linkText("Sauce Labs Bike Light"));
        bikeLink.click();
        driver.navigate().back();
        Thread.sleep(3000);

        WebElement bikePartialLink = driver.findElement(By.partialLinkText("Bike Light"));
        bikePartialLink.click();
        driver.navigate().back();

        List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

        for (WebElement eachLink:listOfLinks) {
            System.out.println(eachLink.getText());
        }





        Thread.sleep(3000);

        driver.quit();

    }
}
