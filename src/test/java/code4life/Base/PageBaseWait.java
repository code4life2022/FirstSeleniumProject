package code4life.Base;

import code4life.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class PageBaseWait {
 public   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

   public Actions actions = new Actions(Driver.getDriver());
  public   JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

    public PageBaseWait() throws IOException {
    }
}
