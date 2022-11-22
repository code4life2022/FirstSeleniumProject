package code4life.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TypeInUpperCase {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();          //Duration.ofSeconds(30)
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        Actions actions = new Actions(driver);
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("window.scrollBy(0,700)");

    WebElement elements = driver.findElement(By.xpath("//h5[text()='Elements']"));
   actions.moveToElement(elements).click().build().perform();

    WebElement textBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
    actions.moveToElement(textBox).click().build().perform();

    WebElement fullNameField = driver.findElement(By.id("userName"));

    actions.keyDown(fullNameField, Keys.SHIFT)
                    .sendKeys("Hillary Clinton").build().perform();


    WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));

    //Enum
        actions.keyDown(currentAddress, Keys.SHIFT)
                .sendKeys(currentAddress, "This is my current address  \n")
                .keyUp(currentAddress, Keys.SHIFT)
                .sendKeys("Brendan court Troy New York ").doubleClick().contextClick()
            .build().perform();

    Thread.sleep(5000);
    driver.quit();

    }
}
