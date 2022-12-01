package code4life.pages;

import code4life.Base.PageBaseWait;
import code4life.utilities.BrowserUtils;
import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class About  extends PageBaseWait {



    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
    By mainMenu = By.xpath("//button[@id='react-burger-menu-btn']");
    By aboutBtn = By.id("about_sidebar_link");
    By tryIfFreeBtn = By.xpath("(//span[text()='Try it free']) [2]");

    By freeTrialLabel = By.id("tagline");


    public About() throws IOException {
    }

    public void clickMainMenu() throws IOException {
       // wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(mainMenu))).click();
        BrowserUtils.wait(3);
       // actions.moveToElement(Driver.getDriver().findElement(mainMenu)).click();
      //  Driver.getDriver().findElement(mainMenu).click();
        executor.executeScript("arguments[0].click();", Driver.getDriver().findElement(mainMenu));

    }

    public void clickAboutBtn() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(aboutBtn))).click();
    }

    public void clickTryItFreeBtn() throws IOException {
        //wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(tryIfFreeBtn)));

        executor.executeScript("arguments[0].click();", Driver.getDriver().findElement(tryIfFreeBtn));
    }

    public String returnFreeTrialText() throws IOException {
     return    wait.until(ExpectedConditions.visibilityOf(Driver.getDriver().findElement(freeTrialLabel))).getText();
    }
}
