package code4life.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassName {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        WebElement usernameListLabel = driver.findElement(By.tagName("h4"));

        String actual  = "Accepted usernames are:";
        if (usernameListLabel.getText().equals(actual)){
            System.out.println("passed!!!!");
        } else {
            System.out.println("Failed ");
        }

        WebElement usernameField  = driver.findElement(By.id("user-name"));
        usernameField.sendKeys("djdjdkdjkdjdkd");
        Thread.sleep(2000);
        usernameField.clear();
        Thread.sleep(2000);
        usernameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginBtn = driver.findElement(By.name("login-button"));
        loginBtn.click();

        List<WebElement> classSize = driver.findElements(By.className("social_twitter"));
        System.out.println("classSize = " + classSize.size());
        
        System.out.println("Size of the class is =  " + classSize.size());

        Thread.sleep(3000);

        driver.quit();
    }
}
