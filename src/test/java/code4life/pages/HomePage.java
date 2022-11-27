package code4life.pages;

import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class HomePage {



    By productText = By.xpath("//span[text()='Products']");



    public String returnProductText() throws IOException {

        String text = Driver.getDriver().findElement(productText) .getText();


        return text;
    }


}
