package code4life.pages;

import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;

public class CartPage {
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
    By backPack = By.id("add-to-cart-sauce-labs-backpack");
    By bikeLight = By.id("add-to-cart-sauce-labs-bike-light");
    By shirt = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By cart = By.id("shopping_cart_container");
    By cartListItems = By.xpath("//div[@class='cart_item']");


    public CartPage() throws IOException {
    }


    public void clickBackPack() throws IOException {
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(backPack))).click();


        //Driver.getDriver().findElement(backPack).click();
    }

    public void clickBike(){
        wait.until(ExpectedConditions.elementToBeClickable(bikeLight)).click();
    }

    public void clickTShirt(){

        wait.until(ExpectedConditions.elementToBeClickable(shirt)).click();
    }

    public void clickCart(){
        wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
    }

    public int returnCartItemsNumber() throws IOException {
        List<WebElement> cartList = Driver.getDriver().findElements(cartListItems);

        int size = cartList.size();

        return size;
    }
}
