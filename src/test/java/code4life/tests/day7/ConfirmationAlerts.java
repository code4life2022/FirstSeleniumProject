package code4life.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebElement confirmAlert = driver.findElement(By.id("confirmButton"));
        confirmAlert.click();
        Alert conAlert = driver.switchTo().alert();
        String conExpectText = conAlert.getText();
        conAlert.accept();

        String actual = "Do you confirm action?";
        if (conExpectText.equals(actual)){
            System.out.println("confirmed! passed!!!!");
        } else {
            System.out.println("not confirmed ! Failed!!! ");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
