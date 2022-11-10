package code4life.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "/Users/code4life/Downloads/chromedriver");
//        WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://amazon.com");
        driver.navigate().refresh();
        Thread.sleep(2000);
        String googleTitle = driver.getTitle();

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);
//        if (googleTitle.equalsIgnoreCase("Google")){
//            System.out.println("test passed !!!");
//        } else {
//            System.out.println("Test failed ");
//        }




        //driver.navigate().to("https://amazon.com");
        driver.quit();
    }
}
