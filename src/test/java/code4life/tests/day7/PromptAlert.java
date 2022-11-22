package code4life.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        WebElement promptAlert = driver.findElement(By.id("promtButton"));
        promptAlert.click();
        Alert a = driver.switchTo().alert();
        a.sendKeys("Mike");
        a.accept();

        WebElement promptText = driver.findElement(By.id("promptResult"));
        String expected = promptText.getText();
        if (expected.contains("Mike")){
            System.out.println("Mike is found!! Passed ");
        } else {
            System.out.println("Mike is not found !! Failed ");
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
