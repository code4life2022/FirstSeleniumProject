package code4life.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class BrowserUtils {

    public static void wait(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getScreenshot(String name ) throws IOException {
        Date d = new Date();
        name = d.toString().replace(":", "_").replace(" ", "_");
        String path ="";
        System.out.println(System.getProperty("os.name"));
        if (System.getProperty("os.name").equalsIgnoreCase("Mac OS X")){
            System.out.println("mac sentence has been executed ");
            path = System.getProperty("user.dir")+"/test-output/screenshots/"+name+".png";
        } else {
            path = System.getProperty("user.dir")+"\\test-output\\screenshots\\"+name+".png";
        }

        System.out.println("screenshot is here : "+ path);

        TakesScreenshot takesScreenshot =(TakesScreenshot) Driver.getDriver();
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(path);
        FileUtils.copyFile(source, destination);


        return path;


    }



}
