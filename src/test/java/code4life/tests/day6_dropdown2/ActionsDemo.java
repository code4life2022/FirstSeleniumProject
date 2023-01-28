package code4life.tests.day6_dropdown2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        //executeScript("arguments[0].click();", button);
        executor.executeScript("window.scrollBy(0, 700)");

        WebElement interactions = driver.findElement(By.xpath("//h5[text()='Interactions']"));

        Actions actions = new Actions(driver);

        //First method to perform drag and drop
        actions.moveToElement(interactions).click().build().perform();
        executor.executeScript("window.scrollBy(0, 500)");
        WebElement droppable = driver.findElement(By.xpath("//span[text()='Droppable']"));
        actions.moveToElement(droppable).click().build().perform();

        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropHere = driver.findElement(By.id("droppable"));
        String color  = dropHere.getCssValue("background-color");
        System.out.println(" color before drag and drop = " + color);

        actions.dragAndDrop(dragMe,dropHere).build().perform();
        String color2  = dropHere.getCssValue("This is the wrong color ");
        System.out.println("color after drag and drop = "+ color2);
        Thread.sleep(3000);

        driver.quit();
    }

}
