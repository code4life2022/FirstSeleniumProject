package code4life.pages;

import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {



    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By productLabel = By.xpath("//span[text()='Products']");
    By loginErrorText = By.xpath("//h3[text()='Epic sadface: Username and password do not match any user in this service']");
    By passwordLabel = By.xpath("//h4[text()='Password for all users:']");


    public String returnPasswordText() throws IOException {
       String value =  Driver.getDriver().findElement(passwordLabel).getText();


       return value;
    }

    public String returnLoginErrorText() throws IOException {


        String value = Driver.getDriver().findElement(loginErrorText).getText();

        return value;
    }

    public String returnProductText() throws IOException {

     return    Driver.getDriver().findElement(productLabel).getText();
    }
    public void sendUserNameText(String userText) throws IOException {

        Driver.getDriver().findElement(username).sendKeys(userText);
    }

    public void sendPasswordText(String pass) throws IOException {
        Driver.getDriver().findElement(password).sendKeys(pass);
    }

    public void clickLoginBtn() throws IOException {
        Driver.getDriver().findElement(loginBtn).click();
    }



}
