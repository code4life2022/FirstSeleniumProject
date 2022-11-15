package code4life.tests.day6_dropdown2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Dropdown2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();                //Duration.OfSecond(30)
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get("https://demoqa.com/select-menu");

        //Get the first selected value from dropdown with getFirstSelectedOption().getText() and then verify with actual value
        WebElement car = driver.findElement(By.id("cars"));
        Select selectCar = new Select(car);
        selectCar.selectByVisibleText("Opel");

        String actualText = "Opel";

        if (actualText.equals(selectCar.getFirstSelectedOption().getText())){
            System.out.println("TEST PASSED!!!");
        } else {
            System.out.println("TEST FAILED!!!");
        }
//get all selected values from dropdown with method getAllSelectedOptions and then print all selected options
        Select multiCars = new Select(car);
        multiCars.selectByVisibleText("Volvo");
        multiCars.selectByVisibleText("Saab");
        multiCars.selectByVisibleText("Opel");

        List<WebElement > carList = multiCars.getAllSelectedOptions();
        for (WebElement e : carList) {
            System.out.println(e.getText());
        }


        Thread.sleep(2000);

        driver.quit();
    }
}
