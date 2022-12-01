package code4life.Base;

import code4life.utilities.ConfigurationReader;
import code4life.utilities.Driver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class ReportTestBase {
        public ExtentReports extent;
        public ExtentSparkReporter spark;


    @BeforeTest
    public void beforeTest() throws IOException {

        extent = new ExtentReports();
        spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("MyReport");

        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getValue("site2"));

    }


    @AfterTest
    public void afterTest(){
        extent.flush();
        Driver.closeDriver();
    }
}
