package code4life.tests.day6_dropdown2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptInterface {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executeScript("arguments[0].click();", button);
        executor.executeScript("window.scrollBy(0, 700)");

        WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
        executor.executeScript("arguments[0].click();", element);

        Thread.sleep(3000);

        driver.quit();
    }
}
