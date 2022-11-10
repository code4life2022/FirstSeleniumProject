package code4life.tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement color  = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(color);

        // 1. select by visible text
       // select.selectByVisibleText("Purple");
        // 2. Select by index
        //select.selectByIndex(3);

        //3. select by value
        select.selectByValue("3");
        
        boolean test = select.isMultiple();
        System.out.println("test = " + test);

        List<WebElement> allColors = select.getOptions();

        for (WebElement eachColor:allColors) {
            System.out.println(eachColor.getText());
        }

        Thread.sleep(2000);

        driver.quit();
    }
}
