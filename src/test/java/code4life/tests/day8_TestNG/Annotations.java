package code4life.tests.day8_TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Annotations {

    WebDriver driver;
    @BeforeSuite
    public void runBeforeEntireSuite(){
        System.out.println("@BeforeSuite runs before entire test suite only once ");
    }
    @AfterSuite
    public void runAfterEntireSuite(){
        System.out.println("@AfterSuite runs after entire test suite only once ");
    }

    @BeforeClass
    public void runBeforeClass(){
        System.out.println("@BeforeClass: This runs before the entire class only one time ");
    }

    @AfterClass
    public void runAfterClass(){
        System.out.println("@AfterClass: This runs after the entire class only once ");
    }


   @BeforeMethod
    public void setupDriver(){
       System.out.println("@BeforeMethod : This is before method ");
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       driver.manage().window().maximize();
       driver.get("https://www.saucedemo.com/");
   }

   @Test( groups = "reg")
   public void a(){
       System.out.println("This is a regression");
       System.out.println("This is the test login 1");

//       String actual = "Swag Labs";
//       Assert.assertEquals(actual, driver.getTitle());

   }

   @Test( groups = "reg")
   public void b(){
       System.out.println("This is a regression");
       System.out.println("This is test case 2 ");


//       WebElement username = driver.findElement(By.id("user-name"));
//       username.sendKeys("standard_user");
//
//       driver.findElement(By.id("password")).sendKeys("secret_sauce");
//       driver.findElement(By.id("login-button")).click();
//       String expect = driver.findElement(By.xpath("//span[text()='Products']")).getText();
//
//       Assert.assertEquals("PRODUCTS", expect);

   }

   @Test (groups = "smoke")
   public void c(){
       System.out.println("This is  a smoke test ");
       System.out.println("This is test 3");
   }

    @Test(groups = "smoke")
    public void e(){
        System.out.println("This is is a smoke test");
        System.out.println("This is test 4");
    }

   @AfterMethod
    public void teardown() throws InterruptedException {
       System.out.println("@AfterMethod: this is after method ");
       Thread.sleep(3000);
       driver.quit();
   }

    @BeforeTest
    public void runBeforeTest(){
        System.out.println("@Before Test : This runs before the entire test case only once");
    }

    @AfterTest
    public void runAfterTest(){
        System.out.println("@After Test : This runs after entire test cases only once ");
    }



}
