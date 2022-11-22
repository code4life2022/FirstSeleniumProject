package code4life.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        WebElement simpleAlert = driver.findElement(By.id("alertButton"));
        simpleAlert.click();
        Alert alert = driver.switchTo().alert();

        String expectedText = alert.getText();

        String actualText = "You clicked a button";
        if (expectedText.equals(actualText)){
            System.out.println("Text is matched!! passed");
        } else {
            System.out.println("Text is not matched !! sorry Failed ");
        }

        Thread.sleep(3000);

        driver.quit();

    }
}
