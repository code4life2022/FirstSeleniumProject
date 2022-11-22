package code4life.tests.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        WebElement frameLink = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        frameLink.click();
        WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
        frames.click();


        int frameSize = driver.findElements(By.tagName("iframe")).size();
        System.out.println("number of the existing frame in this page = "+ frameSize);
        WebElement firstIframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(firstIframe);


        WebElement iframeText  = driver.findElement(By.xpath("//h1[text()='This is a sample page'] "));
        System.out.println(iframeText.getText());

        driver.switchTo().defaultContent();

        WebElement browserWin = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        browserWin.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
